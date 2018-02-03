package patterns.strategy.model;

import patterns.strategy.behavior.IBehavior;

public class Cavalier extends Human {

    public Cavalier(IBehavior attackBehavior) {
        super(attackBehavior);
    }

    @Override
    public void display() {
        System.out.println("I have an armor, a helmet, a horse and sword");
    }

    @Override
    public void say() {
        System.out.println("Hello, I am a cavalier");
    }
}