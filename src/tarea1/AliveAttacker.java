package tarea1;

/**
 * @author https://github.com/martinKindall
 *
 * Every AttackerEntity has an AttackerState. AliveAttacker means that the
 * object is alive and is able to attack, thus the method attack calls
 * the object method myAttack() from AttackerEntity.
 */
public class AliveAttacker implements AttackerState{

    /**
     * calls AttackerEntity's method myAttack(), in order to
     * allow the attacker to damage attackable.
     *
     * @param attacker the object inflicting damage
     * @param attackable the object receiving damage
     */
    public void attack(AttackerEntity attacker, Attackable attackable){
        attacker.myAttack(attackable);
    }
}
