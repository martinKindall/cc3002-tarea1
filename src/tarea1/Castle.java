package tarea1;

public class Castle extends AttackerBuilding {
    public Castle(int hitpoints, int attackPts){
        super(hitpoints, attackPts);
    }

    @Override
    public void myAttack(Attackable attackable){
        attackable.receiveDmgFromCastle(this);
    }

    @Override
    public void receiveDmgFromArcher(ArcherUnit archer) {
        super.reduceHitpoints((int)(archer.attackPts() * 0.1));
    }

    @Override
    public void receiveDmgFromVillager(Villager villager) {
        super.increaseHitpoints((int) (villager.attackPts() * 0.3), 1);
    }

    @Override
    public void receiveDmgFromCastle(Castle castle) {
        super.reduceHitpoints((int) (castle.attackPts() * 0.1));
    }

    @Override
    public void receiveDmgFromSiege(SiegeUnit siege) {
        super.reduceHitpoints((int) (siege.attackPts() * 2.0));
    }

    @Override
    public void receiveDmgFromInfantry(InfantryUnit infantry) {
        super.reduceHitpoints((int) (infantry.attackPts() * 0.3));
    }
}
