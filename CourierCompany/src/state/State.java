package state;

import chainOfResponsibility.DlvrWorker;

public interface State {
	public void applyState(DlvrWorker worker);
	public WorkerState getStateName();
}
