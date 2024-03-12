package behaviors;

import interfaces.IAttack;

public class RangeAttackBehavior implements IAttack {
    @Override
    public void attack() {
        System.out.println("Range attack");
    }
}
