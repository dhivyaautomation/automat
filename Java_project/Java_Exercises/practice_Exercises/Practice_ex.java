package practice_Exercises;

import java.awt.AlphaComposite;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Practice_ex {
	int num;
	static Practice_ex obj = new Practice_ex();
	
	public static void main(String[] args)
	{	//noe the returned array should be stored in another array. so im initialising 'arr' ans calling the method.
		//in sysout im importing thr Arrays class and calling toString (arr) to print the result as a string.

		/*int [] arr= convert_ASCII();
		System.out.println(Arrays.toString(arr));
		System.out.println(mul());
		alphabet_check();
		alphabet_check('o');
		obj. leap_yr(1955);
		obj.num_pos_or_neg(-7);
		obj.check();
		obj.natural_num_sum();
		obj.gen_mul_table();
		obj.display_char();
		obj.round();
		obj.gcd(); */
		obj.fibonacci();
		obj.powerOfNum();
		obj.count_digits_in_integer();
		obj.reverse_num();
	}
	
	//Java Program to Multiply two Floating Point Numbers
	protected static float mul() {
		float a= 80002; 
		float b= 9996;
		float c= a*b;
		return c;
	}
	
	//to find ascii value of a char
	protected static int[] convert_ASCII() {
		char ascii= 'a';
		//assigning char variable to int to find the ascii value 
		int y = ascii;
		//you can also to type casting from char to int :
		//int convert = (int)ascii;
		//here i am using array to get the values of variables of ascii, y and then im asking to return the values
		int [] asc = {ascii, y};
		return asc;
	}
	
	//Java Program to Check Whether an Alphabet is Vowel or Consonant
	protected static void alphabet_check()
	{	
		char ch = 'r';
		if (ch=='a' ||ch=='e'||ch=='i' || ch=='o'||ch=='u' )
		{
			System.out.println("This is a vowel");
		}
		else 
		{
			System.out.println("this is a consonant");
		}
	}
	
	//Java prog to check vowel or consonant using Switch case:
	public static void alphabet_check(char c) {
		switch (c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(c + "is a vowel");
			break;
		default:
			System.out.println(c + "This is a consonant");
		}
			
	}
	//Java Program to Check Leap Year 
	public  void leap_yr(int num) {
		if (num%4 == 0 ) 
		{
			System.out.println(num + " is a leap year");
			
		}
		else {
			System.out.println(num + " is not a leap year");
		}
		
	}
	//Java Program to Check Whether a Number is Positive or Negative
	public void num_pos_or_neg(int x) {
		if (x > 0 ) {System.out.println(x+ " is positive");}
		else {System.out.println(x + "is negative");}
	}
	
	
	//Java Program to Check Whether a Character is Alphabet or Not
	/*In Java, the char variable stores the ASCII value of a character (number between 0 and 127) rather than the character itself.
	 * The ASCII value of lowercase alphabets are from 97 to 122. And, the ASCII value of uppercase alphabets are from 65 to 90. That is, alphabet a is stored as 97 and alphabet z is stored as 122. Similarly, alphabet A is stored as 65 and alphabet Z is stored as 90.

Now, when we compare variable c between 'a' to 'z' and 'A' to 'Z', the variable is compared with the ASCII value of the alphabets 97 to 122 and 65 to 90 respectively.

Since the ASCII value of * does not fall in between the ASCII value of alphabets. Hence, the program outputs * is not an alphabet.
	 */
	public void check() {
		char input = '*';
		if ((input>='a' && input <='z') || (input>='A' && input <='Z')){
			System.out.println(input + " is an alphabet");
		}
		else {
			System.out.println(input + "is not an alphabet");
		}
		}
	//Java Program to Calculate the Sum of Natural Numbers
	void natural_num_sum() {
		int i,j=100,k=0;
		for ( i=1; i<=j; i++) {
			k= i+k;
		}
		System.out.println("The sum of natural nos upto 10 is " + k);
	}
	//Java Program to Generate Multiplication Table
	void gen_mul_table() {
		int d,e=10,f=23,table;
		System.out.println("The multiplication table for "+ f + " is : ");
		for (d=1; d<=e; d++) {
			table= d*f;
			System.out.println(+d+"*"+f+"=" +table );
		}	
	}
	//Java Program to Display Characters from A to Z using loop
	void display_char() {
		String op="";
		char l,n= 'Z';
		for (l='A'; l<=n; l++) {
			op =l + " ";
			System.out.print(op);
		}
	}
	
	//Java program to round up a number
	void round() {
		double a= 996.325;
		System.out.println();
		System.out.println(Math.round(a));
	}
	
	// Java program to find fibonacci series
	void fibonacci() {
		int s=0, n=0,ans;
		String fibonacci = "";
			while (n<21) {
			ans = s+n;
			s=ans;
			n++;
			fibonacci = fibonacci + ans + " ";
						}
		System.out.println(fibonacci);
		}
	
	// To find the GCD
	void gcd() {
		        int n1 = 81, n2 = 153, gcd = 1;
		        int i=1;

		        //for(int i = 1; i <= n1 && i <= n2; ++i)
		        	do
		        {
		            // Checks if i is factor of both integers
		            if(n1 % i==0 && n2 % i==0)
		                gcd = i;
		            i++;
		        }while (i <= n1 && i <= n2);

		        System.out.printf("G.C.D of %d and %d is %d", n1, n2, gcd);
		    }
	//Java Program to Calculate the Power of a Number
	void powerOfNum() {
				int num = 3; int power = 1;
				for (int count = 1; count <= 4 ;count++)
				{
					power = power*num;
				}
				System.out.println("The power of 3 power 4 is " + power);
					}
	//Java Program to Count Number of Digits in an Integer
	void count_digits_in_integer() {
				String integer = "7895589654565447856213";
				char[] ans = integer.toCharArray();
				if (ans.length == integer.length())
				{
					System.out.println(ans.length);
				}	
									}
	//Java Program to Reverse a Number
	void reverse_num() {
				String d= "7896541";
				char s[] = d.toCharArray();
				for (int l = s.length; l <= s.length;l-- )
				{
					int rev = (s[l]);
					System.out.println( "The reverse of " + d + " is " + rev);
					
				}
	}
	}
	
	
		
	
	
	
	
