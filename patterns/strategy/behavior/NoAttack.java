package patterns.strategy.behavior;

import patterns.strategy.model.Human;

public class NoAttack implements IBehavior {

    @Override
    public void attack() {
        System.out.println("Defence = " + Human.defence);
        System.out.println("Damage = " + Human.damage);
        System.out.println("Speed = " + Human.speed);
    }
}