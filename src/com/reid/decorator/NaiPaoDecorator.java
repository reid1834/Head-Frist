package com.reid.decorator;

/**
 * Created by Reid on 2016/8/7 0007.
 */
public class NaiPaoDecorator extends DecoratorCoffee {
    private Coffee coffee;

    public NaiPaoDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + 奶泡装饰者";
    }

    @Override
    public float cost() {
        return 0.5f + coffee.cost();
    }
}
