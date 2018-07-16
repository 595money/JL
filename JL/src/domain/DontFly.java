package domain;

import model.IFlyBehavior;

public class DontFly implements IFlyBehavior{

	@Override
	public void fly() {
		System.out.println("I CAN'T FLY!! I CAN'T FLY!! I CAN'T FLY!! I CAN'T FLY!!");
		
	}
	

}
