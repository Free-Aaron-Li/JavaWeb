/**
 * @projectName: JavaWeb
 * @annotationName: MyAnno
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/7/9 下午12:05
 * @version: JDK17
 */
public @interface MyAnno {

    //基本数据类型
    int show1();

    //字符串
    String show();

    //枚举
    Person per();

    //注解
    MyAnno2 annotation2();
}
