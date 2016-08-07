package com.reid.celuePattern;

/**
 * Created by Reid on 2016/8/7 0007.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        mallard.display();

        System.out.println("###################");

        Duck muDuck = new MuDuck();
        muDuck.performFly();
        muDuck.performQuack();
        muDuck.display();

        muDuck.setFlyBehavior(new FlyRocket());
        muDuck.performFly();
    }
}
