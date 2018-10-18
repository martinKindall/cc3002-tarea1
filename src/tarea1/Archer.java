package tarea1;

public class Archer extends Unit {
    public void attack(Attackable attackable){
        attackable.receiveDmg(this);
    }
}
