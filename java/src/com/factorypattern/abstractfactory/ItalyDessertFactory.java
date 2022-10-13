package com.factorypattern.abstractfactory;

/**
 * @projectName: JavaWeb_Workspace
 * @className: ItalyDessertFactory
 * @link:
 * @author: AaronLi
 * @description: nothing
 * @date: 10/13/22 4:37 PM
 * @version: JDK17
 */

public class ItalyDessertFactory implements Factory {

    @Override
    public Coffee createCoffee() {   return new LatteCoffee(); }

    @Override
    public Dessert createDessert() {    return new Tiramisu(); }
}
