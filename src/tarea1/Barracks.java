package tarea1;

/**
 * @author https://github.com/martinKindall
 *
 * Barracks. Here are the rules of damage and healing for this class when interacting
 * with other objects of the game.
 */
public class Barracks extends Building {

    /**
     * Constructor calls super (Building's) constructor.
     * @param hitpoints Whenever this reaches 0, the object dies
     */
    public Barracks(int hitpoints) {
        super(hitpoints);
    }

    /**
     * @param archer The archer who is attacking
     */
    @Override
    public void receiveDmgFromArcher(ArcherUnit archer) {
        super.reduceHitpoints((int)(archer.attackPts() * 0.7));
    }

    /**
     * @param castle the castle who is attacking
     */
    @Override
    public void receiveDmgFromCastle(Castle castle) {
        super.reduceHitpoints((int)(castle.attackPts() * 0.7));
    }

    /**
     * @param siege the siege who is attacking
     */
    @Override
    public void receiveDmgFromSiege(SiegeUnit siege) {
        super.reduceHitpoints((int) (siege.attackPts() * 2.0));
    }

    /**
     * @param infantry the infantry who is attacking
     */
    @Override
    public void receiveDmgFromInfantry(InfantryUnit infantry) {
        super.reduceHitpoints((int) (infantry.attackPts() * 0.7));
    }

    /**
     * @param cavalry the cavalry who is attacking
     */
    @Override
    public void receiveDmgFromCavalry(CavalryUnit cavalry) {
        super.reduceHitpoints((int) (cavalry.attackPts() * 0.7));
    }
}
