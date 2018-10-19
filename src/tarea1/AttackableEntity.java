package tarea1;

public abstract class AttackableEntity implements Attackable{
    private int maxHitpoints;
    protected int hitpoints;

    public AttackableEntity(){
        hitpoints = 200;
        maxHitpoints = hitpoints;
    }

    public AttackableEntity(int hitpoints){
        this.hitpoints = hitpoints;
        this.maxHitpoints = hitpoints;
    }

    protected void reduceHitpoints(int hitpoints){
        this.hitpoints -= hitpoints;

        if (this.hitpoints < 0){
            this.hitpoints = 0;
        }
    }

    protected void increaseHitpoints(int hitpoints, int multiplier){
        this.hitpoints += hitpoints;

        if (this.hitpoints > multiplier*this.maxHitpoints){
            this.hitpoints = multiplier*this.maxHitpoints;
        }
    }

    public boolean isAlive(){
        return this.hitpoints > 0;
    }

    protected void die(){
        this.hitpoints = 0;
    }

    @Override
    public int currentLife() {
        return hitpoints;
    }
}
