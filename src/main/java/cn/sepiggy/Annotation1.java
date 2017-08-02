package cn.sepiggy;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// 创建一个 Annotation1 标签，并盖上时间戳
@Retention(RetentionPolicy.RUNTIME)
public @interface Annotation1 {
}
