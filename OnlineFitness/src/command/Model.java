package command;

import java.util.ArrayList;
import java.util.List;

public class Model extends Person{
	
	public List<Person> viewers = new ArrayList<Person>();

	public Model(String name) {
		super(name);
	}
	public void doExercise(Exercise type) {
		super.doExercise(type);
		for(Person v : viewers) {
			v.doExercise(type);
		}
	}
}
