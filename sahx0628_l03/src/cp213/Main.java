package cp213;

import java.time.LocalDate;

/**
 * Tests the Student class.
 *
 * @author Sushant Sah, 169060628, sahx0628@mylaurier.ca
 * @version 2022-01-17
 */
public class Main {

    public static void main(String[] args) {
	final String line = "-".repeat(40);
	int id = 123456;
	String surname = "Brown";
	String forename = "David";
	LocalDate birthDate =  LocalDate.parse("1962-10-25");
	Student student = new Student(id, forename, surname, birthDate);
	System.out.println("New Student:");
	System.out.println(student);
	System.out.println(line);
	
	// testing getters
	System.out.println("Test Getters");
	System.out.println("ID: " + student.getId());
	System.out.println("Forename: " + student.getForename());
	System.out.println("Surname: " + student.getSurname());
	System.out.println("Birthdate: " + student.getBirthDate());
	System.out.println(line);
	
	// call getters here
	System.out.println(line);
	System.out.println("Test Setters");
	student.setId(169060);
	student.setForename("Sushant");
	student.setSurname("Sah");
	student.setBirthDate(LocalDate.parse("2005-11-10"));
	
	// call setters here
	System.out.println("Updated Student:");
	System.out.println(student);
	System.out.println(line);
	System.out.println("Test compareTo");
	

	// create new Students - call comparisons here
	Student s1 = new Student(123456, "Brown", "David", LocalDate.of(1962, 10, 25));
	Student s2 = new Student(111111, "Brown", "Matthew", LocalDate.of(1962, 10, 25));
	Student s3 = new Student(123456, "Brown", "Alice", LocalDate.of(1970, 5, 15));
	System.out.println("Comparing student 1 to student 2: " + s1.compareTo(s2));
	System.out.println("Comparing student 2 to student 3: " + s2.compareTo(s3));
	System.out.println("Comparing student 3 to student 1: " + s1.compareTo(s3));
    }

}
