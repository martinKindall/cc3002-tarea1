package tarea1;

/**
 * @author https://github.com/martinKindall
 *
 * RepairableUnit. Here are the rules of damage and healing for this class when interacting
 * with other objects of the game.
 * This units cannot be healed by a monk, but by a villager.
 */
public abstract class RepairableUnit extends Unit{

    /**
     * Constructor calls super (Unit's) constructor.
     * @param hitpoints Whenever this reaches 0, the object dies
     * @param attackPts attack points of the object
     */
    public RepairableUnit(int hitpoints, int attackPts){
        super(hitpoints, attackPts);
    }

    /**
     * @param monk Monks cannot heal this object
     */
    @Override
    public void receiveDmgFromMonk(Monk monk) {

    }

    /**
     * @param villager the villager who is repairing
     */
    @Override
    public void receiveDmgFromVillager(Villager villager) {
        super.increaseHitpoints((int) (villager.attackPts() * 0.5), 1);
    }
}
