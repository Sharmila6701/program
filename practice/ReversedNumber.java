package practice;

import java.util.Scanner;

public class ReversedNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number");
	int number = sc.nextInt();
	int reverse = reverse(number);
	int difference =  number-reverse;
	System.out.println(number+"-"+reverse+"="+difference);
}

public static int reverse(int number) {
	int reversed=0;
	while(number!=0) {
		int digit = number%10;
		reversed = reversed*10+digit;
		number/=10;
	}
	return reversed;
}

}
