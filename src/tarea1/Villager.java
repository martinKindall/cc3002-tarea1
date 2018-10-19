package tarea1;

public class Villager extends Unit {
    public Villager(int hitpoints, int attackPts){
        super(hitpoints, attackPts);
    }

    @Override
    public void myAttack(Attackable attackable){
        attackable.receiveDmgFromVillager(this);
    }

    @Override
    public void receiveDmgFromVillager(Villager villager) {
        super.reduceHitpoints((int)(villager.attackPts() * 1.0));
    }

    @Override
    public void receiveDmgFromArcher(Archer archer) {
        super.reduceHitpoints((int)(archer.attackPts() * 1.5));
    }
}
