package tarea1;

/**
 * @author https://github.com/martinKindall
 *
 * Monk. Here are the rules of damage and healing for this class when interacting
 * with other objects of the game.
 * Monks are special, because they can heal other units, but any unit that is not a
 * villager kills a monk with just 1 attack.
 */
public class Monk extends Unit {

    /**
     * Constructor calls super (Unit's) constructor.
     * @param hitpoints Whenever this reaches 0, the object dies
     * @param attackPts attack points of the object
     */
    public Monk(int hitpoints, int attackPts){
        super(hitpoints, attackPts);
    }

    /**
     * This method identifies the current object
     * using double dispatch, sending a message to the attackable
     * by telling it is receiving healing from the current object.
     * @param attackable the object being healed
     */
    @Override
    public void myAttack(Attackable attackable){
        attackable.receiveDmgFromMonk(this);
    }

    /**
     * @param archer The archer who is attacking
     */
    @Override
    public void receiveDmgFromArcher(ArcherUnit archer) {
        super.die();
    }

    /**
     * @param villager villagers cannot harm monks.
     */
    @Override
    public void receiveDmgFromVillager(Villager villager) {
    }

    /**
     * @param castle the castle who is attacking
     */
    @Override
    public void receiveDmgFromCastle(Castle castle) {
        super.die();
    }

    /**
     * @param siege the siege who is attacking
     */
    @Override
    public void receiveDmgFromSiege(SiegeUnit siege) {
        super.die();
    }

    /**
     * @param infantry the infantry who is attacking
     */
    @Override
    public void receiveDmgFromInfantry(InfantryUnit infantry) {
        super.die();
    }

    /**
     * @param cavalry the cavalry who is attacking
     */
    @Override
    public void receiveDmgFromCavalry(CavalryUnit cavalry) {
        super.die();
    }
}
