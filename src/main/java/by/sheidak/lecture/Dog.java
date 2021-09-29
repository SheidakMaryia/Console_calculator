package by.sheidak.lecture;

import by.sheidak.lecture.Animal;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {

    @Value("Test Dog")//позволяет примитивное значение зассетить внутрь поля
    private String dog;

//    public Dog(@Value("Test Dog!") String dog) {
//        this.dog = dog;
//    }

    @Override
    public String toString() {
        return "Dog{" +
                "dog='" + dog + '\'' +
                '}';
    }
}
