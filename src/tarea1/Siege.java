package tarea1;

public class Siege extends RepairableUnit{
    public Siege(int hitpoints, int attackPts){
        super(hitpoints, attackPts);
    }

    @Override
    public void myAttack(Attackable attackable){
        attackable.receiveDmgFromSiege(this);
    }

    @Override
    public void receiveDmgFromArcher(Archer archer) {
        super.reduceHitpoints((int)(archer.attackPts() * 0.8));
    }

    @Override
    public void receiveDmgFromCastle(Castle castle) {
        super.reduceHitpoints((int) (castle.attackPts() * 0.5));
    }

    @Override
    public void receiveDmgFromSiege(Siege siege) {
        super.reduceHitpoints((int) (siege.attackPts() * 1.5));
    }
}
