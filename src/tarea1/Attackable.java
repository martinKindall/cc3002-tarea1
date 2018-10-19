package tarea1;

public interface Attackable {
    public boolean isAlive();
    public int currentLife();
    public void receiveDmgFromArcher(ArcherUnit archer);
    public void receiveDmgFromMonk(Monk monk);
    public void receiveDmgFromVillager(Villager villager);
    public void receiveDmgFromCastle(Castle castle);
    public void receiveDmgFromSiege(SiegeUnit siege);
}
