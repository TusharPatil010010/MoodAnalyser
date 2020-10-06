package com.capg.moodanalyser.moodanalyser;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MoodAnalyserTest {
	public static MoodAnalyser moodanalyser;
	@Test
	void givenMessage_whensad_returnSadMood() {
		MoodAnalyser moodanalyzer = new MoodAnalyser("I am in Sad Mood");
		String testcase1 = "I am in Sad Mood";
		try {
			testcase1 = moodanalyzer.analyseMood();
		} catch (MoodAnalysisException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals("SAD", testcase1);
	}
	@Test
	void givenMessage_whenAnyMood_returnHAPPY() {
		MoodAnalyser moodanalyzerobj1 = new MoodAnalyser("I am Happy Mood");
		try {
			assertEquals("HAPPY", moodanalyzerobj1.analyseMood());
		} catch (MoodAnalysisException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	void givenMessage_whenNull_shouldThrow_MoodAnalyserException() {
		MoodAnalyser moodanalyzer = new MoodAnalyser(null);
		Assertions.assertThrows(MoodAnalysisException.class, () -> {
			moodanalyzer.analyseMood();
		});
	}
	@Test
	void givenMessage_whenEmpty_shouldThrow_MoodAnalyserException() {
		MoodAnalyser moodanalyzer = new MoodAnalyser("");
		Assertions.assertThrows(MoodAnalysisException.class, () -> {
			moodanalyzer.analyseMood();
		});
	}
}