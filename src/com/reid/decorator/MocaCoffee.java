package com.reid.decorator;

/**
 * Created by Reid on 2016/8/7 0007.
 */
public class MocaCoffee extends Coffee {

    public MocaCoffee(int cupType) {
        super(cupType);
    }

    @Override
    public String getDescription() {
        return "摩卡咖啡";
    }

    @Override
    public float cost() {
        return 1.5f;
    }
}
