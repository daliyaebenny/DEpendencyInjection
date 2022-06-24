package org.genspark.annotations;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {

        AbstractApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
        Student obj=(Student) context.getBean("student");
        obj.show();
    }
}



