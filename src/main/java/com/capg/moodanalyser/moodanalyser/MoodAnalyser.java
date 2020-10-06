package com.capg.moodanalyser.moodanalyser;

public class MoodAnalyser {
	//Mood Analyser user case to return happy or sad mood
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
