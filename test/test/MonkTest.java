package test;

import org.junit.*;
import tarea1.*;

import static org.junit.Assert.*;

public class MonkTest {

    private Attacker archer;
    private Attacker monk;
    private Attacker castle;
    private Attacker siege;
    private Attacker cavalry;
    private Attacker infantry;
    private Attacker villager;


    @Before 
    public void setUp(){
        archer = new ArcherUnit(50, 10);
    	monk = new Monk(50, 10);
        castle = new Castle(100, 10);
        siege = new SiegeUnit(100, 10);
        cavalry = new CavalryUnit(80, 12);
        infantry = new InfantryUnit(50, 12);
        villager = new Villager(50, 10);
    }

    @Test
    public void receiveDmgFromInfantry(){
        assertTrue(TestUtils.receiveDamageFromAndDie(monk, infantry, 0));
    }

    @Test
    public void receiveDmgFromArcher(){
        assertTrue(TestUtils.receiveDamageFromAndDie(monk, archer, 0));
    }

    @Test
    public void receiveDmgFromCavalry(){
        assertTrue(TestUtils.receiveDamageFromAndDie(monk, cavalry, 0));
    }

    @Test
    public void receiveDmgFromSiege(){
        assertTrue(TestUtils.receiveDamageFromAndDie(monk, siege, 0));
    }

    @Test
    public void receiveDmgFromVillager(){
        assertTrue(TestUtils.hitpointsRemainsEqual(monk, villager, villager));
    }

    @Test
    public void healedByMonk(){
        assertTrue(TestUtils.healedRepairedBy(monk, villager, monk, 0.5));
    }

    @Test
    public void receiveDmgFromCastle(){
        assertTrue(TestUtils.receiveDamageFromAndDie(monk, castle, 0));
    }
}