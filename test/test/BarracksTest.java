package test;

import org.junit.*;
import tarea1.*;

import static org.junit.Assert.*;

public class BarracksTest {
    private Attacker infantry;
    private Attacker castle;
    private Attacker villager;
    private Attacker monk;
    private Attacker siege;
    private Attacker archer;
    private Attacker cavalry;
    private Attackable barracks;


    @Before
    public void setUp(){
        infantry = new InfantryUnit(50, 10);
        castle = new Castle(50, 10);
        villager = new Villager(50, 10);
        monk = new Monk(50, 10);
        siege = new SiegeUnit(100, 10);
        archer = new ArcherUnit(50, 10);
        cavalry = new CavalryUnit(80, 10);
        barracks = new Barracks(1000);
    }


    @Test
    public void receiveDmgFromInfantry(){
        assertTrue(TestUtils.receiveDamageFrom(barracks, infantry, 0.7));
    }

    @Test
    public void receiveDmgFromArcher(){
        assertTrue(TestUtils.receiveDamageFrom(barracks, archer, 0.7));
    }

    @Test
    public void receiveDmgFromCavalry(){
        assertTrue(TestUtils.receiveDamageFrom(barracks, cavalry, 0.7));
    }

    @Test
    public void receiveDmgFromSiege(){
        assertTrue(TestUtils.receiveDamageFrom(barracks, siege, 2.0));
    }

    @Test
    public void receiveDmgFromVillager(){
        assertTrue(TestUtils.healedRepairedBy(villager, infantry, barracks,0.7));
    }

    @Test
    public void healedByMonk(){
        assertTrue(TestUtils.hitpointsRemainsEqual(barracks, monk, siege));
    }

    @Test
    public void receiveDmgFromCastle(){
        assertTrue(TestUtils.receiveDamageFrom(barracks, castle, 0.7));
    }
}
