package practice_Exercises;

import java.util.Scanner;

public  class Three_String_Concat {
	String f_name,sur_name,last_name;
	static Scanner t = new Scanner (System.in);
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Pls enter first name, last name and sur name");
		Three_String_Concat obj = new Three_String_Concat(); 
		obj.f_name = t. next();
		obj.last_name = t. next();
		obj.sur_name = t. next();
		System.out.println("The name is : " + obj.f_name + " " + obj.last_name+ " " + obj.sur_name);
		
		}

}
