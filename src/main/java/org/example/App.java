package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        User user=new User("zhangsan","����Ա","123456");
        switch(user.getUserType()){
            case "Ա��":
                System.out.println("����Ա��");
                break;
            case "����Ա":
                System.out.println("���ǹ���Ա");
                break;
            default:
                System.out.println("��������");
        }

    }
}
