package test;

import org.junit.*;
import tarea1.*;

import static org.junit.Assert.*;

public class CastleTest {
    private Attacker archer;
    private Attacker robin_hood;
    private Attacker monk;
    private Attacker villager;
    private Attacker castle;


    @Before
    public void setUp(){
        castle = new Castle(10000,100);
        archer = new Archer(50, 10);
        robin_hood = new Archer(50, 100);
        villager = new Villager(50, 10);
        monk = new Monk(50, 10);
    }


    @Test
    public void receiveDmgFromArcher(){
        int currentLife = castle.currentLife();
        archer.attack(castle);
        assertTrue(castle.currentLife() == currentLife - (int)(archer.attackPts() * 0.1));
    }


    @Test
    public void repairedByVillager(){
        robin_hood.attack(castle);
        int currentLife = castle.currentLife();
        villager.attack(castle);
        assertTrue(castle.currentLife() == currentLife + (int)(villager.attackPts() * 0.3));
    }
}
