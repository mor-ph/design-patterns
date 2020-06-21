package chainOfResponsibility;

import state.State;
import state.WaitState;
import observer.Observer;
import state.PrepareState;

public class ObsrvWorker implements Observer{

	private DlvrWorker worker;
	private String name;
	
	public ObsrvWorker(String name) {
		this.setName(name);
	}
	
	@Override
	public void update() {	
		State updState = worker.getUpdate();	
		if(updState.getStateName().equals(new PrepareState().getStateName())){
			System.out.println("Observer took package to storage room.");
			worker.setState(new WaitState());
			System.out.println("Everybody's free and waiting again.\n");
		}
	}

	@Override
	public void setObservable(DlvrWorker worker) {
		this.worker = worker;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
