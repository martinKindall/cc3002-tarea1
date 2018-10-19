package test;

import org.junit.*;
import tarea1.*;

import static org.junit.Assert.*;

public class CavalryTest {
    private Attacker infantry;
    private Attacker castle;
    private Attacker villager;
    private Attacker monk;
    private Attacker siege;
    private Attacker archer;
    private Attacker cavalry, cavalryEnemy;


    @Before
    public void setUp(){
        infantry = new InfantryUnit(50, 10);
        castle = new Castle(50, 10);
        villager = new Villager(50, 10);
        monk = new Monk(50, 10);
        siege = new SiegeUnit(100, 10);
        archer = new ArcherUnit(50, 10);
        cavalry = new CavalryUnit(80, 10);
        cavalryEnemy = new CavalryUnit(80, 10);
    }


    @Test
    public void receiveDmgFromCastle(){
        assertTrue(TestUtils.receiveDamageFrom(cavalry, castle, 1.2));
    }


    @Test
    public void receiveDmgFromArcher(){
        assertTrue(TestUtils.receiveDamageFrom(cavalry, archer, 1.0));
    }


    @Test
    public void receiveDmgFromSiege(){
        assertTrue(TestUtils.receiveDamageFrom(cavalry, siege, 1.0));
    }


    @Test
    public void receiveDmgFromInfantry(){
        assertTrue(TestUtils.receiveDamageFrom(cavalry, infantry, 1.2));
    }

    @Test
    public void receiveDmgFromCavalry(){
        assertTrue(TestUtils.receiveDamageFrom(cavalry, cavalryEnemy, 1.0));
    }


    @Test
    public void receiveDmgFromVillager(){
        assertTrue(TestUtils.receiveDamageFrom(cavalry, villager, 0.5));
    }

    @Test
    public void healedByMonk(){
        assertTrue(TestUtils.healedRepairedBy(monk, archer, cavalry, 0.5));
    }
}
