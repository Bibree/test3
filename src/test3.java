import java.util.Scanner;
public class test3 {

	public static void main(String[] args) {

		double sum = 0; 
		double inputNum;
		int counter;
		double average;
		double Max = 0; 
		double Min = 101;      

		Scanner NumScanner = new Scanner(System.in);
		Scanner charScanner = new Scanner(System.in); 
		System.out.println("Enter the total number of exams you want a average");
		counter = NumScanner.nextInt();
		System.out.println("Please enter " + (counter+1) + " numbers, the last input should be -1 to terminate the loop");

		for(double i = 1; i<=counter+1 ;i++){        
			
		    inputNum = NumScanner.nextDouble();
		    System.out.println();

		    if(inputNum > -1 && inputNum < 101){
		        sum = sum + inputNum;
		        
		    if (inputNum == 0) {
		    	break;
		    }
		    if(inputNum > Max){
		        Max = inputNum;
		    }
		    if(inputNum < Min){
		        Min = inputNum;
		    }
		    
		    }
		    else{
		    	System.out.println("calculating...");
		       
		        average = sum / counter;
		     // Print out of max and min exam grades//
		        System.out.println( "Max = " + Max );
		        System.out.println( "Minimum = " + Min );
		     // Print out of max and min exam grades//
		        System.out.println( "average = " + average );
		    }
		    }
		}
		}
		
	
