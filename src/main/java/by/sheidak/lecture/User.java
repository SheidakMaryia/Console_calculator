package by.sheidak.lecture;

import by.sheidak.lecture.Animal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class User {

//    @Autowired//внедренение в поля, можно, но не рекомендуется
//    @Qualifier("cat")//определет какой из бинов нужен
    private Animal cat2;
//    @Autowired
//    @Qualifier("dog")
    private Animal dog2;

    public User(@Qualifier("cat")Animal cat2, @Qualifier("dog") Animal dog2) {
        this.cat2 = cat2;
        this.dog2 = dog2;
    }

    //    public User() {
//    }
//
//    @Autowired //именно этот конструктор Spring должен вызывать
//    public User(Cat cat, Dog dog) {
//        this.cat = cat;
//        this.dog = dog;
//    }

    @Override
    public String toString() {
        return "User{" +
                "cat=" + cat2 +
                ", dog=" + dog2 +
                '}';
    }
}
