package oreilly.Observer.src.domain;

import oreilly.Observer.src.model.IDisplayMessage;
import oreilly.Observer.src.model.IObserver;
import oreilly.Observer.src.model.ISubject;

public class MyPC implements IObserver, IDisplayMessage {

	private ISubject animationData;
	private String animatioNname;
	private String animationEpisode;

	public MyPC() {
	}

	public MyPC(ISubject data) {
		if (data instanceof AnimationData) {
			setAnimationData(data);
			animationData.registerObserver(this);
		}
	}

	@Override
	public void update(ISubject ISubject) {
		if (ISubject instanceof AnimationData) {
			updateAnimation(ISubject);
		}

	}

	public void updateAnimation(ISubject ISubject) {
		AnimationData data = (AnimationData) ISubject;
		setAnimatioNname(data.getName());
		setAnimationEpisode(data.getEpisode());
	}

	@Override
	public void diplay() {
		displayAnimationMSG();
	}

	public void displayAnimationMSG() {
		System.out.println("名稱：" + getAnimatioNname() + "\n" + "幾話：" + getAnimationEpisode());
	}

	public ISubject getAnimationData() {
		return animationData;
	}

	public void setAnimationData(ISubject animationData) {
		this.animationData = animationData;
	}

	public String getAnimatioNname() {
		return animatioNname;
	}

	public void setAnimatioNname(String animatioNname) {
		this.animatioNname = animatioNname;
	}

	public String getAnimationEpisode() {
		return animationEpisode;
	}

	public void setAnimationEpisode(String animationEpisode) {
		this.animationEpisode = animationEpisode;
	};

}
