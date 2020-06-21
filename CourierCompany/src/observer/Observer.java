package observer;

import chainOfResponsibility.DlvrWorker;

public interface Observer {
	public void update();
	public void setObservable(DlvrWorker worker);
}
