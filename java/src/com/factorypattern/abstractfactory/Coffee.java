package com.factorypattern.abstractfactory;

/**
 * @projectName: JavaWeb_Workspace
 * @className: Coffee
 * @link:
 * @author: AaronLi
 * @description: nothing
 * @date: 10/13/22 4:33 PM
 * @version: JDK17
 */

public abstract class Coffee {
    public abstract void addMilk();
    public abstract void addSugar();
    public abstract String getName();
}
