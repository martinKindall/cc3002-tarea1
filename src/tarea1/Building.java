package tarea1;

public abstract class Building extends AttackableEntity {

    public Building(int hitpoints){
        super(hitpoints);
    }

    @Override
    public void receiveDmgFromMonk(Monk monk) {}

    @Override
    public void receiveDmgFromVillager(Villager villager) {
        if (super.isAlive()) {
            super.increaseHitpoints((int) (villager.attackPts() * 0.7), 1);
        }
    }
}