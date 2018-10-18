package tests;

import org.junit.*;
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
    	assertTrue(barracks.currentLife(), currentLife - archer.attackPts * 0.7);
    	
    	currentLife = barracks.currentLife();
    	archer.attack(barracks);
    	assertTrue(barracks.currentLife(), currentLife - archer.attackPts * 0.7);
    }
}
