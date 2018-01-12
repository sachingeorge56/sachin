package com.sac2;

import java.util.Scanner;

public class Numbercount {
	
	public static void main(String args[]) {
		
		
		int evenCount=0;
		int oddCount=0;
		int totalNumberCount=0;
		int sum=0;
		
		Scanner scan=new Scanner(System.in);
		
		int number=0;
		
		while(number!=-1) {
			System.out.println("Print number");
			number = scan.nextInt();
			
			
			
			if(number== -1) {
				System.out.println("program has ended");
				System.out.println("even count"+evenCount);
				System.out.println("odd count"+oddCount);
				System.out.println("total number entered"+totalNumberCount);
				System.out.println("sum"+sum);
				
			}else {
				totalNumberCount++;
				sum += number;
				if(number % 2 == 0) {
					evenCount++;
				}else 
				{
					oddCount++;
				}
				
			}
			
			
			
		}
			
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
