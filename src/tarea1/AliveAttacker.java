package tarea1;

public class AliveAttacker implements AttackerState{
    public void attack(AttackerEntity attacker, Attackable attackable){
        attacker.myAttack(attackable);
    }
}
