package tarea1;

public class Barracks extends Building {

    public Barracks(int hitpoints) {
        super(hitpoints);
    }

    @Override
    public void receiveDmgFromArcher(Archer archer) {
        super.reduceHitpoints((int)(archer.attackPts() * 0.7));
    }
}
