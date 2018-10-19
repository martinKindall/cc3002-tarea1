package test;

import org.junit.*;
import tarea1.*;

import static org.junit.Assert.*;

public class BarracksTest {
    private Attackable barracks;
    private Attacker archer;


    @Before 
    public void setUp(){
    	barracks = new Barracks(10000000);
    	archer = new ArcherUnit(50, 10);
    }


    @Test 
    public void receiveDamageFromArcher(){
    	int currentLife = barracks.currentLife();
    	archer.attack(barracks);
    	assertTrue(barracks.currentLife() == (int)(currentLife - archer.attackPts() * 0.7));
    	
    	currentLife = barracks.currentLife();
    	archer.attack(barracks);
    	assertTrue(barracks.currentLife() == (int)(currentLife - archer.attackPts() * 0.7));
    }
}
