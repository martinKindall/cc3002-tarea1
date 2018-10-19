package test;
import tarea1.*;

public class TestUtils {

	public static boolean receiveDamageFrom(Attackable attackable, Attacker attacker, double multiplier){
		int currentLife = attackable.currentLife();
        attacker.attack(attackable);
        return attackable.currentLife() == currentLife - (int)(attacker.attackPts() * multiplier);
	}

	public static boolean healedRepairedBy(Attacker repairOrHeal, Attacker enemy, Attackable attackable, double multiplier){
		enemy.attack(attackable);
		int currentLife = attackable.currentLife();
		repairOrHeal.attack(attackable);
		return attackable.currentLife() == currentLife + (int)(repairOrHeal.attackPts() * multiplier);
	}

	public static boolean hitpointsRemainsEqual(Attackable attackable, Attacker healer, Attacker enemy){
		enemy.attack(attackable);
		int currentLife = attackable.currentLife();
		healer.attack(attackable);
		return attackable.currentLife() == currentLife;
	}
}
