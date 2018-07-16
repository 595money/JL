package domain;

import model.IFlyBehavior;

public class CanFly implements IFlyBehavior{

	@Override public void fly(){
		System.out.println("I can Fly!!");
	}

}
