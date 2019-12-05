package ChainOfResposibility;

public class PartCollector extends Employee {

	public PartCollector() {
		super.authorityLevel= PART_COLLECTOR;
	}
	
	@Override
	protected void write(String message) {
		System.out.println(message + " all part have been gather");	
	}

}
