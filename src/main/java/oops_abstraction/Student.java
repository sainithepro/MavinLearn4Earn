package oops_abstraction;

public abstract class Student {

	String name;
	int stuId;
	
	public static void main(String[] args) {
	
	}
	
	public abstract void studentElection();
	
	public void studentExam() {
		System.out.println("This is not an abstract class");
	}

}
