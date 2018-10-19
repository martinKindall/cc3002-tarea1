package tarea1;

public class InfantryUnit extends Unit {
    public InfantryUnit(int hitpoints, int attackPts){
        super(hitpoints, attackPts);
    }

    @Override
    public void myAttack(Attackable attackable){
        attackable.receiveDmgFromInfantry(this);
    }

    @Override
    public void receiveDmgFromArcher(ArcherUnit archer) {
        super.reduceHitpoints((int)(archer.attackPts() * 1.2));
    }

    @Override
    public void receiveDmgFromVillager(Villager villager) {
        super.reduceHitpoints((int)(villager.attackPts() * 0.8));
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
        super.reduceHitpoints((int) (infantry.attackPts() * 1.0));
    }

    @Override
    public void receiveDmgFromCavalry(CavalryUnit cavalry) {
        super.reduceHitpoints((int) (cavalry.attackPts() * 1.0));
    }
}
