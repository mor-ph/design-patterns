package command;

public class Instructor {

	private IExercise exercise;

	public void switchExercise(IExercise exc) {
		this.exercise = exc;
		this.exercise.execute();
	}
	
}

