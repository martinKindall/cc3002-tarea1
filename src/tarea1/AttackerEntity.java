package tarea1;

public abstract class AttackerEntity extends AttackableEntity implements Attacker{
    private int varAttackPts;
    protected AttackerState state;

    public AttackerEntity(int hitpoints, int attackPts){
        super(hitpoints);
        varAttackPts = attackPts;
        state = new AliveAttacker();
    }

    @Override
    public int attackPts(){
        return varAttackPts;
    }

    @Override
    protected void die(){
        super.state = new Dead();
        state = new DeadAttacker();
    }

    protected abstract void myAttack(Attackable attackable);

    @Override
    public void attack(Attackable attackable){
        this.state.attack(this, attackable);
    }
}
