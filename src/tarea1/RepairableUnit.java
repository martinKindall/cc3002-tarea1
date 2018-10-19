package tarea1;

public abstract class RepairableUnit extends Unit{
    public RepairableUnit(int hitpoints, int attackPts){
        super(hitpoints, attackPts);
    }

    @Override
    public void receiveDmgFromMonk(Monk monk) {

    }

    @Override
    public void receiveDmgFromVillager(Villager villager) {
        super.increaseHitpoints((int) (villager.attackPts() * 0.5), 1);
    }
}
