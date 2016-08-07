package com.reid.decorator;

/**
 * Created by Reid on 2016/8/7 0007.
 */
public class NaiXiDecorator extends DecoratorCoffee {

    private Coffee coffee;

    public NaiXiDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + 奶昔装饰者";
    }

    @Override
    public float cost() {
        return 0.3f + coffee.cost();
    }
}
