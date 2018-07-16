package test;

import domain.DontFly;
import domain.Duck;
import domain.YellowSmallDuck;

public class TestYellowSmallDuck {
	public static void main(String[] args) {
		
		Duck yellow = new YellowSmallDuck();
//
		yellow.performFly();
		
		
		
		yellow.setFlyBehavior(new DontFly());
		yellow.performFly();
		
	}
}
