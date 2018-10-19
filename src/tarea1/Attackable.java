package tarea1;

public interface Attackable {
    public boolean isAlive();
    public int currentLife();
    public void receiveDmgFromArcher(Archer archer);
    public void receiveDmgFromMonk(Monk monk);
}
