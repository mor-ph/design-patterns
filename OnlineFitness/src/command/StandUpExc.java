package command;

public class StandUpExc implements IExercise {

	private Person person;
	public Exercise type = Exercise.STAND_UP;
	
	public StandUpExc(Person person){
		this.person = person;
	}
	
	@Override
	public void execute() {
		this.person.doExercise(type);	
	}

}
