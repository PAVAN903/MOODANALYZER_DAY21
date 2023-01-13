package com.day21_exception;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class Testcase_1 {
	MoodAnalyzer moodanalyzer=new MoodAnalyzer();
	

	@Test
	void test() throws Exception {
		Scanner sc=new Scanner(System.in);
		String message=sc.nextLine();
		String actual=moodanalyzer.analysemood(message);
		Assert.assertEquals("HAPPY",actual);
	
	}

}
