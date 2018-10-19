package tarea1;

public interface State {
    public void increaseHitpoints(AttackableEntity attackable, int hitpoints, int multiplier);
    public boolean isAlive();
}
