package practice_Exercises;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Reverse_String {
	static String name = "";
	static Scanner t = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the name to be reversed : ");
		String y = t.next();
		char a[]=y.toCharArray();
		//converting string to char array
		for (int i = y.length()-1; i>=0; i-- ) {
		System.out.print(a[i]);
		}
		//System.out.println(name);
		
		/*StringBuilder str=new StringBuilder(y);
		str.reverse();
		System.out.println(str);*/
		
	}


}
