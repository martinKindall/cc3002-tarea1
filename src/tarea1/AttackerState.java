package tarea1;

/**
 * @author https://github.com/martinKindall
 *
 * Every AttackerEntity has an AttackerState, AliveAttacker or DeadAttacker.
 * It decides whether the Attacker is able to attack or not.
 */
public interface AttackerState{

    /**
     * This method decides whether the attacker is going to effectively
     * attack or not the attackable object
     *
     * @param attacker the object inflicting damage
     * @param attackable the object receiving damage
     */
    public void attack(AttackerEntity attacker, Attackable attackable);
}
