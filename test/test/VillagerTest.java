package test;

import org.junit.*;
import tarea1.*;

import static org.junit.Assert.*;

public class VillagerTest {
    private Attackable barracks;
    private Attacker villager;
    private Attacker archer;


    @Before
    public void setUp(){
        barracks = new Barracks(10000000);
        archer = new Archer(50, 10);
        villager = new Villager(50, 10);
    }


    @Test
    public void repairBarracks(){
        archer.attack(barracks);
        int currentLife = barracks.currentLife();
        villager.attack(barracks);
        assertTrue(currentLife + (int)(villager.attackPts() * 0.7) == barracks.currentLife());
    }
}
