package exercise;

import domain.Person;

import java.lang.reflect.Method;

/**
 * @projectName: JavaWeb
 * @className: ReflectDemo4
 * @link:
 * @author: AaronLi
 * @description: <p>获取成员方法</p>
 * <ol>
 *     <li>Method[]  getMethods()</li>
 *     <li>Method  getMethod(String name, Class<?>... parameterTypes)</li>
 *     <li>Method[]  getDeclaredMethods()</li>
 *     <li>Method  getDeclaredMethod(String name, Class<?>... parameterTypes)</li>
 * </ol>
 * @date: 2022/7/9 上午9:40
 * @version: JDK17
 */
public class ReflectDemo4 {
    public static void main(String[] args) throws Exception {

        //0.获取Person的Class对象
        Class personClass = Person.class;

        //1.获取指定名称的方法
        //1.1获取空参方法
        Method eat_method = personClass.getMethod("eat");
        Person person = new Person();
        //执行方法
        eat_method.invoke(person);

        //1.2获取有参方法
        Method run_method = personClass.getMethod("run", String.class);
        //执行方法
        run_method.invoke(person, "Tom");
        System.out.println("-------------------------");

        //2.获取所有方法，在这里不仅仅只有所看到的本类方法，还有本类父类的方法，例如Object
        Method[] personMethods = personClass.getMethods();
        for (Method method : personMethods) {
            System.out.println(method);
            String name = method.getName();
            System.out.println(name);
            //method.setAccessible(true);
        }

        //3.获取类名
        String name = personClass.getName();
        System.out.println(name);
    }
}
