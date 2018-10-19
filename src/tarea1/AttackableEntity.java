package tarea1;

public abstract class AttackableEntity implements Attackable{
    private int maxHitpoints;
    protected int hitpoints;
    private State state;

    public AttackableEntity(){
        hitpoints = 200;
        maxHitpoints = hitpoints;
        state = new Alive();
    }

    protected AttackableEntity(int hitpoints){
        this.hitpoints = hitpoints;
        this.maxHitpoints = hitpoints;
        state = new Alive();
    }

    protected void reduceHitpoints(int hitpoints){
        this.hitpoints -= hitpoints;

        if (this.hitpoints < 0){
            this.hitpoints = 0;
            this.die();
        }
    }

    protected void increaseHitpoints(int hitpoints, int multiplier){
        state.increaseHitpoints(this, hitpoints, multiplier);
    }

    protected void myIncreaseHitpoints(int hitpoints, int multiplier){
        this.hitpoints += hitpoints;

        if (this.hitpoints > multiplier*this.maxHitpoints){
            this.hitpoints = multiplier*this.maxHitpoints;
        }
    }

    @Override
    public void receiveDmgFromMonk(Monk monk) {

    }

    public boolean isAlive(){
        return this.state.isAlive();
    }

    protected void die(){
        hitpoints = 0;
        state = new Dead();
    }

    @Override
    public int currentLife() {
        return hitpoints;
    }
}
