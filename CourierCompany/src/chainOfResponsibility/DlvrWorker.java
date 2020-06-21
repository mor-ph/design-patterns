package chainOfResponsibility;

import chainOfResponsibility.Scope;
import observer.Observable;
import chainOfResponsibility.Package;
import state.PrepareState;
import state.State;
import state.WaitState;

public class DlvrWorker implements Observable{
	
	private String name;
	private State state;
	State prepState = new PrepareState();
	State waitState = new WaitState();
	private ObsrvWorker observer;
	private DlvrWorker next;
	private Scope scope;
	
	public DlvrWorker(String name, Scope scope) {
		this.name = name;
		this.scope = scope;
	}

	public void setNextDlvrWorker(DlvrWorker worker) {
		this.next = worker;
	}
	
	public void processPackage(Package pack) {
		if(this.getScope().equals(pack.getScope())){
			this.setState(prepState);
			System.out.println(name + " is processing package " + pack.getName());
			this.notifyObserver();
		}
		else if(next != null) {
			ObsrvWorker temp = this.observer;
			next.subscribe(temp);
			this.unsubscribe(this.observer);
			next.processPackage(pack);
		}
	}
	
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Scope getScope() {
		return scope;
	}
	public void setScope(Scope scope) {
		this.scope = scope;
	}
	@Override
	public void subscribe(ObsrvWorker observer) {
		this.observer = observer; 		
		observer.setObservable(this);
	}
	@Override
	public void unsubscribe(ObsrvWorker observer) {
		this.observer = null;
	}
	@Override
	public void notifyObserver() {
		this.observer.update();
	}
	@Override
	public State getUpdate() {
		return this.state;
	}

}
