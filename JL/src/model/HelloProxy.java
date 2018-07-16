package model;

public class HelloProxy implements IHello{
	
	//必須在業務上添加的額外功能 (登入權限檢查、過程記錄..)
	
	private IHello helloMaker;
	
	public HelloProxy() {

	}

	
	public HelloProxy(IHello helloSpeaker) {
		this.helloMaker = helloSpeaker; 
	}
	
	
	
	public void hello(String name) {
		System.out.println("開始log....5656565656");
		
		helloMaker.hello(name);
		
		
		System.out.println("程式結束....");
		
	}


	public IHello getHelloMaker() {
		return helloMaker;
	}


	public void setHelloMaker(IHello helloMaker) {
		this.helloMaker = helloMaker;
	}

}
