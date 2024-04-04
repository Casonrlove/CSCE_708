/*
 * Lab 12.1 (3 classes/multiple objects/ArrayLists)
 * Directions:
 * 	Complete the Course class by implementing the printRoster() method, which outputs a list of all students 
 * 	enrolled in a course and also the total number of students in the course.
 * 	
 * 	Given classes:
 * 		Class LabProgram contains the main method for testing the program
 * 		Class Student represents a classroom student, which has three fields: first name, last name, and GPA
 * 		
 * 		Class Course represents a course, which contains an ArrayList of Student objects as a course roster. (Type your code in here)
 * 
 * Ex: If the program has 4 students enrolled in the course, the output looks like:
 * 	Henry Cabot (GPA: 3.5)
 * 	Brenda Stern (GPA 2.0)
 * 	Jane Flynn (GPA: 3.9)
 * 	Lynda Robinson (GPA: 3.2)
 * 	Students: 4
 */

import java.util.ArrayList;

public class Course {

	private ArrayList<Student> roster; //collection of Student objects

	public Course() {
		roster = new ArrayList<Student>();
	}

	public void printRoster() {
		int length = roster.size();
	   for(int i = 0; i < length; i++){
		Student currStudent = roster.get(i);
		String output = currStudent.toString();
		System.out.println(output);
	   } 
	   System.out.println("Students: " + length);;
	}

	public void addStudent(Student s) {
		roster.add(s);
	}
}
