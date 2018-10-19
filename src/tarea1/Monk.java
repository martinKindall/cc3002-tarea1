package tarea1;

public class Monk extends Unit {
    public Monk(int hitpoints, int attackPts){
        super(hitpoints, attackPts);
    }

    @Override
    public void myAttack(Attackable attackable){
        attackable.receiveDmgFromMonk(this);
    }

    @Override
    public void receiveDmgFromArcher(Archer archer) {
        super.die();
    }
}
