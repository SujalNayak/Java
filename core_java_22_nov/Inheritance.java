package core_java_22_nov;

import java.util.Scanner;

public class Inheritance {
	public static void main(String[] args) {
		Staff s = new Staff();
		Faculty f = new Faculty();
		s.input();
		s.empcode();
		f.rank();
		f.salary();
	}
}

class Staff{
	Scanner scr = new Scanner(System.in);
	void input() {
//		System.out.println("Input : Staff()...");
		System.out.println("Enter Name: ");
		String name = scr.next();
		System.out.println(name);
	}
	void empcode() {
//		System.out.println("Empcode : Staff()...");
		System.out.println("Enter empcode: ");
		int empcode = scr.nextInt();
		System.out.println(empcode);
		
	}
}

class Faculty extends Staff{
	void rank() {
//		System.out.println("Rank : Faculty()...");
		System.out.println("Enter Rank: ");
		int rank = scr.nextInt();
		System.out.println(rank);
	}
	void salary() {
//		System.out.println("Salary : Salary()...");
		System.out.println("Enter Salary: ");
		int salary = scr.nextInt();
		System.out.println(salary);
	}
}