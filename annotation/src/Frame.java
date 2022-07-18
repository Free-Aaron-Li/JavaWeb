import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @projectName: JavaWeb
 * @className: Frame
 * @link:
 * @author: AaronLi
 * @description: <p>通过注解配置文件</p>
 * @date: 2022/7/9 上午10:18
 * @version: JDK17
 */
@Pro(className="AnnoDemo2",methodName="demo")
public class Frame {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        /*
            前提：不能改变该类的任何代码可以创建任意类的对象，可以执行任意方法
         */

        //1.解析注解
        //1.1获取该类的字节码对象
        Class<Frame> frameClass = Frame.class;
        //2.获取上边的注解对象
        //其实就是在内存中生成了一个该注解接口的子类实现对象
        Pro annotation = frameClass.getAnnotation(Pro.class);
        //3.调用注解对象中定义的抽象方法，获取返回值
        String className = annotation.className();
        String  methodName= annotation.methodName();

        //3.加载该类进内存
        Class cls = Class.forName(className);

        //4.创建对象
        //4.1无参
        Object obj = cls.newInstance();

        //5.获取方法对象
        Method method = cls.getMethod(methodName);

        //6.执行方法
        method.invoke(obj);
    }
}
