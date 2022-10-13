package com.factorypattern.abstractfactory;

/**
 * @projectName: JavaWeb_Workspace
 * @className: LatteCoffee
 * @link:
 * @author: AaronLi
 * @description: nothing
 * @date: 10/13/22 4:34 PM
 * @version: JDK17
 */

public class LatteCoffee extends Coffee {
    @Override
    public void addMilk() {    System.out.println("给咖啡加奶"); }

    @Override
    public void addSugar() {  System.out.println("给咖啡加糖"); }

    @Override
    public String getName() {  return "拿铁咖啡"; }
}