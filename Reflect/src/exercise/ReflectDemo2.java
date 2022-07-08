package exercise;

import domain.Person;

import java.lang.reflect.Field;

/**
 * @projectName: JavaWeb
 * @className: ReflectDemo2
 * @link:
 * @author: AaronLi
 * @description: 获取功能：
 * <p>1.获取成员变量们</p>
 *      <ol type="1" start="1">
 *          <li>Field[]  getFields() </li>
 *           <li>Field getField(String name)</li>
 *           <li>Field[] getDeclaredFields()</li>
 *           <li>Field getDeclaredField(String name)</li>
 *     </ol>
 * <p>2.获取构造方法们</p>
 *      <ol type="1" start="1">
 *          <li>Constructor<?>[]  getConstructors()</li>
 *          <li>Constructor<T>  getConstructor(Class<?>... parameterTypes)</li>
 *          <li>Constructor<?>[]  getDeclaredConstructors()</li>
 *           <li>Constructor<T>  getDeclaredConstructor(Class<?>... parameterTypes)</li>
 *     </ol>
 * <p>3.获取成员方法们</p>
 *     <ol type="1" start="1">
 *         <li>Method[]  getMethods()</li>
 *         <li>Method  getMethod(String name, Class<?>... parameterTypes)</li>
 *         <li>Method[]  getDeclaredMethods()</li>
 *         <li>Method  getDeclaredMethod(String name, Class<?>... parameterTypes)</li>
 *         </ol>
 * <p>4.获取类名</p>
 *      <ol type="1" start="1">
 *          <li>Class<?>[] getClasses()</li>
 *          <li>Class<?>[]  getDeclaredClasses()</li>
 *      </ol>
 * @date: 2022/7/8 上午10:59
 * @version: JDK17
 */
public class ReflectDemo2 {
    public static void main(String[] args) throws Exception {

        //1.获取Person的Class对象
        Class personClass = Person.class;

        /*
         * @date: 2022/7/8 上午11:15
         * @description:
         * <p>1.获取成员变量们</p>
         *       <ol type="1" start="1">
         *           <li>Field[]  getFields() </li>
         *            <li>Field getField(String name)</li>
         *            <li>Field[] getDeclaredFields()</li>
         *            <li>Field getDeclaredField(String name)</li>
         *      </ol>
         */

        //1.Field[] getFields()：仅能获取public修饰的成员变量
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("-----------------------");
        Field a = personClass.getField("a");

        //获取成员变量a的值
        Person person = new Person();
        Object value = a.get(person);
        System.out.println(value);
        //设置a的值
        a.set(person, "张三");
        System.out.println();
        System.out.println(person);

        System.out.println("---------------------");

        //2.Field[] getDeclaredFields()：获取所有的成员变量，不考虑修饰符
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        Field d = personClass.getDeclaredField("d");
        //忽略访问权限修饰符的安全检查
        d.setAccessible(true);//暴力反射
        Object value2 = d.get(person);
        System.out.println(value2);
    }
}
