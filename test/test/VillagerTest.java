package test;

import org.junit.*;
import tarea1.*;

import static org.junit.Assert.*;

public class VillagerTest {
    private Attackable barracks;
    private Attackable oldHouse;
    private Attacker villager;
    private Attacker archer;
    private Monk monk;


    @Before
    public void setUp(){
        barracks = new Barracks(10000000);
        oldHouse = new Barracks(1);
        archer = new Archer(50, 10);
        villager = new Villager(50, 10);
        monk = new Monk(50, 10);
    }


    @Test
    public void repairBarracks(){
        archer.attack(barracks);
        int currentLife = barracks.currentLife();
        villager.attack(barracks);
        assertTrue(currentLife + (int)(villager.attackPts() * 0.7) == barracks.currentLife());
    }


    @Test
    public void attackArcher(){
        int currentLife = archer.currentLife();
        villager.attack(archer);
        assertTrue(currentLife - (int)(villager.attackPts() * 1.0) == archer.currentLife());
    }


    @Test
    public void dontHarmMonk(){
        int currentLife = monk.currentLife();
        villager.attack(monk);
        assertTrue(currentLife == monk.currentLife());
    }


    @Test
    public void cannotRepairDestroyed(){
        archer.attack(oldHouse);
        assertTrue(!oldHouse.isAlive());
        
        villager.attack(oldHouse);
        assertTrue(!oldHouse.isAlive());
    }
}
