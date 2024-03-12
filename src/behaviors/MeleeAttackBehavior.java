package behaviors;

import interfaces.IAttack;

public class MeleeAttackBehavior implements IAttack {

    @Override
    public void attack() {
        System.out.println("Melee attack");
    }
}
