package practice;

import java.util.Scanner;

public class AlphabetPattern {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("enter a  character:");
	char inputchar = sc.next().charAt(0);
	for(char ch=inputchar;ch>='A';ch--) {
		for(int i='A';i<=ch;i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
}
}
