package com.factorypattern.abstractfactory;

/**
 * @projectName: JavaWeb_Workspace
 * @className: Client
 * @link:
 * @author: AaronLi
 * @description: nothing
 * @date: 10/13/22 4:37 PM
 * @version: JDK17
 */

public class Client {
    public static void main(String[] args) {
        // 想次美式东西
        // AmericanDessertFactory factory = new AmericanDessertFactory();
        // 想换成意大利风味，仅仅只需要换一个工厂类 其他的代码无需改变
        ItalyDessertFactory factory= new ItalyDessertFactory();
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();
        System.out.println(coffee.getName());
        dessert.show();
    }
}
