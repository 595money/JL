package oreilly.Observer.src.test;

import oreilly.Observer.src.domain.AnimationData;
import oreilly.Observer.src.domain.MyPC;
import oreilly.Observer.src.model.AnimationDataPlayer;
import oreilly.Observer.src.model.IDisplayMessage;

public class TestObserver {
	public static void main(String[] args) {

		AnimationData aData = new AnimationData();
		MyPC myPc = new MyPC(aData); 
		IDisplayMessage mypcProxy = new AnimationDataPlayer(myPc);

		aData.setNewMessage("Overlord I", "24");	
		aData.removeObserver(myPc);
		aData.setNewMessage("Overlord III", "24");
		aData.registerObserver(myPc);
		mypcProxy.diplay();
	}
}
