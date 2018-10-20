package tarea1;

/**
 * @author https://github.com/martinKindall
 *
 * Every Attackable object in this game has a State, Alive or Dead.
 * The initial State is Alive().
 * A Dead object cannot increase its hitpoints anymore.
 */
public interface State {

    /**
     * This method decides whether the AttackableEntity is able to recover.
     *
     * @param attackable the object being recovered
     * @param hitpoints the amount of hitpoints being restored
     * @param multiplier the multiplier (1 or 2)
     */
    public void increaseHitpoints(AttackableEntity attackable, int hitpoints, int multiplier);

    /**
     * @return true if the object is Alive, false if is Dead.
     */
    public boolean isAlive();
}
