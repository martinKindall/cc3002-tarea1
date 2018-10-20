package tarea1;

/**
 * @author https://github.com/martinKindall
 *
 * Every entity on this game implements this interface, because every object has lifespan and can be attacked.
 * An Attackable object can interact interact with any other object, receiving damage or
 * being healed/repaired.
 */
public interface Attackable {

    /**
     * @return true if object is alive (hp > 0), false otherwise
     */
    public boolean isAlive();


    /**
     * @return Current hitpoints of the object. Cannot be a
     * negative value.
     */
    public int currentLife();


    /**
     * @param archer The archer who is attacking
     */
    public void receiveDmgFromArcher(ArcherUnit archer);

    /**
     * @param monk The monk who is healing
     */
    public void receiveDmgFromMonk(Monk monk);


    /**
     * @param villager the villager who is attacking/repairing
     */
    public void receiveDmgFromVillager(Villager villager);


    /**
     * @param castle the castle who is attacking
     */
    public void receiveDmgFromCastle(Castle castle);

    /**
     * @param siege the siege who is attacking
     */
    public void receiveDmgFromSiege(SiegeUnit siege);

    /**
     * @param infantry the infantry who is attacking
     */
    public void receiveDmgFromInfantry(InfantryUnit infantry);

    /**
     * @param cavalry the cavalry who is attacking
     */
    public void receiveDmgFromCavalry(CavalryUnit cavalry);
}
