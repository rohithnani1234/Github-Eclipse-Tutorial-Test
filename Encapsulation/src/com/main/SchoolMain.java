package com.main;
import com.school.School;
import com.student.Student;

public class SchoolMain {

	public static void main(String[] args) {
		System.out.println("School");
		School school=School.getSchoolObject("Chaitanya", "HYD", "Good Learning");
		Student student=Student.getStudentObject("Johnny", "5th", school, 60);
		System.out.println(school);
		System.out.println();
		System.out.println("---Student Details---");
		System.out.println(student);
		
		System.out.println();
		School school1=School.getSchoolObject(null, null, null);
		Student student1=Student.getStudentObject(null, null, school1, 0);
		System.out.println(student1);
		
		
	}

}
