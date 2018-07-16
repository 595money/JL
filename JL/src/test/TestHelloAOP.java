package test;

import domain.HelloSpeaker;
import model.HelloProxy;
import model.IHello;

public class TestHelloAOP {
	public static void main(String[] args) {
		
		IHello helloProxy = new HelloProxy(new HelloSpeaker());
		
		helloProxy.hello("Simon");
	
	}

}
