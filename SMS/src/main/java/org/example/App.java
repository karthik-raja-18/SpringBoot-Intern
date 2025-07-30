package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    static ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
    public static void main( String[] args )
    {
        Student s = (Student) context.getBean("st1");
        s.show();
//        s.setAge(-18);
        System.out.println("Roll Number :"+s.getRno()+" Age :"+ s.getAge());
//        Teacher
//        Student s = new Student();
//        System.out.println( "Hello World!" );
    }
}
