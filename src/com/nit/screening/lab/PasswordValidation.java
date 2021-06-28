package com.nit.screening.lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {

	public static boolean isValidPwd(String password,String regEx) {
		Pattern pattern=Pattern.compile(regEx);
		Matcher matcher=pattern.matcher(password);
		return matcher.matches();		
	}
	
	public static void validatePassword(String uid,String pwd){
		String regularExp="^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[*$#@]).{8,10}$";
		boolean validPwd=isValidPwd(pwd, regularExp);
		System.out.println("Validated Password: "+validPwd);
	}
	
	
	public static void main(String[] args) {
    System.out.println("Register Form");
    System.out.println("--------------------");
    System.out.println("Enter userId:");
    Scanner sc=new Scanner(System.in);
    String uid=sc.next();
    System.out.println("Enter password:");
    String pwd=sc.next();
    validatePassword(uid,pwd);

	}

}
