package oreilly.Strategy.src.domain;

import oreilly.Strategy.src.model.IUseWeapon;

public class Character {
	
	private String name;
	
	private IUseWeapon weaponeHandeler;
	

	public void waving() {
		weaponeHandeler.takeOut();
	}

	public IUseWeapon getWeaponeHandeler() {
		return weaponeHandeler;
	}

	public void setWeaponeHandeler(IUseWeapon weaponeHandeler) {
		this.weaponeHandeler = weaponeHandeler;
	}

	public String getName() {
		return name;
	}

	public void setName(String p) {
		name = p;

	}
}
