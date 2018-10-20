package tarea1;

/**
 * @author https://github.com/martinKindall
 *
 * AttackableEntity. Here are the rules of damage and healing for this class when interacting
 * with other objects of the game.
 * Every object in this game extends this class.
 */
public abstract class AttackableEntity implements Attackable{
    private int maxHitpoints;
    protected int hitpoints;
    private State state;

    /**
     * By default an object has 50 hp and is alive.
     */
    public AttackableEntity(){
        hitpoints = 50;
        maxHitpoints = hitpoints;
        state = new Alive();
    }

    /**
     * @param hitpoints amount of life the object is
     *                  going to have
     */
    protected AttackableEntity(int hitpoints){
        this.hitpoints = hitpoints;
        this.maxHitpoints = hitpoints;
        state = new Alive();
    }

    /**
     * @param hitpoints amount of damage the object is receiving.
     *                  Whenever it reaches 0, the object dies.
     */
    protected void reduceHitpoints(int hitpoints){
        this.hitpoints -= hitpoints;

        if (this.hitpoints <= 0){
            this.hitpoints = 0;
            this.die();
        }
    }

    /**
     * This method calls the state method increaseHitpoints to
     * check whether it is alive or not.
     * @param hitpoints amount of life being recovered
     * @param multiplier how many times can the object surpass its
     *                   current maxhitpoints.
     */
    protected void increaseHitpoints(int hitpoints, int multiplier){
        state.increaseHitpoints(this, hitpoints, multiplier);
    }

    /**
     * @param hitpoints amount of points the object is being recovered.
     *                  Cannot exceed multiplier * maxhitpoints
     * @param multiplier how many times can the object surpass its
     *                   current maxhitpoints
     */
    protected void myIncreaseHitpoints(int hitpoints, int multiplier){
        this.hitpoints += hitpoints;

        if (this.hitpoints > multiplier*this.maxHitpoints){
            this.hitpoints = multiplier*this.maxHitpoints;
        }
    }

    /**
     * Monks can heal a unit until it reaches twice it's original
     * maxhitpoints, that's why multiplier is 2.
     *
     * @param monk The monk who is healing
     */
    @Override
    public void receiveDmgFromMonk(Monk monk) {

    }

    /**
     * This method calls the state method isAlive to
     * check whether it is alive or not.
     */
    public boolean isAlive(){
        return this.state.isAlive();
    }

    /**
     * Whenever an object dies, it's hitpoints go to 0 and
     * it states changes to Dead().
     */
    protected void die(){
        hitpoints = 0;
        state = new Dead();
    }

    /**
     * @return current hitpoints
     */
    @Override
    public int currentLife() {
        return hitpoints;
    }
}
