package com.calculation;
import java.util.Scanner;


public class CalculationOfCircle extends Exception{
	
	CalculationOfCircle(){
		
		
	}
	int run =1;
	double radius;
	Scanner sc = new Scanner(System.in); 
	
	
	public void circle()
	{
		System.out.println("Hello!! Your choice is circle");
		while(run==1)
		{
		  try {	
			System.out.println("For Area select 1"+"\n"+"For Circumference select 2"+"\n"+"For Diameter select 3");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			   case 1:
				   System.out.println("Please enter radius here");
				   radius = sc.nextInt();
				   if(radius < 0)
				   {
					   throw new CalculationOfCircle();
				   }
				   else
				   {
					   
					   System.out.println("Area of circle with radius "+radius+" : ");
					   System.out.println(Math.PI * radius * radius);
				   }
				   
			}// ending of switch
		  }// ending of try
		  catch(CalculationOfCircle cc){
			     
			      System.out.println("Radius should be positive");
			  
		  }
		}// ending of while
	}
	

}
