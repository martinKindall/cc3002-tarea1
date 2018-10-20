package tarea1;

/**
 * @author https://github.com/martinKindall
 *
 * Unit. Here are the rules of damage and healing for this class when interacting
 * with other objects of the game.
 * Every unit can be healed by a monk, unless the method is overriden.
 */
public abstract class Unit extends AttackerEntity {

    /**
     * Constructor calls super (AttackerEntity's) constructor.
     * @param hitpoints Whenever this reaches 0, the object dies
     * @param attackPts attack points of the object
     */
    protected Unit(int hitpoints, int attackPts){
        super(hitpoints, attackPts);
    }

    /**
     * Monks can heal a unit until it reaches twice it's original
     * maxhitpoints, that's why multiplier is 2.
     *
     * @param monk The monk who is healing
     */
    @Override
    public void receiveDmgFromMonk(Monk monk) {
        super.increaseHitpoints((int) (monk.attackPts() * 0.5), 2);
    }
}
