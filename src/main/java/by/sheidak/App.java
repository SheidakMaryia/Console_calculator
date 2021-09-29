package by.sheidak;

//create archetype -> maven-archetype-quickstart

import by.sheidak.hw.Calculator;
import by.sheidak.hw.MyConfiguration;
import by.sheidak.lecture.RootConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main( String[] args )
    {
        //from lecture
        // создаем пустой спринговый контекст, который будет искать свои бины по аннотациям в указанном пакете(классе)
//        ApplicationContext acExample = new AnnotationConfigApplicationContext(RootConfiguration.class);
//        Object user = acExample.getBean("user");
//        System.out.println(user);


        //hw
        ApplicationContext ac = new AnnotationConfigApplicationContext(MyConfiguration.class);
        Calculator calculator = ac.getBean("calculator", Calculator.class);
        calculator.run();
    }
}
