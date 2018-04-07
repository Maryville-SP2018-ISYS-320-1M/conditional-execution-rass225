import java.util.Scanner;

/*
	ISYS 320
	Name(s):
	Date: 
*/

public class P5_PayProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		
		System.out.println("Enter your hourly rate: ");
		double hourlyRate = input.nextDouble();
		
		System.out.println("Enter the number of hours you worked this week: ");
		int numOfHoursWorked = input.nextInt();
		
		double salary = computePay(hourlyRate, numOfHoursWorked);
		System.out.println("Total pay is: " + salary);
	}
	public static double computePay(double rate, int hours){
		double finalPay;
		if (hours > 8){
			finalPay = (rate * 8) + (1.5 *(rate * (hours - 8)));
		}
		else {
			finalPay = rate * hours;
		}
		return finalPay;
	}
}
