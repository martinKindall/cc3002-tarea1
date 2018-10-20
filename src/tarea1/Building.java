package tarea1;

/**
 * @author https://github.com/martinKindall
 *
 * Building. Here are the rules of damage and healing for this class when interacting
 * with other objects of the game.
 * Buildings are repaired by villagers.
 */
public abstract class Building extends AttackableEntity {

    /**
     * Constructor calls super (AttackableEntity's) constructor.
     * @param hitpoints Whenever this reaches 0, the object dies
     */
    public Building(int hitpoints){
        super(hitpoints);
    }

    /**
     * @param villager the villager who is repairing
     */
    @Override
    public void receiveDmgFromVillager(Villager villager) {
        super.increaseHitpoints((int) (villager.attackPts() * 0.7), 1);
    }
}
