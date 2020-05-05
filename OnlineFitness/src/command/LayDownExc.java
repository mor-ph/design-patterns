package command;

public class LayDownExc implements IExercise{

	private Person person;
	public Exercise type = Exercise.LAY_DOWN;
	
	public LayDownExc(Person person){
		this.person = person;
	}

	@Override
	public void execute() {
		this.person.doExercise(type);
	}
}
