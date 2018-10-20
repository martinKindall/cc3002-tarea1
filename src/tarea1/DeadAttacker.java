package tarea1;

/**
 * @author https://github.com/martinKindall
 *
 * Every AttackerEntity has an AttackerState. DeadAttacker means that the
 * object is dead and cannot attack anymore, thus the method attack is empty.
 */
public class DeadAttacker implements AttackerState{

    /**
     * Empty method. DeadAttacker means that the
     * object is dead and cannot attack anymore.
     * To see the 'alive' version, go to AliveAttacker
     */
    public void attack(AttackerEntity attacker, Attackable attackable){
    }
}
