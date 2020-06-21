package state;

import chainOfResponsibility.DlvrWorker;

public class WaitState implements State {
	
	private WorkerState stateName = WorkerState.WAIT;

	@Override
	public void applyState(DlvrWorker worker) {
		worker.setState(this);
	}

	@Override
	public WorkerState getStateName() {
		return this.stateName;
	}
	
}
