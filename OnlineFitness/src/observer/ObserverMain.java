package observer;

public class ObserverMain {

	public static void main(String[] args) {
		Model model = new Model("ExampleMan");
		Viewer v1 = new Viewer("Karen");
		Viewer v2 = new Viewer("Kyle");
		Viewer v3 = new Viewer("Kdone");
		Instructor instructor = new Instructor();
		
		instructor.model = model;

		model.subscribe(v1);
		model.subscribe(v2);
		model.subscribe(v3);

		instructor.switchExercise(Exercise.STAND_UP);
		instructor.switchExercise(Exercise.LAY_DOWN);
	}

}
