package test;

import domain.Duck;
import domain.YellowSmallDuck;

public class TestYellowSmallDuck {
	public static void main(String[] args) {
		
		Duck yellow = new YellowSmallDuck();

//		yellow.setFlyBehavior(new DontFly());
//		yellow.setFlyBehavior(new CanFly());
		yellow.performFly();

	}
}
