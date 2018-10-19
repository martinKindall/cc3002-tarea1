package tarea1;

public abstract class AttackableEntity implements Attackable{
    private int maxHitpoints;
    protected int hitpoints;
    protected State state;

    public AttackableEntity(){
        hitpoints = 200;
        maxHitpoints = hitpoints;
        state = new Alive();
    }

    public AttackableEntity(int hitpoints){
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

    public void myIncreaseHitpoints(int hitpoints, int multiplier){
        this.hitpoints += hitpoints;

        if (this.hitpoints > multiplier*this.maxHitpoints){
            this.hitpoints = multiplier*this.maxHitpoints;
        }
    }

    public boolean isAlive(){
        return this.state.isAlive();
    }

    protected void die(){
        state = new Dead();
    }

    @Override
    public int currentLife() {
        return hitpoints;
    }
}
