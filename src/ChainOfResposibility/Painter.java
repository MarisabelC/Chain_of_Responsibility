package ChainOfResposibility;

public class Painter extends Employee{

	public Painter() {
		super.authorityLevel= PAINTER;
	}

	@Override
	protected void write(String message) {
		System.out.println(message + " car complete");
		
	}

}
