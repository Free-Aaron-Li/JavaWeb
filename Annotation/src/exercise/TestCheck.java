package exercise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.reflect.Method;

/**
 * @projectName: JavaWeb
 * @className: TestCheck
 * @link:
 * @author: AaronLi
 * @description: <p>通过使用注释进行测试检验</p>
 * @date: 2022/7/14 下午4:45
 * @version: JDK17
 * @since: 1.5
 */
public class TestCheck {
    public static void main(String[] args) throws Exception {

        //1.创建计算器对象
        Calculator calculator = new Calculator();
        //2.获取字节码文件对象
        Class cls = calculator.getClass();
        //3.获取所有方法
        Method[] methods = cls.getMethods();
        //4.判断方法上是否有Check注解
        int number = 0;//出现异常的次数
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("bug.txt"));

        for (Method method : methods) {
            if (method.isAnnotationPresent(Check.class)) {
                //5.有，执行
                try {
                    method.invoke(calculator);
                } catch (Exception e) {
                    //6.捕获异常
                    number++;
                    //7.记录到文件中
                    bufferedWriter.write(method.getName() + "方法出现异常了");
                    bufferedWriter.newLine();
                    bufferedWriter.write("异常名称：" + e.getCause().getClass().getSimpleName());
                    bufferedWriter.newLine();
                    bufferedWriter.write("异常原因：" + e.getCause().getMessage());
                    bufferedWriter.newLine();
                    bufferedWriter.write("--------------------------------------------");
                    bufferedWriter.newLine();
                }
            }
        }
        bufferedWriter.write("本次测试一共出现"+number+"次异常！！");
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
