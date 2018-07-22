package oreilly.Observer.src.domain;

import java.util.ArrayList;

import oreilly.Observer.src.model.IObserver;
import oreilly.Observer.src.model.ISubject;

/**
 * 動畫訊息主題
 *
 * @author SimonLee
 * @version 0.1.0
 * @see ISubject
 * @see IObserver
 * 
 */
public class AnimationData implements ISubject {
	private String name;
	private String episode;
	private ArrayList<IObserver> observers;
	
	/**
	 * AnimationData無參數建構子<br>
	 * 初始化觀察者list
	 * @author SimonLee
	 * @version 0.1.0
	 */
	public AnimationData() {
		this.setObservers(new ArrayList<IObserver>());
	}
	
	/**
	 * @author SimonLee
	 * @version 0.1.0
	 */
	@Override
	public void registerObserver(IObserver IObserver) {
		this.observers.add(IObserver);
		IObserver.update(this);
	}

	/**
	 * @author SimonLee
	 * @version 0.1.0
	 */
	@Override
	public void removeObserver(IObserver IObserver) {
		int i = this.observers.indexOf(IObserver);
		if (i >= 0) {
			observers.remove(IObserver);
		}
		
	}

	/**
	 * 訊息更新時呼叫此method<br>
	 * 1.更新主題物件上的資訊 <br>
	 * 2.判斷觀察者list是否為empty
	 * 3.若非empty將更新後的資訊傳入this.observers名單中的觀察者
	 * @author SimonLee
	 * @version 0.1.0
	 */
	public void setNewMessage(String name, String episod) {
		setName(name);
		setEpisode(episod);
		if (!observers.isEmpty()) {
			messageChanged();
		}
	}

	/**
	 * 用來觸發notifyObserver()的method
	 * 
	 * @author SimonLee
	 * @version 0.1.0
	 * @see AnimationData#notifyObserver()
	 */
	public void messageChanged() {
		notifyObserver();
	}

	@Override
	public void notifyObserver() {
		for (IObserver iObserver : observers) {
			iObserver.update(this);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEpisode() {
		return episode;
	}

	public void setEpisode(String episode) {
		this.episode = episode;
	}

	public ArrayList<IObserver> getObservers() {
		return observers;
	}

	public void setObservers(ArrayList<IObserver> observers) {
		this.observers = observers;
	}
}
