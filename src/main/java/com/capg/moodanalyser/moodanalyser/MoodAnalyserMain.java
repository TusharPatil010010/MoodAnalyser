package com.capg.moodanalyser.moodanalyser;

public class MoodAnalyserMain {

	public static void main(String[] args) throws MoodAnalysisException {
		
		MoodAnalyser moodanalyzer = new MoodAnalyser(null);
		System.out.println("Mood of a person is: " + moodanalyzer.analyseMood());
	}
}
