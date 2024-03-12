package behaviors;

import interfaces.IMovement;

public class WalkMovementBehavior implements IMovement {
    @Override
    public void move() {
        System.out.println("Walking");
    }
}
