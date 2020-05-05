package command;


public class CommandMain {

	public static void main(String[] args) {
		Model model = new Model("Model");
		Person viewer1 = new Person("Cermit");
		Person viewer2 = new Person("Linda");
		Person viewer3 = new Person("Carol");
		
		Instructor instructor = new Instructor();
		
		IExercise standUp = new StandUpExc(model);
		IExercise layDown = new LayDownExc(model);
		
		model.viewers.add(viewer1);
		model.viewers.add(viewer2);
		model.viewers.add(viewer3);

		instructor.switchExercise(layDown);
		instructor.switchExercise(standUp);
	}

}
