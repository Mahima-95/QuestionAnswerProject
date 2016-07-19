package com.xavient.app;
import java.util.Scanner;

import com.xavient.board.TestBoard;
import com.xavient.holder.QuestionHolder;
import com.xavient.holder.ScannerHolder;
import com.xavient.loader.QuestionAnserLoder;

public class App {
	App() {
		QuestionAnserLoder.load();
	}
	String name;
	int rightans = 0, wrongans = 0, j = 0;
	String q;



	public void sys() {

		int choice = 0;
		TestBoard testBoard = new TestBoard() ;
		System.out.println("Please Enter Your Name :-");
		Scanner sc = ScannerHolder.getScanner() ;
	
		name = sc.nextLine();
		System.out.println("Welcome To Java Exam");
		System.out.println("1.Java Beginners");
		System.out.println("2.Java Mediaters");
		System.out.println("3.Java Expertise");
		choice = sc.nextInt();
		
		if(choice == 1 || choice == 2 | choice == 3) {
			testBoard.exam(QuestionHolder.getQuestionHolder().get(choice));
		} else {
			// Your Option is wrong 
			System.out.println("Sorry Wrong Option ");
		}
	}

	/*
	 * No Use
	 * public void beginners() {
		System.out.println("Question:-");
		String ques1 = null;

		do {
			// for (int i = 0; i < 1; i++) {
			// if (ques1 != null && ques1.equalsIgnoreCase("quit")) {
			// check(ques1);
			// } else {

			System.out.println("Question no 1:-");
			System.out.println(" What are the main features of Java?");
			ques1 = sc.nextLine();
			quit(ques1);
			// System.out.println("for quit write <quit>");
			// q = sc.nextLine();

			check(ques1);

			System.out.println("Question no 2:-");
			System.out
					.println(" What are the fundamental principles of object oriented programming?");
			ques1 = sc.nextLine();
			check(ques1);

			System.out.println("Question no 3:-");
			System.out.println(" What do you mean by inheritance in java?");
			ques1 = sc.nextLine();
			check(ques1);
			quit(ques1);

			System.out.println("Question no 4:-");
			System.out
					.println(" What is constructor overloading? What is the use of constructor overloading?");
			ques1 = sc.nextLine();
			check(ques1);
			quit(ques1);

			System.out.println("Question no 5:-");
			System.out.println(" What is polymorphism in java?");
			ques1 = sc.nextLine();
			check(ques1);
			quit(ques1);

			System.out.println("Question no 6:-");
			System.out.println(" Can we overload the methods in java?");
			ques1 = sc.nextLine();
			check(ques1);
			quit(ques1);

			System.out.println("Question no 7:-");
			System.out.println("  Can we override the main() method?");
			ques1 = sc.nextLine();
			check(ques1);
			quit(ques1);

			System.out.println("Question no 8:-");
			System.out.println(" Does java supports multiple inheritance?");
			ques1 = sc.nextLine();
			check(ques1);
			quit(ques1);

			System.out.println("Question no 9:-");
			System.out.println(" Can we override the methods?");
			ques1 = sc.nextLine();
			check(ques1);
			quit(ques1);

			System.out.println("Question no 10:-");
			System.out.println(" Can we overload the main() method?");
			ques1 = sc.nextLine();
			check(ques1);
			quit(ques1);
			j++;
			// }
			// }
		} while (j < 1);
		System.out.println("right answers" + rightans);
		System.out.println("wrong answers" + wrongans);
	}*/

	/*public void check(String ques1) {
		String ans = ques1;

		if (ans.equalsIgnoreCase("true")) {
			rightans++;
		} else {
			wrongans++;
		}
	}

	public void quit(String q1) {
		if (q1.equalsIgnoreCase("quit")) {
			check(q1);
			System.out.println("right answers" + rightans);
			System.out.println("wrong answers" + wrongans);
			System.exit(0);
		}
	}*/

	public static void main(String[] args) {
		App t = new App();
		t.sys();
	}
}