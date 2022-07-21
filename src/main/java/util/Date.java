package util;

import java.time.LocalDateTime; 

public class Date {
	
	public String getCurrentTime() {
	    String currentTime = String.valueOf(LocalDateTime.now());
	    return currentTime;
	}
}
