package exercise;

/**
 * @projectName: JavaWeb
 * @className: Calculator
 * @link:
 * @author: AaronLi
 * @description: <p>小明定义的计算器</p>
 * <p>注释测试资源</p>
 * @date: 2022/7/14 下午4:40
 * @version: JDK17
 * @since: 1.5
 */
public class Calculator {

    @Check
    //加法
    public void add() {
        String str = null;
        str.toString();
        System.out.println("1+0=" + (1 + 0));
    }

    @Check
    //减法
    public void sub() {
        System.out.println("1-0=" + (1 - 0));
    }

    @Check
    //乘法
    public void mul() {
        System.out.println("1*0=" + (1 * 0));
    }

    @Check
    //除法
    public void div() {
        System.out.println("1/0=" + (1 / 0));
    }

    public void show() {
        System.out.println("never has bug!!");
    }
}
