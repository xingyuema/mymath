package org.example;

import org.apache.poi.hwpf.extractor.WordExtractor;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class ParseQuestions {
  //�ж�ĳ���Ƿ����ԡ�����+�ٺš���ͷ
  private String beginFromInt(String s){
      int i=0;
      while(true){
          boolean flag=false;
         char c=s.charAt(i);
         if (c>='0'&&c<='9') flag=true;
         if (!flag){
             if (i==0) return null;
             if (c=='��') return s.substring(i+1);
             //if (c!='��') return null;
         }
         i++;
      }
  }
  public List<Question> parse(File file){
       List<Question> lists=new ArrayList<>();
       //�ع�
      InputStream in;
      WordExtractor we;
      String[] ss;
      try{
          in=new FileInputStream(file);
          we=new WordExtractor(in);
          ss=we.getParagraphText();
          //һ��һ�α���
          for(int i=0;i<ss.length;) {
              String isProblem = beginFromInt(ss[i]);
              //������ԡ�����+�ٺš���ͷ�Ͷ���һ��
              if (isProblem == null) {
                  i++;
                  continue;
              }

              String selectA, selectB, selectC, selectD, answer;
              Question question ;
              i++;
              if (!(ss[i].startsWith("A��"))) continue;
              selectA = ss[i].substring(2);
              i++;
              if (!(ss[i].startsWith("B��"))) continue;
              selectB = ss[i].substring(2);
              i++;
              if (!(ss[i].startsWith("C��"))) continue;
              selectC = ss[i].substring(2);
              i++;
              if (!(ss[i].startsWith("D��"))) continue;
              selectD = ss[i].substring(2);
              i++;
              if (!(ss[i].startsWith("��ȷ�𰸣�"))) continue;
              answer = ss[i].substring(6).trim();
              question = new Question(selectA, selectB, selectC, selectD, answer, isProblem);
              lists.add(question);
          }
       }catch(Exception e){
          e.printStackTrace();
       }

       return lists;
  }
   public static void main(String []ar){
      File f=new File("src/main/resources/qs.doc");  //�ļ�·������·�� "qs.doc"
       ParseQuestions parseQuestions=new ParseQuestions();
      List<Question> lists= parseQuestions.parse(f);

      for(Question q:lists){
          System.out.println(q.getProblem());
      }
   }
}
