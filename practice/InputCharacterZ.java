package practice;

import java.util.Scanner;

public class InputCharacterZ {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a character");
	char character = sc.next().charAt(0);
	for(char ch=character;ch<='z';ch++) {
		System.out.print(ch);
		
	}
	
	
}
}
