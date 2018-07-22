package oreilly.Observer.src.test;

import oreilly.Observer.src.domain.AnimationData;
import oreilly.Observer.src.domain.MyPC;
import oreilly.Observer.src.model.AnimationDataPlayer;
import oreilly.Observer.src.model.IDisplayMessage;

public class TestObserver {
	public static void main(String[] args) {
		MyPC myPc = new MyPC(); 
		IDisplayMessage mypcProxy = new AnimationDataPlayer(myPc);
		AnimationData aData = new AnimationData();
		aData.registerObserver(myPc);
		aData.setNewMessage("Overlord I", "24");	
		aData.removeObserver(myPc);
		aData.setNewMessage("Overlord III", "24");
		mypcProxy.diplay();

	}
}
