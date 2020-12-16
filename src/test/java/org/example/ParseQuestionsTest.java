package org.example;

import org.junit.Test;

import java.io.File;
import java.util.List;
import static org.junit.Assert.*;


public class ParseQuestionsTest {
    ParseQuestions parseQuestions=new ParseQuestions();
    @Test
    public void testParse1(){

        File f=new File("src/test/resources/testCase1.doc");
        List<Question> list1=parseQuestions.parse(f);
        assertEquals(5,list1.size());
        String []sa1=new String[list1.size()];
        for(int i=0;i<sa1.length;i++) {
            sa1[i] = list1.get(i).getAnswer();
        }
       assertArrayEquals(new String[]{"B","C","C","B","B"},sa1);
        for(Question q:list1){
            System.out.println(q.getProblem()+"**"+q.getA()+"**"+q.getB()+"**"+q.getC()+"**"+q.getD()+"**"+q.getAnswer());
        }
    }
    @Test
    public void testParse2(){
        //以下是第二个测试用例
        File f=new File("src/test/resources/testCase2.doc");
        List<Question> list1=parseQuestions.parse(f);
        assertEquals(5,list1.size());
        String []sa1=new String[list1.size()];
        for(int i=0;i<sa1.length;i++) {
            sa1[i] = list1.get(i).getAnswer();
        }
        System.out.println("你好@");
       assertArrayEquals(new String[]{"B","C","C","B","B"},sa1);
       for(Question q:list1){
           System.out.println(q.getProblem()+"**"+q.getA()+"**"+q.getB()+"**"+q.getC()+"**"+q.getD()+"**"+q.getAnswer());
       }
    }
    @Test
    public void testParse3(){
        //以下是第二个测试用例
        File f=new File("src/test/resources/testCase3.doc");
        List<Question> list1=parseQuestions.parse(f);
        assertEquals(4,list1.size());
        String []sa1=new String[list1.size()];
        for(int i=0;i<sa1.length;i++) {
            sa1[i] = list1.get(i).getAnswer();
        }
      assertArrayEquals(new String[]{"C","C","B","B"},sa1);
        for(Question q:list1){
            System.out.println(q.getProblem()+"**"+q.getA()+"**"+q.getB()+"**"+q.getC()+"**"+q.getD()+"**"+q.getAnswer());
        }
    }
    @Test
    public void testParse4(){
        //以下是第二个测试用例
        File f=new File("src/test/resources/testCase4.doc");
        List<Question> list1=parseQuestions.parse(f);
        assertEquals(4,list1.size());
        String []sa1=new String[list1.size()];
        for(int i=0;i<sa1.length;i++) {
            sa1[i] = list1.get(i).getAnswer();
        }
       assertArrayEquals(new String[]{"B","C","B","B"},sa1);
        for(Question q:list1){
            System.out.println(q.getProblem()+"**"+q.getA()+"**"+q.getB()+"**"+q.getC()+"**"+q.getD()+"**"+q.getAnswer());
        }
    }
    @Test
    public void testParse5(){
        //以下是第二个测试用例
        File f=new File("src/test/resources/testCase6.doc");
        List<Question> list1=parseQuestions.parse(f);
        assertEquals(4,list1.size());
        String []sa1=new String[list1.size()];
        for(int i=0;i<sa1.length;i++) {
            sa1[i] = list1.get(i).getAnswer();
        }
        assertArrayEquals(new String[]{"B","C","B","B"},sa1);
        for(Question q:list1){
            System.out.println(q.getProblem()+"**"+q.getA()+"**"+q.getB()+"**"+q.getC()+"**"+q.getD()+"**"+q.getAnswer());
        }
    }
    @Test
    public void testParse6(){
        //以下是第二个测试用例
        File f=new File("src/test/resources/testCase5.doc");
        List<Question> list1=parseQuestions.parse(f);
        assertEquals(4,list1.size());
        String []sa1=new String[list1.size()];
        for(int i=0;i<sa1.length;i++) {
            sa1[i] = list1.get(i).getAnswer();
        }
       assertArrayEquals(new String[]{"B","C","B","B"},sa1);
        for(Question q:list1){
            System.out.println(q.getProblem()+"**"+q.getA()+"**"+q.getB()+"**"+q.getC()+"**"+q.getD()+"**"+q.getAnswer());
        }
    }

}
