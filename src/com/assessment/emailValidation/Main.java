package com.assessment.emailValidation;

import java.util.Scanner;

public class Main {
	
	public static void main(String []args) {
		String Emails[] = new String[] {"a@gmail.com", "b@gmail.com", "c@gmail.com","d@gmail.com", "e@gmail.com", "f@gmail.com","g@gmail.com", "h@gmail.com", "i@gmail.com"};
	    Scanner sc = new Scanner(System.in); 
	    System.out.println("Enter the Email Id you want to search :");
	    String sr = sc.nextLine();
	    boolean flag = false;
	    for(String s : Emails) 
	    	if (s.equals(sr)) {
	    		flag = true;
	    		break;
	    	}
	    if (flag == true) 
	    	System.out.println(sr+" email id exists.");
	    else
	    	System.out.println(sr+" email id doesn't exists.");
	}

}
