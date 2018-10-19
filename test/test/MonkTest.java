package test;

import org.junit.*;
import tarea1.*;

import static org.junit.Assert.*;

public class MonkTest {
	private Attackable barracks;
    private Attacker archerAlly;
    private Attacker archerEnemy;
    private Attacker monk;
    private Attacker resurrecter;
    private Attacker castle;
    private Attacker siege;


    public static void revive(Attacker reviver, Attacker dead){
        assertTrue(!dead.isAlive());
        reviver.attack(dead);
        assertTrue(!dead.isAlive());
    }


    public static void instaDeathAndNotReviving(Attacker attacker, Attacker resurrecter, Attacker monk){
        int currentLife = monk.currentLife();
        assertTrue(currentLife > 30 && attacker.attackPts() < 12);
        attacker.attack(monk);
        revive(resurrecter, monk);
    }


    @Before 
    public void setUp(){
    	barracks = new Barracks(10000000);
    	archerAlly = new ArcherUnit(50, 10);
    	archerEnemy = new ArcherUnit(50, 10);
    	monk = new Monk(50, 10);
        resurrecter = new Monk(50, 10);
        castle = new Castle(100, 10);
        siege = new SiegeUnit(100, 10);
    }


    @Test 
    public void healArcher(){
    	archerEnemy.attack(archerAlly);
    	int currentLife = archerAlly.currentLife();
    	monk.attack(archerAlly);
    	assertTrue(archerAlly.currentLife() == currentLife + (int)(monk.attackPts() * 0.5));
    }


    @Test
    public void notHealingBarracks(){
        archerEnemy.attack(barracks);
        int currentLife = barracks.currentLife();
        monk.attack(barracks);
        assertTrue(barracks.currentLife() == currentLife);
    }


    @Test
    public void instaDeathAndNotRevivingByArcher(){
        instaDeathAndNotReviving(archerEnemy, resurrecter, monk);
    }

    @Test
    public void instaDeathAndNotRevivingByCastle(){
        instaDeathAndNotReviving(castle, resurrecter, monk);
    }

    @Test
    public void instaDeathAndNotRevivingBySiege(){
        instaDeathAndNotReviving(siege, resurrecter, monk);
    }


    @Test
    public void notHealingAfterDeath(){
        int currentLife = monk.currentLife();
        assertTrue(currentLife > 30 && archerEnemy.attackPts() < 12);
        archerEnemy.attack(monk);
        assertTrue(!monk.isAlive());

        archerEnemy.attack(archerAlly);
        currentLife = archerAlly.currentLife();
        monk.attack(archerAlly);
        assertTrue(archerAlly.currentLife() == currentLife);
    }
}