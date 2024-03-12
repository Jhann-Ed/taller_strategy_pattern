package units;

import abstracts.Unit;
import behaviors.HorseMovementBehavior;
import behaviors.MeleeAttackBehavior;

public class Knight extends Unit {

    public Knight() {
        super(
                new MeleeAttackBehavior(),
                new HorseMovementBehavior()
        );
    }
}
