package patterns.strategy.model;

import patterns.strategy.behavior.IBehavior;

public class Peasant extends Human {

    public Peasant(IBehavior attackBehavior) {
        super(attackBehavior);
    }

    @Override
    public void display() {
        System.out.println("I have a shirt and a fork");
    }

    @Override
    public void say() {
        System.out.println("Hello, I am a peasant");
    }
}
