package abstracts;

import interfaces.IAttack;
import interfaces.IMovement;

public class Unit {

    protected IAttack iAttack;
    protected IMovement iMovement;

    public Unit(
            IAttack iAttack,
            IMovement iMovement
    ) {
        this.iAttack = iAttack;
        this.iMovement = iMovement;
    }

    public void performAttack() {
        iAttack.attack();
    }

    public void performMove() {
        iMovement.move();
    }
}
