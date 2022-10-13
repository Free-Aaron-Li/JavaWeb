package com.singleton;

/**
 * @projectName: JavaWeb_Workspace
 * @className: Test2
 * @link:
 * @author: AaronLi
 * @description: 单例模式的懒汉式实现
 * @date: 10/13/22 3:40 PM
 * @version: JDK17
 */

public class Test2 {
    public static void main(String[] args) {
        Order order1 = Order.getInstance();
        Order order2 = Order.getInstance();
        System.out.println(order1 == order2);
    }
}

class Order {
    /**
     * 1、私有化类的构造器
     */
    private Order() {
    }

    /**
     * 2、声明当前类对象，没有初始化
     */
    private static Order instance = null;

    /**
     * 3、声明public、static的返回对象类对象的方法
     */
    public static Order getInstance() {
        if (instance == null) {
            instance = new Order();
        }
        return instance;
    }
}