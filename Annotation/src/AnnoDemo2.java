import java.util.Date;

/**
 * JDK中预定义的一些注解
 * <ol>
 *     <li>@override：检测被该注解标注的方法是否是继承自父类（接口）的</li>
 *     <li>@DepreCated：将该注解标注的内容，表示已过时</li>
 *     <li>@SuppressWarnings：压制警告</li>
 * </ol>
 */
@SuppressWarnings("all")
public class AnnoDemo2 {
    @Override
    public String toString() {
        return "AnnoDemo2{}";
    }

    @Deprecated
    public void show1() {
        //有缺陷
        System.out.println("hahaha");
    }

    @MyAnno2(age=12,person = Person.p1,annotation3=@MyAnno3,str = {"abc","bb"})
    public void show2() {
        //替代show1方法
        System.out.println("hahaha!!");
    }

    public void demo() {
        show1();
        Date date = new Date();
    }
}
