package midPractise;

public class Student { // Class definition
	private String name;
	private int rollnumber;
	private double marks;
	
	public Student(int rollnumber, double marks, String name) { // Constructor
		this.rollnumber = rollnumber;
		this.marks = marks;
		this.name = name;
	}
	
	
	// Getters and Setters for all params
	public String getName() {
		return name;
	}
	
	public void setName(String name) { //(String Name) part is needed dont forget, also add cond if nessescary
		this.name = name;
	}
	
	public int getRollnumber() {
		return rollnumber;
	}
	
	public void setRollnumber(int rollnumber) {
		if (rollnumber > 0) {
			this.rollnumber = rollnumber;
		}
	}
	
	public double getMarks() {
		return marks;
	}
	
	public void setMarks(double marks) {
		if (marks > 0) {
			this.marks = marks;
		}
	}
	
	public void printDetails() {
		System.out.println(this.toString());
	}
	public String toString(){
		return "Student: " + name + rollnumber;
	}
	
	
	public static void main(String[] args) {
		// Create two student objects
		Student student1 = new Student(101,85.5,"Alice");
		Student student2 = new Student(102,78.2,"Bob");
		
		//print details  
		student1.printDetails();
		student2.printDetails();
		
		student1.setMarks(90.0);
		
		//Print Updated Mark
		System.out.println("Updated information for Alice");
		student1.printDetails();
		
		//Print to Test
		
		
		
	}
	
}
