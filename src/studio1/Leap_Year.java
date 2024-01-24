package studio1;
import java.util.Scanner;
public class Leap_Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input year: ");
		int year = in.nextInt();
		boolean leap_year = (year%4==0 && (year%100!=0 || year%400==0));
		System.out.print(year + " is a leap year: " + leap_year);
	}

}
