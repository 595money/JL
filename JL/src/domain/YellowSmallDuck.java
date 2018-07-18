package domain;

import model.IFlyBehavior;

public class YellowSmallDuck extends Duck {

	public YellowSmallDuck() {
		
		setFlyBehavior(new CanFly());	
	}	
	
}
