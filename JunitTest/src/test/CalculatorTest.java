package test;

import Junit.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @projectName: JavaWeb
 * @className: CalculatorTest
 * @link:
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/7/5 下午10:22
 * @version: JDK17
 */

public class CalculatorTest {

    /**
     * @date: 2022/7/5 下午11:05
     * @description: <p>初始化方法</p>
     * <p>用于资源申请，所有测试方法在执行之前都会执行该方法</p>
     */
    @BeforeEach
    public void init() {
        System.out.println("init……");
    }

    /**
     * @date: 2022/7/5 下午11:09
     * @description: <p>释放资源方法</p>
     * <p>在所有测试方法执行完后，都会自动执行该方法</p>
     */
    @AfterEach
    public void close() {
        System.out.println("after……");
    }

    /**
     * @date: 2022/7/5 下午10:22
     * @description: 测试add方法
     */
    @Test
    public void testAdd() {
        System.out.println("我被执行了");

        //1.创建计算器对象
        Calculator calculator = new Calculator();
        //2.调用add方法
        int result = calculator.add(1, 2);
        System.out.println(result);
        //3.断言：我断言这个结果
        Assertions.assertEquals(3, result);
    }

    /**
     * @date: 2022/7/5 下午11:01
     * @description: 测试subtract方法
     */
    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(1, 2);
        System.out.println("testSubtract……");
        Assertions.assertEquals(-1, result);
    }
}
