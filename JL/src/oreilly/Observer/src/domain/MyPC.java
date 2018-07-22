package oreilly.Observer.src.domain;
import oreilly.Observer.src.model.IDisplayMessage;
import oreilly.Observer.src.model.IObserver;
import oreilly.Observer.src.model.ISubject;

public class MyPC implements IObserver, IDisplayMessage {
	
	private AnimationData animationData;

	@Override
	public void update(ISubject ISubject) {
		if (ISubject instanceof AnimationData) {
			updateAnimation(ISubject);
		}

	}
	public void updateAnimation(ISubject ISubject) {
		animationData = (AnimationData) ISubject;
	}

	@Override
	public void diplay() {
		displayAnimationMSG();
	}
	
	public void displayAnimationMSG() {
		System.out.println("名稱：" + animationData.getName() + "\n" + "幾話：" + animationData.getEpisode());
	};
	

}
