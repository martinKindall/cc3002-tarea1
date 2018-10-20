package tarea1;

/**
 * @author https://github.com/martinKindall
 *
 * AttackerBuilding.
 * Every building that attacks in this game extends this class, for example
 * Castles.
 * AttackerBuildings are repaired by villagers.
 */
public abstract class AttackerBuilding extends AttackerEntity {

    /**
     * Constructor calls super (AttackerEntity's) constructor.
     * @param hitpoints Whenever this reaches 0, the object dies
     * @param attackPts attack points of the object
     */
    public AttackerBuilding(int hitpoints, int attackPts){
        super(hitpoints, attackPts);
    }

    /**
     * @param villager the villager who is repairing
     */
    @Override
    public void receiveDmgFromVillager(Villager villager) {
        super.increaseHitpoints((int) (villager.attackPts() * 0.3), 1);
    }
}
