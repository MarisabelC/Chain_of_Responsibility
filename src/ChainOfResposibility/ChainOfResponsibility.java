package ChainOfResposibility;

public class ChainOfResponsibility {

	public static void main(String[] args) {
		PartCollector partCollector= new PartCollector();
		Assembler assembler = new Assembler();
		Welder welder= new Welder();
		Painter painter= new Painter();
		
		partCollector.setNextEmployee(assembler);
		assembler.setNextEmployee(welder);
		welder.setNextEmployee(painter);

		partCollector.doWork(Employee.WELDER, " Hey, do your job!; ");
	}

}
