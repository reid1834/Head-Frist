package com.reid.decorator;

/**
 * Created by Reid on 2016/8/7 0007.
 */
public class CupSize extends DecoratorCoffee {

    private Coffee coffee;

    public CupSize(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + " + coffee.getCupType();
    }

    @Override
    public float cost() {
        float capPrice = 0;

        switch (coffee.getCupSize()) {
            case Coffee.CUP_LARGE:
                capPrice = 0.4f;
                break;
            case Coffee.CUP_MIDDLE:
                capPrice = 0.3f;
                break;
            case Coffee.CUP_SMALL:
                capPrice = 0.2f;
                break;
        }

        return coffee.cost() + capPrice;
    }
}
