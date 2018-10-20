package tarea1;

/**
 * @author https://github.com/martinKindall
 *
 * Villager. Here are the rules of damage and healing for this class when interacting
 * with other objects of the game.
 * Villager are special, because they can repair Buildings and AttackerBuildings, and cannot harm monks.
 */
public class Villager extends Unit {

    /**
     * Constructor calls super (Unit's) constructor.
     * @param hitpoints Whenever this reaches 0, the object dies
     * @param attackPts attack points of the object
     */
    public Villager(int hitpoints, int attackPts){
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
        attackable.receiveDmgFromVillager(this);
    }

    /**
     * @param villager the villager who is attacking/repairing
     */
    @Override
    public void receiveDmgFromVillager(Villager villager) {
        super.reduceHitpoints((int)(villager.attackPts() * 1.0));
    }

    /**
     * @param archer The archer who is attacking
     */
    @Override
    public void receiveDmgFromArcher(ArcherUnit archer) {
        super.reduceHitpoints((int)(archer.attackPts() * 1.5));
    }

    /**
     * @param castle the castle who is attacking
     */
    @Override
    public void receiveDmgFromCastle(Castle castle) {
        super.reduceHitpoints((int)(castle.attackPts() * 1.2));
    }

    /**
     * @param siege the siege who is attacking
     */
    @Override
    public void receiveDmgFromSiege(SiegeUnit siege) {
        super.reduceHitpoints((int) (siege.attackPts() * 1.5));
    }

    /**
     * @param infantry the infantry who is attacking
     */
    @Override
    public void receiveDmgFromInfantry(InfantryUnit infantry) {
        super.reduceHitpoints((int) (infantry.attackPts() * 1.5));
    }

    /**
     * @param cavalry the cavalry who is attacking
     */
    @Override
    public void receiveDmgFromCavalry(CavalryUnit cavalry) {
        super.reduceHitpoints((int) (cavalry.attackPts() * 1.5));
    }
}
