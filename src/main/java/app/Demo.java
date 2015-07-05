package app;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Student;
import db.StudentRepository;




public class Demo {
	public static void main(String[] args) {
		Student student = new Student();
		System.out.println("Enter your name:");
		
		Scanner scanner = new Scanner(System.in);
		String name  = scanner.nextLine();
		student.setName(name);
		
		System.out.println("Enter your id:");
		int id = scanner.nextInt();
		student.setId(id);
		
		System.out.println("###################################");
		List<String> courses = new ArrayList<>();

		System.out.println("Enter your courses:");
		Scanner scanner2 =  new Scanner(System.in);
		String course  = scanner2.nextLine();
		
		while(!(course.equalsIgnoreCase("END"))){
			courses.add(course);
			System.out.println("Enter your courses:");
			course  = scanner2.nextLine();
			
			
		}
		student.setCourses(courses);
		student.addFrutes("1", "Apple");
		student.addFrutes("2", "Orange");
		student.addFrutes("3", "Cococut");
		student.addFrutes("4", "Cucumber");
		
		System.out.println("###################################");
		print(student);
		
		StudentRepository rep = new StudentRepository();
		rep.Save(student);
		//rep.get(23);
	}
	public static void print(Student student){
		System.out.println("Student id is : " + student.getId());
		System.out.println("Student id is : " + student.getName());
		System.out.println("Student Course list: ");
		List<String> courseList = student.getCourses();
		for (int i = 0; i < courseList.size(); i++) {
			System.out.println((i +1) + " --> " + courseList.get(i));
		}
	}

}
