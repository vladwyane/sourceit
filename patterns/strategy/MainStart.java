package patterns.strategy;

import patterns.strategy.behavior.BowAttack;
import patterns.strategy.behavior.SpearAttack;
import patterns.strategy.behavior.SwordAttack;
import patterns.strategy.behavior.NoAttack;
import patterns.strategy.model.*;

public class MainStart {

    public static void main(String[] args) {
        Human cavalier = new Cavalier(new SwordAttack());
        Human archer = new Archer(new BowAttack());
        Human soldier = new Soldier(new SpearAttack());
        Human peasant = new Peasant(new NoAttack());

        cavalier.say();
        cavalier.display();
        cavalier.resolveAttack();
        System.out.println();

        archer.say();
        archer.display();
        archer.resolveAttack();
        System.out.println();

        soldier.say();
        soldier.display();
        soldier.resolveAttack();
        System.out.println();

        peasant.say();
        peasant.display();
        peasant.resolveAttack();
    }
}