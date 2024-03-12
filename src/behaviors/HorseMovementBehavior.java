package behaviors;

import interfaces.IMovement;

public class HorseMovementBehavior implements IMovement {
    @Override
    public void move() {
        System.out.println("Moving on horse");
    }
}
