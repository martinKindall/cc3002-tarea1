package tarea1;

public abstract class Unit extends AttackerEntity {
    public Unit(int hitpoints, int attackPts){
        super(hitpoints, attackPts);
    }

    @Override
    public void receiveDmgFromMonk(Monk monk) {
        super.increaseHitpoints((int) (monk.attackPts() * 0.5), 2);
    }
}
