package tarea1;

/**
 * @author https://github.com/martinKindall
 *
 * AttackerEntity. Every attacker object in this game extends this class.
 * All attackers are attackable, thus this class extends AttackableEntity.
 */
public abstract class AttackerEntity extends AttackableEntity implements Attacker{
    private int varAttackPts;
    protected AttackerState state;

    /**
     * Hitpoints are initialized by parent object AttackableEntity.
     * @param hitpoints amount of life the object is
     *                  going to have
     * @param attackPts attack points of the AttackerEntity
     */
    public AttackerEntity(int hitpoints, int attackPts){
        super(hitpoints);
        varAttackPts = attackPts;
        state = new AliveAttacker();
    }

    /**
     * @return object's attack points
     */
    @Override
    public int attackPts(){
        return varAttackPts;
    }

    /**
     * Whenever an AttackerEntity dies, it calls it's parent method die()
     * and also becomes a DeadAttacker() (cannot attack anymore).
     */
    @Override
    protected void die(){
        super.die();
        state = new DeadAttacker();
    }

    /**
     * This method identifies the current object
     * using double dispatch, sending a message to the attackable
     * by telling it is receiving damage from the current
     * object.
     *
     * @param attackable the object being damaged
     */
    protected abstract void myAttack(Attackable attackable);

    /**
     * This method calls the method attack of the state object,
     * it's outcome depends on whether the current object is AliveAttacker or
     * DeadAttacker.
     * @param attackable the object receiving damage
     */
    @Override
    public void attack(Attackable attackable){
        this.state.attack(this, attackable);
    }
}
