package exercise;

import domain.Person;

import java.lang.reflect.Constructor;

/**
 * @projectName: JavaWeb
 * @className: ReflectDemo3
 * @link:
 * @author: AaronLi
 * @description: <p>2.获取构造方法们</p>
 * <ol type="1" start="1">
 *      <li>Constructor<?>[]  getConstructors()</li>
 *      <li>Constructor<T>  getConstructor(Class<?>... parameterTypes)</li>
 *      <li>Constructor<?>[]  getDeclaredConstructors()</li>
 *       <li>Constructor<T>  getDeclaredConstructor(Class<?>... parameterTypes)</li>
 * </ol>
 * @date: 2022/7/8 上午11:57
 * @version: JDK17
 */
public class ReflectDemo3 {
    public static void main(String[] args) throws Exception {

        //0.获取Person的Class对象
        Class personClass = Person.class;

        //Constructor<?>[]  getConstructors()
        Constructor[] Constructors = personClass.getConstructors();
        for (Constructor constructor : Constructors) {
            System.out.println(constructor);
        }
        System.out.println("--------------------------");

        Constructor constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);
        //创建对象
        Object person = constructor.newInstance("张三", 23);
        System.out.println(person);

        //创建空参对象1
        Object constructor0 = constructor.newInstance();
        System.out.println(constructor0);

        //创建空参对象2
        Object constructor1 = personClass.newInstance();
        System.out.println(constructor1);
    }
}
