package domain;

/**
 * @projectName: JavaWeb
 * @className: Person
 * @link:
 * @author: AaronLi
 * @description: 测试实验对象类
 * @date: 2022/7/7 下午6:52
 * @version: JDK17
 */
public class Person {
    private String name;
    private int age;
    public String a;
    protected String b;
    String c;
    private String d;
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
                '}';
    }
}
