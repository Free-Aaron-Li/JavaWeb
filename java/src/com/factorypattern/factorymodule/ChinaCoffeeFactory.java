package com.factorypattern.factorymodule;

import com.factorypattern.Simplefactory.Cappuccino;
import com.factorypattern.Simplefactory.Coffee;
import com.factorypattern.Simplefactory.Latte;

/**
 * 中国咖啡工厂
 *
 * @author Lsj
 */
public class ChinaCoffeeFactory extends CoffeeFactory {

    @Override
    public Coffee[] createCoffee() {
        // TODO Auto-generated method stub
        return new Coffee[]{new Cappuccino(), new Latte()};
    }

}
