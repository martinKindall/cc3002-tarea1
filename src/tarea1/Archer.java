package tarea1;

public class Archer extends Unit {

    public Archer(int hitpoints, int attackPts){
        super(hitpoints, attackPts);
    }

    @Override
    public void attack(Attackable attackable){
        attackable.receiveDmgFromArcher(this);
    }

    @Override
    public void receiveDmgFromArcher(Archer archer) {
        super.reduceHitpoints((int)(archer.attackPts() * 1.2));
    }
}
