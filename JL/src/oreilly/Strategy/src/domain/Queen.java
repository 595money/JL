package oreilly.Strategy.src.domain;

import oreilly.Strategy.src.model.TheScepter;

public class Queen extends Character{
	public Queen() {};
	public Queen(TheScepter scepter) {
		setWeaponeHandeler(scepter);
	};
	
}
