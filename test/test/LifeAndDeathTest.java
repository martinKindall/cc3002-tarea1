package test;

import org.junit.*;
import tarea1.*;

import static org.junit.Assert.*;

public class LifeAndDeathTest {
    private Attacker infantry;
    private Attacker villager;
    private Attacker monk;
    private Attackable oldHouse;
    private Attacker archerAlly;
    private Attacker harmedSoldier;


    @Before
    public void setUp(){
        infantry = new InfantryUnit(50, 10);
        villager = new Villager(50, 10);
        monk = new Monk(50, 10);
        oldHouse = new Barracks(1);
        archerAlly = new ArcherUnit(50, 10);
        harmedSoldier = new InfantryUnit(1, 10);
    }


    @Test
    public void cannotRepairDestroyed(){
        infantry.attack(oldHouse);
        assertTrue(!oldHouse.isAlive());

        int currentLife = oldHouse.currentLife();
        villager.attack(oldHouse);
        assertTrue(!oldHouse.isAlive());
        assertTrue(currentLife == oldHouse.currentLife());
    }


    @Test
    public void notHealingAfterDeath(){
        int currentLife = monk.currentLife();
        assertTrue(currentLife > 30 && infantry.attackPts() < 12);
        infantry.attack(monk);
        assertTrue(!monk.isAlive());

        infantry.attack(archerAlly);
        currentLife = archerAlly.currentLife();
        monk.attack(archerAlly);
        assertTrue(archerAlly.currentLife() == currentLife);
    }


    @Test
    public void notAttackingAfterDeath(){
        assertTrue(harmedSoldier.isAlive());
        infantry.attack(harmedSoldier);
        assertTrue(!harmedSoldier.isAlive());

        int currentLife = infantry.currentLife();
        harmedSoldier.attack(infantry);
        assertTrue(infantry.currentLife() == currentLife);
    }


    @Test
    public void cannotExceedHitpointsOfBuilding(){
        int maxHitpoints = oldHouse.currentLife();
        villager.attack(oldHouse);
        assertTrue(oldHouse.currentLife() == maxHitpoints);
    }


    @Test
    public void cannotExceedDoubleHitpointsOnUnit(){
        int maxHitPoints = archerAlly.currentLife();
        int currentHitpoints = maxHitPoints;

        monk.attack(archerAlly);
        while(archerAlly.currentLife() > currentHitpoints){
            currentHitpoints = archerAlly.currentLife();
            monk.attack(archerAlly);
        }

        assertTrue(archerAlly.currentLife() == maxHitPoints * 2);
    }
}
