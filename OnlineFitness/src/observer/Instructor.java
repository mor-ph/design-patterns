package observer;

public class Instructor {
	
	public Model model;
	
	public void switchExercise(Exercise type) {
		model.doExercise(type);
	}
}
