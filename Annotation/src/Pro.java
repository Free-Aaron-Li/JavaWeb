import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @projectName: JavaWeb
 * @annotationName: Pro
 * @author: AaronLi
 * @description: <p>关于Frame类的配置文件</p>
 * <p>描述需要执行的类名和方法名</p>
 * @date: 2022/7/14 下午3:52
 * @version: JDK17
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Pro {

    String className();
    String methodName();
}
