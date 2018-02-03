package patterns.strategy.behavior;

import patterns.strategy.model.Human;

public class SpearAttack implements IBehavior {
    int defence;
    int damage;
    int speed;

    @Override
    public void attack() {
        System.out.println("Defence = " + (this.defence = Human.defence + 1));
        System.out.println("Damage = " + (this.damage = Human.damage + 2));
        System.out.println("Speed = " + (this.speed = Human.speed - 4));
    }
}
