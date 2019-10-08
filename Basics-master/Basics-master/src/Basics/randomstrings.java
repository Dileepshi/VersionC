package Basics;

import org.apache.commons.lang3.RandomStringUtils;

public class randomstrings {
	
	public static void main(String[] args) {
		
		randomstrings n = new randomstrings();
		String St=n.randomstring();
		System.out.println(St);
	}
	
	
	public String randomstring() {
		String randomString = RandomStringUtils.randomAlphabetic(5);
		return randomString;

	}
	

}
