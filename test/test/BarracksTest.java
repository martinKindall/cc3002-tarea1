package test;

import org.junit.*;
import tarea1.Archer;
import tarea1.Attackable;
import tarea1.Attacker;
import tarea1.Barracks;

import static org.junit.Assert.*;

public class BarracksTest {
    private Attackable barracks;
    private Attacker archer;


    @Before 
    public void setUp(){
    	barracks = new Barracks(10000000);
    	archer = new Archer(50, 10);
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
