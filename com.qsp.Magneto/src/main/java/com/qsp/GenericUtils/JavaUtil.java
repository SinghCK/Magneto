package com.qsp.GenericUtils;

import java.time.LocalDateTime;
import java.util.Random;

public class JavaUtil {

	public int generateRandomNumber() {
		Random r = new Random(500);
		int number=r.nextInt();
		return number;
	   }
	
		public String systemDateAndTime() {
			String dateAndTime =LocalDateTime.now().toString().replace(':', '-');
			return dateAndTime;
		}
	
}
