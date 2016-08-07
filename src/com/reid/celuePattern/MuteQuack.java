package com.reid.celuePattern;

/**
 * Created by Reid on 2016/8/7 0007.
 */
public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
