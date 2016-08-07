package com.reid.decorator;

import com.reid.Utils.L;

/**
 * Created by Reid on 2016/8/7 0007.
 */
public class DecoratorMainTest {

    public static void main(String[] args) {
        Coffee coffee = new NatieCoffe(Coffee.CUP_LARGE);
        coffee = new CupSize(coffee);
        coffee = new NaiPaoDecorator(coffee);
        coffee = new NaiPaoDecorator(coffee);
        coffee = new NaiXiDecorator(coffee);
        L.d(coffee.getDescription() + " " + coffee.cost() + "$");

        coffee = new MocaCoffee(Coffee.CUP_MIDDLE);
        coffee = new CupSize(coffee);
        coffee = new DouJiangDecorator(coffee);
        coffee = new NaiXiDecorator(coffee);
        coffee = new NaiXiDecorator(coffee);
        coffee = new NaiPaoDecorator(coffee);
        L.d(coffee.getDescription() + " " + coffee.cost() + "$");
    }
}
