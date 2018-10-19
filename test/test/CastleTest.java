package test;

import org.junit.*;
import tarea1.*;

import static org.junit.Assert.*;

public class CastleTest {
    private Attacker infantry;
    private Attacker villager;
    private Attacker monk;
    private Attacker siege;
    private Attacker archer;
    private Attacker cavalry;
    private Attacker castle, castleEnemy;


    @Before
    public void setUp(){
        infantry = new InfantryUnit(50, 10);
        castle = new Castle(50, 10);
        villager = new Villager(50, 10);
        monk = new Monk(50, 10);
        siege = new SiegeUnit(100, 10);
        archer = new ArcherUnit(50, 10);
        cavalry = new CavalryUnit(80, 10);
        castle = new Castle(1000, 20);
        castleEnemy = new Castle(1000, 20);
    }


    @Test
    public void receiveDmgFromInfantry(){
        assertTrue(TestUtils.receiveDamageFrom(castle, infantry, 0.3));
    }

    @Test
    public void receiveDmgFromArcher(){
        assertTrue(TestUtils.receiveDamageFrom(castle, archer, 0.1));
    }

    @Test
    public void receiveDmgFromCavalry(){
        assertTrue(TestUtils.receiveDamageFrom(castle, cavalry, 0.3));
    }

    @Test
    public void receiveDmgFromSiege(){
        assertTrue(TestUtils.receiveDamageFrom(castle, siege, 2.0));
    }

    @Test
    public void receiveDmgFromVillager(){
        assertTrue(TestUtils.healedRepairedBy(villager, infantry, castle,0.3));
    }

    @Test
    public void healedByMonk(){
        assertTrue(TestUtils.hitpointsRemainsEqual(castle, monk, siege));
    }

    @Test
    public void receiveDmgFromCastle(){
        assertTrue(TestUtils.receiveDamageFrom(castle, castleEnemy, 0.1));
    }
}
