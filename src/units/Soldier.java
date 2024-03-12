package units;

import abstracts.Unit;
import behaviors.MeleeAttackBehavior;
import behaviors.WalkMovementBehavior;

public class Soldier extends Unit {
    public Soldier() {
        super(
                new MeleeAttackBehavior(),
                new WalkMovementBehavior()
        );
    }
}
