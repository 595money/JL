package domain;

import model.IHello;

public class HelloSpeaker implements IHello {
	//業務流程
	public void hello(String name) {
		
		//log
		System.out.println("HI ! MY NAME IS~~~~ " + name);
		//log
		
	}

}
