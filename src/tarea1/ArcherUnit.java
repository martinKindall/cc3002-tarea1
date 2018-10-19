package tarea1;

public class ArcherUnit extends Unit {

    public ArcherUnit(int hitpoints, int attackPts){
        super(hitpoints, attackPts);
    }

    @Override
    public void myAttack(Attackable attackable){
        attackable.receiveDmgFromArcher(this);
    }

    @Override
    public void receiveDmgFromArcher(ArcherUnit archer) {
        super.reduceHitpoints((int)(archer.attackPts() * 1.2));
    }

    @Override
    public void receiveDmgFromVillager(Villager villager) {
        super.reduceHitpoints((int)(villager.attackPts() * 1.0));
    }

    @Override
    public void receiveDmgFromCastle(Castle castle) {
        super.reduceHitpoints((int) (castle.attackPts() * 1.2));
    }

    @Override
    public void receiveDmgFromSiege(SiegeUnit siege) {
        super.reduceHitpoints((int) (siege.attackPts() * 1.5));
    }

    @Override
    public void receiveDmgFromInfantry(InfantryUnit infantry) {
        super.reduceHitpoints((int) (infantry.attackPts() * 1.2));
    }
}
