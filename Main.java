package com.day21_exception;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("welcome to mood analyzer program with exception");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter sentence to analyzing mood");
		String message=sc.nextLine();
		MoodAnalyzer moodanalyzer=new MoodAnalyzer();
		System.out.println(moodanalyzer.analysemood(message));
	}

}
