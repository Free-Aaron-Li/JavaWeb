package exercise;

import domain.Person;

/**
 * @projectName: JavaWeb
 * @className: ReflectDemo1
 * @link:
 * @author: AaronLi
 * @description: <p>获取Class对象的方式：</p>
 * <ol type="1" start="1">
 *    <li>Class.forName("全类名")，将字节码文件加载进内存，返回Class对象。</li>
 *    <li>类名.class，通过类名的属性class获取</li>
 *    <li>对象.getClass()，在Object类中定义着。</li>
 *     </ol>
 * @date: 2022/7/7 下午6:44
 * @version: JDK17
 */
public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {

        //1.Class.forName("全类名")
        Class cls1 = Class.forName("domain.Person");
        System.out.println(cls1);

        //2.类名.Class
        Class cls2 = Person.class;
        System.out.println(cls2);

        //3.对象.getClass()
        Person person = new Person();
        Class cls3 = person.getClass();
        System.out.println(cls3);

        //比较三种方法得到的对象是否为存储在同一个内存地址
        System.out.println(cls1==cls2);
        System.out.println(cls1==cls3);
    }
}
