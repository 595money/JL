package test;

import domain.HelloSpeaker;
import model.HelloProxy;
import model.IHello;

public class TestHelloAOP {
	public static void main(String[] args) {
		
		HelloProxy proxy = new HelloProxy();
		
		proxy.setHelloMaker(new HelloSpeaker());
		
		IHello helloProxy = proxy;
		
		helloProxy.hello("Simon");
	
	}

}
