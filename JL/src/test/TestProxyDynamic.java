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
			LogHandlerDynamic logHandler = new LogHandlerDynamic();
			IHello helloProxy = (IHello) logHandler.bind(new HelloSpeaker());
			helloProxy.hello("Simon");
			return;
		};	
		System.out.println("無此功能");
	}
}
