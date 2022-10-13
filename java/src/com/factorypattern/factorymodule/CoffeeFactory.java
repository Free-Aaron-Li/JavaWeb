package com.factorypattern.factorymodule;

import com.factorypattern.Simplefactory.Coffee;

/**
 * @projectName: JavaWeb_Workspace
 * @className: CoffeeFactory
 * @link:
 * @author: AaronLi
 * @description: nothing
 * @date: 10/13/22 4:16 PM
 * @version: JDK17
 */

public abstract class CoffeeFactory {

    /**
     * 生产可制造的咖啡
     * @return
     */
    public abstract Coffee[] createCoffee();
}


