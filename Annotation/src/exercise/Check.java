package exercise;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @projectName: JavaWeb
 * @annotationName: Check
 * @author: AaronLi
 * @description:
 * @date: 2022/7/14 下午4:31
 * @version: JDK17
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Check {
}
