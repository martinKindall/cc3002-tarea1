package tarea1;

/**
 * @author https://github.com/martinKindall
 *
 * InfantryUnit. Here are the rules of damage and healing for this class when interacting
 * with other objects of the game.
 */
public class InfantryUnit extends Unit {

    /**
     * Constructor calls super (Unit's) constructor.
     * @param hitpoints Whenever this reaches 0, the object dies
     * @param attackPts attack points of the object
     */
    public InfantryUnit(int hitpoints, int attackPts){
        super(hitpoints, attackPts);
    }

    /**
     * This method identifies the current object
     * using double dispatch, sending a message to the attackable
     * by telling it is receiving damage from the current object.
     * @param attackable the object being damaged
     */
    @Override
    public void myAttack(Attackable attackable){
        attackable.receiveDmgFromInfantry(this);
    }

    /**
     * @param archer The archer who is attacking
     */
    @Override
    public void receiveDmgFromArcher(ArcherUnit archer) {
        super.reduceHitpoints((int)(archer.attackPts() * 1.2));
    }

    /**
     * @param villager the villager who is attacking
     */
    @Override
    public void receiveDmgFromVillager(Villager villager) {
        super.reduceHitpoints((int)(villager.attackPts() * 0.8));
    }

    /**
     * @param castle the castle who is attacking
     */
    @Override
    public void receiveDmgFromCastle(Castle castle) {
        super.reduceHitpoints((int) (castle.attackPts() * 1.2));
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
        super.reduceHitpoints((int) (infantry.attackPts() * 1.0));
    }

    /**
     * @param cavalry the cavalry who is attacking
     */
    @Override
    public void receiveDmgFromCavalry(CavalryUnit cavalry) {
        super.reduceHitpoints((int) (cavalry.attackPts() * 1.0));
    }
}
