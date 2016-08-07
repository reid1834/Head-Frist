package com.reid.celuePattern;

/**
 * Created by Reid on 2016/8/7 0007.
 */
public class MuDuck extends Duck {

    public MuDuck() {
        flyBehavior = new FlyNoWings();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("我是木鸭子");
    }
}


