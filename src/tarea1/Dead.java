package tarea1;

/**
 * @author https://github.com/martinKindall
 *
 * Dead state means that the object is not able to recover hitpoints and isAlive() returns false.
 */
public class Dead implements State {

    /**
     * Empty method. Dead means that the
     * object is dead and cannot recover hp anymore.
     * To see the 'alive' version, go to Alive.
     */
    public void increaseHitpoints(AttackableEntity attackable, int hitpoints, int multiplier){
    }

    /**
     * @return false because the state is Dead
     */
    public boolean isAlive(){
        return false;
    }
}
