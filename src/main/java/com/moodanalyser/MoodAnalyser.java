package com.moodanalyser;

public class MoodAnalyser {

	 public String analyseMood(String msg) {
	        if(msg.contains("Sad")){
	            return "Sad";
	        }
	        return "Happy";
	    }
}