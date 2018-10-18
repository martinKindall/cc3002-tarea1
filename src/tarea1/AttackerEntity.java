package tarea1;

public abstract class AttackerEntity extends AttackableEntity implements Attacker{
    private int varAttackPts;

    @Override
    public int attackPts(){
        return varAttackPts;
    }

    @Override
    public int currentLife() {
        return super.hitpoints;
    }
}
