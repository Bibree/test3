import java.util.Scanner;
public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int terminateNumber = 0;
	int input;
	int numbers;
	int x;
	System.out.println("Enter the numbers you want to use");
	Scanner keyboard = new Scanner(System.in);	
	int numbersListed = keyboard.nextInt();	
		x = keyboard.nextInt();
		
	while (numbersListed > terminateNumber)
	{
		

		if (numbersListed == -1)
			break;
		{
			numbers=keyboard.nextInt();
			input = numbersListed + numbers;
			
			System.out.println(input);
			
			
		}
	}	
	input = numbersListed;
	System.out.println(input);
	
	}

}
