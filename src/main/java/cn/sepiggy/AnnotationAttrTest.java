package cn.sepiggy;

import java.lang.annotation.*;

public class AnnotationAttrTest {
    public static void main(String[] args) {
        Class<C> cClass = C.class;
        // 获取类上的注解
        Annotation4 annotation4 = cClass.getAnnotation(Annotation4.class);
        // 输出注解上的属性
        int id = annotation4.id();
        Object msg = annotation4.msg();
        System.out.println("Class C: id=" + id + ", msg=" + msg);

        Class<D> dClass = D.class;
        annotation4 = dClass.getAnnotation(Annotation4.class);
        id = annotation4.id();
        msg = annotation4.msg();
        System.out.println("Class D: id=" + id + ", msg=" + msg);
    }
}

// 注解的属性也叫做成员变量。注解只有成员变量，没有方法。注解的成员变量在注解的定义中以 “无形参的方法” 形式来声明，其方法名定义了该成员变量的名字，其返回值定义了该成员变量的类型。
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Annotation4 {
    int id() default -1;
    String msg() default "Hi";
}

@Retention(RetentionPolicy.RUNTIME)
@interface Check {
    String value();
}

@Annotation4(id = 3, msg = "hello annotation")
class C {
}

@Annotation4
class D {
}

@Check("hiiiiiii")
class E {
}
