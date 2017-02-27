package TuitionCalculator;
import java.util.Scanner;


public class Calculator {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the initial cost of tuition?");
		double InitialCost = sc.nextInt();
		System.out.println("What is the percent increase for your tuition");
		double PercentIncrease = sc.nextInt();
		double TotalCost = 0;
		double CostIncrease = (PercentIncrease/100)+1;
		for (int SchoolYears = 1; SchoolYears <= 4;SchoolYears++){
			TotalCost += InitialCost;
			InitialCost = InitialCost*1.03;
		}
		System.out.printf("%.2f",TotalCost);
	}
}