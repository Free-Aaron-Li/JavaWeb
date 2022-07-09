package exercise;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @projectName: JavaWeb
 * @className: Frame
 * @link:
 * @author: AaronLi
 * @description: <p>假设的框架类</p>
 * @date: 2022/7/9 上午10:18
 * @version: JDK17
 */
public class Frame {
    public static void main(String[] args) throws Exception {
        //可以创建任意类的对象，可以执行任意方法

        /*
            前提：不能改变该类的任何代码
         */

        //1.加载配置文件
        //1.1创建properties对象
        Properties properties = new Properties();
        //1.2加载配置文件，转化为一个集合
        //1.2.1获取class目录下的配置文件
        ClassLoader classLoader = Frame.class.getClassLoader();
        InputStream streamDate = classLoader.getResourceAsStream("properties");
        properties.load(streamDate);

        //2.获取配置文件中定义的数据
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

        //3.加载该类进内存
        Class cls = Class.forName(className);

        //4.创建对象
        //4.1无参
        Object obj = cls.newInstance();

        //4.2有参
        Constructor constructor = cls.getConstructor(String.class, int.class);
        Object obj1 = constructor.newInstance("张三", 23);

        //5.获取方法对象
        Method method = cls.getMethod(methodName, String.class);

        //6.执行方法
        method.invoke(obj,"Tom");
    }
}
