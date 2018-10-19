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


    @Before 
    public void setUp(){
    	barracks = new Barracks(10000000);
    	archerAlly = new Archer(50, 10);
    	archerEnemy = new Archer(50, 10);
    	monk = new Monk(50, 10);
        resurrecter = new Monk(50, 10);
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
    public void instaDeathAndNotReviving(){
        int currentLife = monk.currentLife();
        assertTrue(currentLife > 30 && archerEnemy.attackPts() < 12);
        archerEnemy.attack(monk);
        assertTrue(!monk.isAlive());

        resurrecter.attack(monk);
        assertTrue(!monk.isAlive());
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