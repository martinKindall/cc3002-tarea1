package tarea1;

public class Barracks extends Building {

    public Barracks(int hitpoints) {
        super(hitpoints);
    }

    @Override
    public void receiveDmgFromArcher(ArcherUnit archer) {
        super.reduceHitpoints((int)(archer.attackPts() * 0.7));
    }

    @Override
    public void receiveDmgFromCastle(Castle castle) {
        super.reduceHitpoints((int)(castle.attackPts() * 0.7));
    }

    @Override
    public void receiveDmgFromSiege(SiegeUnit siege) {
        super.reduceHitpoints((int) (siege.attackPts() * 2.0));
    }

    @Override
    public void receiveDmgFromInfantry(InfantryUnit infantry) {
        super.reduceHitpoints((int) (infantry.attackPts() * 0.7));
    }
}
