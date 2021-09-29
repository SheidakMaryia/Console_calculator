package by.sheidak.lecture;

import by.sheidak.lecture.Animal;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {

    @Value("Test Cat")
    private String name;

//    public Cat(String name) {
//        this.name = name;
//    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
