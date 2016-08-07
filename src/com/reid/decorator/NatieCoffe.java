package com.reid.decorator;

/**
 * Created by Reid on 2016/8/7 0007.
 */
public class NatieCoffe extends Coffee {

    public NatieCoffe(int cupType) {
        super(cupType);
    }

    @Override
    public String getDescription() {
        return "拿铁咖啡";
    }

    @Override
    public float cost() {
        return 1.0f;
    }
}
