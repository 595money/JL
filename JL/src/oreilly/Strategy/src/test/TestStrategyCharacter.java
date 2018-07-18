package oreilly.Strategy.src.test;

import oreilly.Strategy.src.domain.Character;
import oreilly.Strategy.src.domain.Queen;
import oreilly.Strategy.src.model.TheScepter;

public class TestStrategyCharacter {
	public static void main(String[] args) {

		//Character queen = new Queen(new TheScepter());
		Character queen = new Queen();
		queen.setWeaponeHandeler(new TheScepter());
		queen.waving();
		
	}
}
