package com.factorypattern.abstractfactory;

/**
 * @projectName: JavaWeb_Workspace
 * @className: AmericanDessertFactory
 * @link:
 * @author: AaronLi
 * @description: nothing
 * @date: 10/13/22 4:37 PM
 * @version: JDK17
 */

public class AmericanDessertFactory implements Factory {

    @Override
    public Coffee createCoffee() {   return new AmericanCoffee(); }

    @Override
    public Dessert createDessert() {  return new MatchaMousse(); }
}
