package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        User user=new User("zhangsan","管理员","123456");
        switch(user.getUserType()){
            case "员工":
                System.out.println("这是员工");
                break;
            case "管理员":
                System.out.println("这是管理员");
                break;
            default:
                System.out.println("这是其他");
        }

    }
}
