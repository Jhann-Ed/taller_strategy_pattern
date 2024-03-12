package units;

import abstracts.Unit;
import behaviors.RangeAttackBehavior;
import behaviors.WalkMovementBehavior;

public class Archer extends Unit {

    public Archer() {
        super(
                new RangeAttackBehavior(),
                new WalkMovementBehavior()
        );
    }
}
