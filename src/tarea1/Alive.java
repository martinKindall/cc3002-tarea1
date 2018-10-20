package tarea1;

/**
 * @author https://github.com/martinKindall
 *
 * Alive state means that the object is able to recover hitpoints and isAlive() returns true.
 */
public class Alive implements State {

    /**
     * calls AttackableEntity's method myIncreaseHitpoints(), in order to
     * allow the attackable to recover hitpoints.
     *
     * @param attackable the object being recovered
     * @param hitpoints the amount of hitpoints being restored
     * @param multiplier the multiplier (1 or 2)
     */
    public void increaseHitpoints(AttackableEntity attackable, int hitpoints, int multiplier){
        attackable.myIncreaseHitpoints(hitpoints, multiplier);
    }

    /**
     * @return true because the state is Alive
     */
    public boolean isAlive(){
        return true;
    }
}
