package com.day21_exception;

public class MoodAnalyzer {
	String analyzeresult= " ";
	
	 public String analysemood(String message) {
		 boolean analyze=message.toUpperCase().contains("SAD");
		if (analyze==true) {
			analyzeresult="SAD";
		}
		else {
			analyzeresult="HAPPY";
		}
		return analyzeresult;
		}
	    }
	   