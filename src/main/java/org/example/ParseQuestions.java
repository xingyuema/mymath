package org.example;

import org.apache.poi.hwpf.extractor.WordExtractor;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ParseQuestions {
    private int isDigit(String s){
        s=s.trim();
        if (!s.endsWith("¡¢"))

            return -1;
        String s1=s.substring(0,s.length()-1);
        try{
            return Integer.valueOf(s1);
        }catch(Exception e){
            return -1;
        }
    }
  private String isWhat(String content){
      if (content==null) return null;
      return null;
  }
  public List<Map<String,String>> parse(File file){

       List<Map<String,String>> lists=new ArrayList<Map<String,String>>();
       try{
           InputStream in=new FileInputStream(file);
           WordExtractor we=new WordExtractor(in);
           String[] ss=we.getParagraphText();
           for (String s : ss) {
               if (isDigit(s)!=-1)
               System.out.println(s);
           }
       }catch(Exception e){
        e.printStackTrace();
       }
       return lists;
  }
  public static void main(String ar[]){
      ParseQuestions pq=new ParseQuestions();
      pq.parse(new File("src/main/resources/qs.doc"));
  }

}
