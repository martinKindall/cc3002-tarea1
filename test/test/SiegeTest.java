package test;

import org.junit.*;
import tarea1.*;

import static org.junit.Assert.*;

public class SiegeTest {
    private Attacker infantry;
    private Attacker villager;
    private Attacker monk;
    private Attacker siege, siegeEnemy;
    private Attacker archer;
    private Attacker cavalry;
    private Attacker castle;


    @Before
    public void setUp(){
        infantry = new InfantryUnit(50, 10);
        castle = new Castle(50, 10);
        villager = new Villager(50, 10);
        monk = new Monk(50, 10);
        archer = new ArcherUnit(50, 10);
        cavalry = new CavalryUnit(80, 10);
        castle = new Castle(1000, 20);
        siege = new SiegeUnit(100, 10);
        siegeEnemy = new SiegeUnit(1000, 20);
    }


    @Test
    public void receiveDmgFromInfantry(){
        assertTrue(TestUtils.receiveDamageFrom(siege, infantry, 1.2));
    }

    @Test
    public void receiveDmgFromArcher(){
        assertTrue(TestUtils.receiveDamageFrom(siege, archer, 0.8));
    }

    @Test
    public void receiveDmgFromCavalry(){
        assertTrue(TestUtils.receiveDamageFrom(siege, cavalry, 1.2));
    }

    @Test
    public void receiveDmgFromSiege(){
        assertTrue(TestUtils.receiveDamageFrom(siege, siegeEnemy, 1.5));
    }

    @Test
    public void receiveDmgFromVillager(){
        assertTrue(TestUtils.healedRepairedBy(villager, infantry, siege,0.5));
    }

    @Test
    public void healedByMonk(){
        assertTrue(TestUtils.hitpointsRemainsEqual(siege, monk, siegeEnemy));
    }

    @Test
    public void receiveDmgFromCastle(){
        assertTrue(TestUtils.receiveDamageFrom(siege, castle, 0.5));
    }
}
