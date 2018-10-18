package tarea1;

public abstract class AttackableEntity implements Attackable{
    protected int hitpoints;

    public AttackableEntity(){
        hitpoints = 200;
    }

    public AttackableEntity(int hitpoints){
        this.hitpoints = hitpoints;
    }
}
