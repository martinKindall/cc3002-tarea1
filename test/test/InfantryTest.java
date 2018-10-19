package test;

import org.junit.*;
import tarea1.*;

import static org.junit.Assert.*;

public class InfantryTest {
    private Attacker infantry, infantryEnemy;
    private Attacker castle;
    private Attacker villager;
    private Attacker monk;
    private Attacker siege;
    private Attacker archer;
    private Attacker cavalry;


    @Before
    public void setUp(){
        infantry = new InfantryUnit(50, 10);
        castle = new Castle(50, 10);
        villager = new Villager(50, 10);
        monk = new Monk(50, 10);
        siege = new SiegeUnit(100, 10);
        archer = new ArcherUnit(50, 10);
        infantryEnemy = new InfantryUnit(50, 10);
        cavalry = new CavalryUnit(80, 10);
    }


    @Test
    public void receiveDmgFromInfantry(){
        assertTrue(TestUtils.receiveDamageFrom(infantry, infantryEnemy, 1.0));
    }

    @Test
    public void receiveDmgFromArcher(){
        assertTrue(TestUtils.receiveDamageFrom(infantry, archer, 1.2));
    }

    @Test
    public void receiveDmgFromCavalry(){
        assertTrue(TestUtils.receiveDamageFrom(infantry, cavalry, 1.0));
    }

    @Test
    public void receiveDmgFromSiege(){
        assertTrue(TestUtils.receiveDamageFrom(infantry, siege, 1.5));
    }

    @Test
    public void receiveDmgFromVillager(){
        assertTrue(TestUtils.receiveDamageFrom(infantry, villager, 0.8));
    }

    @Test
    public void healedByMonk(){
        assertTrue(TestUtils.healedRepairedBy(monk, infantry, infantry, 0.5));
    }

    @Test
    public void receiveDmgFromCastle(){
        assertTrue(TestUtils.receiveDamageFrom(infantry, castle, 1.2));
    }
}
