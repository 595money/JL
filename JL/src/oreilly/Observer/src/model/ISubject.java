package oreilly.Observer.src.model;

/**
 * 主題介面
 * 
 * @author SimonLee
 * @version 0.1.0
 */
public interface ISubject {

	/**
	 * 註冊需要接收訊息的觀察者
	 * 
	 * @author SimonLee
	 * @version 0.1.0
	 * @param 
	 *            
	 */
	public void registerObserver(IObserver IObserver);

	/**
	 * 移除不需要接收訊息的觀察者
	 * 
	 * @author SimonLee
	 * @version 0.1.0
	 * @param 
	 *            
	 */
	public void removeObserver(IObserver IObserver);

	/**
	 * 將主題中變更的訊息傳送到觀察者
	 * 
	 * @author SimonLee
	 * @version 0.1.0
	 *            實作觀察者介面的類別
	 */
	public void notifyObserver();
}
