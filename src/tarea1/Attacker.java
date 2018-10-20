package tarea1;

/**
 * @author https://github.com/martinKindall
 *
 * Any object that inflicts damage implements this interface.
 * An Attacker object can damage any other object and has attack points.
 */
public interface Attacker extends Attackable {

    /**
     * The Attackable object is receiving damage from
     * the current object
     * @param attackable the object receiving damage
     */
    public void attack(Attackable attackable);

    /**
     * @return the attack points of the current Attacker
     */
    public int attackPts();
}
