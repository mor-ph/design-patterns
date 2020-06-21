package state;

import chainOfResponsibility.DlvrWorker;

public class PrepareState implements State{

	private WorkerState stateName = WorkerState.PREPARE;

	@Override
	public void applyState(DlvrWorker worker) {
		worker.setState(this);		
	}

	@Override
	public WorkerState getStateName() {
		return this.stateName;
	}

}
