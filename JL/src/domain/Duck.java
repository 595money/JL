package domain;

import model.IFlyBehavior;

public class Duck {
	private String name;
	private String gender;
	private IFlyBehavior flyBehavior;
	
	
	public void performFly(){
		
		flyBehavior.fly();
	}
	
	public IFlyBehavior getFlyBehavior() {
		return flyBehavior;
	}

	public void setFlyBehavior(IFlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
