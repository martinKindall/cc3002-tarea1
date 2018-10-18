package tarea1;

public abstract class AttackableEntity implements Attackable{
    protected int hitpoints;

    public AttackableEntity(){
        hitpoints = 200;
    }

    public AttackableEntity(int hitpoints){
        this.hitpoints = hitpoints;
    }

    protected void reduceHitpoints(int hitpoints){
        this.hitpoints -= hitpoints;

        if (this.hitpoints < 0){
            this.hitpoints = 0;
        }
    }

    @Override
    public int currentLife() {
        return hitpoints;
    }
}
