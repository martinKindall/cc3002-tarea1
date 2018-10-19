package test;

import org.junit.*;
import tarea1.*;

import static org.junit.Assert.*;
public class SiegeTest {
    private Attackable barracks;
    private Attacker castle;
    private Attacker villager;
    private Attacker monk;
    private Attacker siege;
    private Attacker archer;


    @Before
    public void setUp(){
        barracks = new Barracks(10000000);
        castle = new Castle(50, 10);
        villager = new Villager(50, 10);
        monk = new Monk(50, 10);
        siege = new SiegeUnit(100, 10);
        archer = new ArcherUnit(50, 10);
    }


    @Test
    public void dmgCastle(){
        int currentLife = castle.currentLife();
        siege.attack(castle);
        assertTrue(castle.currentLife() == currentLife - (int)(siege.attackPts() * 2.0));
    }


    @Test
    public void dmgBarracks(){
        int currentLife = barracks.currentLife();
        siege.attack(barracks);
        assertTrue(barracks.currentLife() == currentLife - (int)(siege.attackPts() * 2.0));
    }


    @Test
    public void receiveDamageFromArcher(){
        int currentLife = siege.currentLife();
        archer.attack(siege);
        assertTrue(siege.currentLife() == (int)(currentLife - archer.attackPts() * 0.8));

        currentLife = siege.currentLife();
        archer.attack(siege);
        assertTrue(siege.currentLife() == (int)(currentLife - archer.attackPts() * 0.8));
    }


    @Test
    public void repairedByVillager(){
        archer.attack(siege);
        int currentLife = siege.currentLife();
        villager.attack(siege);
        assertTrue(siege.currentLife() == currentLife + (int)(villager.attackPts() * 0.5));
    }


    @Test
    public void notRepairedByMonk(){
        archer.attack(siege);
        int currentLife = siege.currentLife();
        monk.attack(siege);
        assertTrue(siege.currentLife() == currentLife);
    }
}
