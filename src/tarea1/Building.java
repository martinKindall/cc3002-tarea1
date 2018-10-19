package tarea1;

public abstract class Building extends AttackableEntity {

    public Building(int hitpoints){
        super(hitpoints);
    }

    @Override
    public void receiveDmgFromMonk(Monk monk) {}
}
