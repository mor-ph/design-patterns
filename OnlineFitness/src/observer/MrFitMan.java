package observer;

public class MrFitMan {
	
	public String name;
	
	public MrFitMan(String name) {
		this.name = name;
	}
	
	public void doExercise(Exercise type) {
		switch(type) {
			case LAY_DOWN: 
				System.out.println(name + " layed down.");
				break;		
			case STAND_UP:
				System.out.println(name + " stood up.");
				break;			
		}
	}
}
