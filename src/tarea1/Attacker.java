package tarea1;

public interface Attacker extends Attackable {
    public void attack(Attackable attackable);
    public int attackPts();
}
