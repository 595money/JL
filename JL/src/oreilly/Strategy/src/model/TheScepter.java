package oreilly.Strategy.src.model;

public class TheScepter implements IUseWeapon{

	@Override
	public void takeOut() {
		System.out.println("權杖!砰砰!");
	}

}
