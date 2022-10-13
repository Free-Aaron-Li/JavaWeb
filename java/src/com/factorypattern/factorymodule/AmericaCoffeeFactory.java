package com.factorypattern.factorymodule;

import com.factorypattern.Simplefactory.Americano;
import com.factorypattern.Simplefactory.Coffee;
import com.factorypattern.Simplefactory.Latte;

/**
 * 美国咖啡工厂
 *
 * @author Lsj
 */
public class AmericaCoffeeFactory extends CoffeeFactory {

    @Override
    public Coffee[] createCoffee() {
        return new Coffee[]{new Americano(), new Latte()};
    }
}
