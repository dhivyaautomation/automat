package practice_Exercises;

import java.util.Scanner;

public class PrimeNumCheck {
	 public static void main(String args[]){  
		
		 int i=2;
		 int num;
		 int counter = 0;
		 for ( num = 1; num < i; num++);
		 {
		 if (i % num == 0) 
		 {
			 counter = counter+1;	
		 }
		 else System.out.println("It is not prime number"); 
		 }
		 if (counter ==2) {
			 System.out.println("This is a prime number");
			 }
		 
		 }
	 }




/*
	
		 int i,m=0,f=0, n=6;      
		  m=n/2;      
		  if(n==0||n==1){  
		   System.out.println(n+" is not prime number");      
		  }else{  
			  i=2;
		   for(;i<=m;){      
		    if(n%i==0){      
		     System.out.println(n+" is not prime number");      
		     f=1;  
		     i++;
		   break;    
		    }      
		   }      
		   if(f==0)  { System.out.println(n+" is prime number"); } 
		  }
		  */


		  


