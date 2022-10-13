package com.factorypattern.abstractfactory;

/**
 * @projectName: JavaWeb_Workspace
 * @className: DessertFactory
 * @link:
 * @author: AaronLi
 * @description: nothing
 * @date: 10/13/22 4:36 PM
 * @version: JDK17
 */

public interface Factory {

    Coffee createCoffee();

    Dessert createDessert();
}