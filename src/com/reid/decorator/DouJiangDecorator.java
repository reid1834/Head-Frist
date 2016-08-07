package com.reid.decorator;

/**
 * Created by Reid on 2016/8/7 0007.
 */
public class DouJiangDecorator extends DecoratorCoffee {

    private Coffee coffee;

    public DouJiangDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + 豆浆装饰者";
    }

    @Override
    public float cost() {
        return coffee.cost() + 0.8f;
    }
}
