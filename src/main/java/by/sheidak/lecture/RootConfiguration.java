package by.sheidak.lecture;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
//@ComponentScan(basePackages = "by.sheidak") //где сканировать мои компоненты
public class RootConfiguration {
    //only JavaBase configuration here i can see now

//
//    @Bean
//    public User user(Cat cat, Dog dog){//description for container that it must create this bean
//        //injection
//        return new User(cat, dog);
//    }
//
//    @Bean
//    public Cat cat(@Value("Test Cat2") String name){
//        return new Cat(name);
//    }
//
//    @Bean
//    public Dog dog(@Value("Test Dog2") String name){
//        return new Dog(name);
//    }


    //Annotation base configuration
    //в этом классе только указать две аннотации @component and @componentScan

}
