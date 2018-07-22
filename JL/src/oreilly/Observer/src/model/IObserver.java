package oreilly.Observer.src.model;

/**
 * 觀察者介面
 * 
 * @author SimonLee
 * @version 0.1.0
 */
public interface IObserver {
	
	/**
	 * 更新主題傳來的最新訊息
	 * 
	 * @author SimonLee
	 * @version 0.1.0
	 */
	public void update(ISubject ISubject);

}
