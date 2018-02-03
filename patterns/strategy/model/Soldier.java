package patterns.strategy.model;

import patterns.strategy.behavior.IBehavior;

public class Soldier extends Human {

    public Soldier(IBehavior attackBehavior) {
        super(attackBehavior);
    }

    @Override
    public void display() {
        System.out.println("I have an armor, a helmet and a spear");
    }

    @Override
    public void say() {
        System.out.println("Hello, I am an soldier");
    }
}