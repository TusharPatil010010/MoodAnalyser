package com.capg.moodanalyser.moodanalyser;

public class MoodAnalyser {
	
	String message;
	public MoodAnalyser() {
		
	}
	public MoodAnalyser(String message) {
		this.message = message;
	}
	public String analyseMood(){
		if(message.equalsIgnoreCase("I am in sad mood")) {
			return "SAD";
		}
		else {	
			return "HAPPY";
		}
	}	
}
