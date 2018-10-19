package tarea1;

public abstract class AttackerEntity extends AttackableEntity implements Attacker{
    private int varAttackPts;

    public AttackerEntity(int hitpoints, int attackPts){
        super(hitpoints);
        varAttackPts = attackPts;
    }

    @Override
    public int attackPts(){
        return varAttackPts;
    }

    protected abstract void myAttack(Attackable attackable);

    @Override
    public void attack(Attackable attackable){
        if (super.isAlive()){
            myAttack(attackable);
        }
    }
}
