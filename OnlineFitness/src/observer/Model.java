package observer;

import java.util.ArrayList;
import java.util.List;

public class Model extends MrFitMan implements Observable{

	private List<Observer> observers = new ArrayList<Observer>();
	private Exercise lastExc;
	
	public Model(String name) {
		super(name);
	}

	@Override
	public void subscribe(Observer observer) {
		this.observers.add(observer);
		observer.setModel(this);
	}

	@Override
	public void unsubscribe(Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer o : observers) {
			o.update();
		}
	}

	@Override
	public Exercise getUpdate() {
		return this.lastExc;
	}
	
	public void doExercise(Exercise type) {
		super.doExercise(type);
		lastExc = type;
		this.notifyObservers();
	}
}
