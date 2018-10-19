package tarea1;

public class Alive implements State {
    public void increaseHitpoints(AttackableEntity attackable, int hitpoints, int multiplier){
        attackable.myIncreaseHitpoints(hitpoints, multiplier);
    }

    public boolean isAlive(){
        return true;
    }
}
