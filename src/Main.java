import abstracts.Unit;
import units.Archer;
import units.Knight;
import units.Soldier;

public class Main {
    public static void main(String[] args) {

        Unit soldier = new Soldier();
        Unit archer = new Archer();
        Unit knight = new Knight();

        soldier.performAttack();
        soldier.performMove();

        archer.performAttack();
        archer.performMove();

        knight.performAttack();
        knight.performMove();
    }
}