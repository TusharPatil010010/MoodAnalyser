package com.capg.moodanalyser.moodanalyser;

public class MoodAnalyser {
	public String message;
	public MoodAnalyser() { 

	}
	public MoodAnalyser(String message) { 
		this.message = message; 
	}

	public String analyseMood() throws MoodAnalysisException {
		MoodEnum input1 = MoodEnum.NULL;
		MoodEnum input2 = MoodEnum.EMPTY;
		try {
			if (message.toLowerCase().contains("sad"))
				return "SAD";
		} catch (NullPointerException e) {                                                                                     
			MoodAnalysisException moodanalyzerexception = new MoodAnalysisException("Mood of a person can't be: " + input1);
			throw moodanalyzerexception;                                                                                       
		}
		if (message == "")
			throw new MoodAnalysisException("Mood of a person can't be: " + input2);
		return "HAPPY";
	}
}