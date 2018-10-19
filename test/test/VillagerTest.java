package test;

import org.junit.*;
import tarea1.*;

import static org.junit.Assert.*;

public class VillagerTest {
    private Attacker infantry;
    private Attacker castle;
    private Attacker villager, villagerEnemy;
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
        villagerEnemy = new Villager(50, 10);
        cavalry = new CavalryUnit(80, 10);
    }


    @Test
    public void receiveDmgFromInfantry(){
        assertTrue(TestUtils.receiveDamageFrom(villager, infantry, 1.5));
    }

    @Test
    public void receiveDmgFromArcher(){
        assertTrue(TestUtils.receiveDamageFrom(villager, archer, 1.5));
    }

    @Test
    public void receiveDmgFromCavalry(){
        assertTrue(TestUtils.receiveDamageFrom(villager, cavalry, 1.5));
    }

    @Test
    public void receiveDmgFromSiege(){
        assertTrue(TestUtils.receiveDamageFrom(villager, siege, 1.5));
    }

    @Test
    public void receiveDmgFromVillager(){
        assertTrue(TestUtils.receiveDamageFrom(villager, villagerEnemy, 1.0));
    }

    @Test
    public void healedByMonk(){
        assertTrue(TestUtils.healedRepairedBy(monk, infantry, villager, 0.5));
    }

    @Test
    public void receiveDmgFromCastle(){
        assertTrue(TestUtils.receiveDamageFrom(villager, castle, 1.2));
    }
}
