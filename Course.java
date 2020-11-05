package CopyCourse;

import java.util.Collection;
import java.util.ArrayList;

public class Course {
	private String courseName;
	private String[] students=new String[100];
	private int numberOfStudents;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	
	public String[] getStudents() {
		return students;
	}
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	public String getCourseName() {
		return courseName;
	}
	
	
	@Override
	public Object clone() {
		Course newCourse = new Course(getCourseName());
		newCourse.getStudents();
		try 
		{
			return super.clone();
		}
		
		catch (CloneNotSupportedException ex) {
			return null;
		}
	}
}
