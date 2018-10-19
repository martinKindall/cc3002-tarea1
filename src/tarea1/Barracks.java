package tarea1;

public class Barracks extends PasiveEntity {

    public Barracks(int hitpoints) {
        super(hitpoints);
    }

    @Override
    public void receiveDmgFromArcher(Archer archer) {
        super.reduceHitpoints((int)(archer.attackPts() * 0.7));
    }

    @Override
    public void receiveDmgFromMonk(Monk monk) {}
}
