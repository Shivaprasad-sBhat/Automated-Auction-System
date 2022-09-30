package com.question3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		List<Student> student=new ArrayList<>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Student Details");

		String s="y";
		
		while(true) {
		System.out.println("Enter the student name");
		String name=sc.nextLine();
		
		System.out.println("roll number");
		int roll=sc.nextInt();
		
		System.out.println("Maths marks");
		int maths=sc.nextInt();
		
		System.out.println("Science marks");
		int science=sc.nextInt();
		
		System.out.println("English marks");
		int eng=sc.nextInt();
		
		student.add(new Student(roll,name,maths,science,eng));
		sc.nextLine();
		System.out.println("Add more student y/n?");
		s=sc.nextLine();
		if(s.equals("n")) {
			System.out.println("Thank you!");
			break;
		}
	}
		
//		student.add(new Student(21,"ram",32,54,54));
//		student.add(new Student(1,"amit",67,87,56));
		
		System.out.println("====================================");
		System.out.println("Student details =>");
		System.out.println(student);
		
	}
}
