package observer;

import chainOfResponsibility.ObsrvWorker;
import state.State;

public interface Observable {
	public void subscribe(ObsrvWorker observer);
	public void unsubscribe(ObsrvWorker observer);
	public void notifyObserver();
	public State getUpdate();
}
