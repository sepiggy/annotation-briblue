package cn.sepiggy;

import java.lang.annotation.Annotation;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class InheritedAnnotaionTest {
    public static void main(String[] args) {
        Class<B> bClass = B.class;
        Annotation[] annotations = bClass.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
    }
}

// 如果一个超类被 @Inherited 注解过的注解进行注解的话，那么如果它的子类没有被任何注解应用的话，那么这个子类就继承了超类的注解。
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@interface Annotation2 {
}

@Retention(RetentionPolicy.RUNTIME)
@interface Annotation3 {
}

@Annotation2
class A {}

@Annotation3
class B extends A {}


