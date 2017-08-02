package cn.sepiggy;

import java.lang.annotation.Repeatable;

public class RepeatableAnnotationTest {
    public static void main(String[] args) {
        Class<SuperMan> superManClass = SuperMan.class;
        // 下面两行有问题？？？j
        Person annotation = superManClass.getDeclaredAnnotation(Person.class);
        System.out.println(annotation.role());
    }
}

@interface Persons {
    Person[] value();
}

@Repeatable(Persons.class)
@interface Person {
    String role() default "";
}

@Person(role="artist")
@Person(role="coder")
@Person(role="PM")
class SuperMan {
}
