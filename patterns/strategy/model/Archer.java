package patterns.strategy.model;

import patterns.strategy.behavior.IBehavior;

public class Archer extends Human{

    public Archer(IBehavior attackBehavior) {
        super(attackBehavior);
    }

    @Override
    public void display() {
        System.out.println("I have an armor, a helmet and a bow");
    }

    @Override
    public void say() {
        System.out.println("Hello, I am an archer");
    }
}
