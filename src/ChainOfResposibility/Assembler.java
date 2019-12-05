package ChainOfResposibility;

public class Assembler extends Employee{

	public Assembler() {
		super.authorityLevel= ASSEMBLER;
	}

	@Override
	protected void write(String message) {
		System.out.println(message + " all part have been put together");
		
	}

}
