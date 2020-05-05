package observer;

public class Viewer extends MrFitMan implements Observer{

	private Observable model;
	
	public Viewer(String name) {
		super(name);
	}

	@Override
	public void update() {
		super.doExercise(model.getUpdate());
		
	}

	@Override
	public void setModel(Observable model) {
		this.model = model;
	}

}
