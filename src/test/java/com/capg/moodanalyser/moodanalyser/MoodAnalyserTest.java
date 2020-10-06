package com.capg.moodanalyser.moodanalyser;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
	@Test
	void givenMood_WhenSad_ShouldReturnSad() {
		MoodAnalyser mood = new MoodAnalyser("I am in sad mood");
		String getMood = mood.analyseMood();
		assertEquals("SAD",getMood);
	}
	@Test
	void givenMood_WhenInAnyMood_ShouldReturnHappy() {
		MoodAnalyser mood = new MoodAnalyser("I am in any mood");
		String getMood = mood.analyseMood();
		assertEquals("HAPPY",getMood);
	}
}
