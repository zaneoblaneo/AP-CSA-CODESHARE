package zaneoblaneo.SciFiName;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name.");
		String name = scanner.nextLine();
		scanner.close();
		System.out.println("Your Scifi name is \n\t" + ScifiGen.genScifiName(name) + "\n\n\nthanks for using Ashton's scifi Name generator!");
	}
}
