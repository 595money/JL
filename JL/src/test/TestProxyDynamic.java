package test;

import domain.HelloSpeaker;
import model.IHello;
import model.LogHandlerDynamic;

public class TestProxyDynamic {

	public static void main(String[] args) {
		TestProxyDynamic test = new TestProxyDynamic();
		test.run("hello");

	}

	private void run(String feature) {
		if ("hello".equals(feature)) {
			
			//1.建立logDelegate Obj
			LogHandlerDynamic logHandler = new LogHandlerDynamic();
			//2.set 要委託的功能
			logHandler.setDelegate(new HelloSpeaker());
			IHello helloProxy = (IHello) logHandler.bind();
			helloProxy.hello("Simon");		
			return;
		};	
		System.out.println("無此功能");
	}
}
