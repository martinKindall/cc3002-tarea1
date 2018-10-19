package test;

import org.junit.*;
import tarea1.*;

import static org.junit.Assert.*;

public class ArcherTest {
    private Attacker infantry;
    private Attacker castle;
    private Attacker villager;
    private Attacker monk;
    private Attacker siege;
    private Attacker archer, archerEnemy;
    private Attacker cavalry;


    @Before
    public void setUp(){
        infantry = new InfantryUnit(50, 10);
        castle = new Castle(50, 10);
        villager = new Villager(50, 10);
        monk = new Monk(50, 10);
        siege = new SiegeUnit(100, 10);
        archer = new ArcherUnit(50, 10);
        archerEnemy = new ArcherUnit(50, 10);
        cavalry = new CavalryUnit(80, 10);
    }


    @Test
    public void receiveDmgFromInfantry(){
        assertTrue(TestUtils.receiveDamageFrom(archer, infantry, 1.2));
    }

    @Test
    public void receiveDmgFromArcher(){
        assertTrue(TestUtils.receiveDamageFrom(archer, archerEnemy, 1.2));
    }

    @Test
    public void receiveDmgFromCavalry(){
        assertTrue(TestUtils.receiveDamageFrom(archer, cavalry, 1.5));
    }

    @Test
    public void receiveDmgFromSiege(){
        assertTrue(TestUtils.receiveDamageFrom(archer, siege, 1.5));
    }

    @Test
    public void receiveDmgFromVillager(){
        assertTrue(TestUtils.receiveDamageFrom(archer, villager, 1.0));
    }

    @Test
    public void healedByMonk(){
        assertTrue(TestUtils.healedRepairedBy(monk, infantry, archer, 0.5));
    }

    @Test
    public void receiveDmgFromCastle(){
        assertTrue(TestUtils.receiveDamageFrom(archer, castle, 1.2));
    }
}
