package patterns.strategy.model;

import patterns.strategy.behavior.IBehavior;

public abstract class Human {

    public static int defence = 1;
    public static int damage = 1;
    public static int speed = 10;

    IBehavior attackBehavior;

    public Human(IBehavior attackBehavior) {
        this.attackBehavior = attackBehavior;
    }

    public void resolveAttack() {
        attackBehavior.attack();
    }

    public abstract void display();

    public abstract void say();

}