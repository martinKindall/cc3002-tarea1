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
    public void receiveDmgFromArcher(ArcherUnit archer) {
        super.die();
    }

    @Override
    public void receiveDmgFromVillager(Villager villager) {
    }

    @Override
    public void receiveDmgFromCastle(Castle castle) {
        super.die();
    }

    @Override
    public void receiveDmgFromSiege(SiegeUnit siege) {
        super.die();
    }

    @Override
    public void receiveDmgFromInfantry(InfantryUnit infantry) {
        super.die();
    }

    @Override
    public void receiveDmgFromCavalry(CavalryUnit cavalry) {
        super.die();
    }
}
