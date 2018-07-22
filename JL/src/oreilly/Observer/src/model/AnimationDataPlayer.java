package oreilly.Observer.src.model;


public class AnimationDataPlayer implements IDisplayMessage{
	private IDisplayMessage myPc;
	public AnimationDataPlayer (IDisplayMessage pc) {
		myPc = pc;
	}
	@Override
	public void diplay() {
		System.out.println("<<動畫新番訊息開始撥放>>");
		myPc.diplay();
		System.out.println(">>動畫新番訊息結束撥放<<");		
	}
	
}
