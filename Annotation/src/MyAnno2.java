/**
 * @projectName: JavaWeb
 * @annotationName: MyAnno2
 * @author: AaronLi
 * @description: nothingd
 * @date: 2022/7/9 下午12:27
 * @version: JDK17
 */
public @interface MyAnno2 {
    int age();

    //默认赋值后，可以不用再赋值
    String name() default "张三";

    Person person();

    MyAnno3 annotation3();

    String[] str();
}
