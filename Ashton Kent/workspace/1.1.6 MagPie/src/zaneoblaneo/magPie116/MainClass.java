package zaneoblaneo.magPie116;

import java.util.Scanner;

import zaneoblaneo.utils.Print;

public class MainClass {
	public static void main(String[] args){
		String[] SASentence;
		String sentence;
		Boolean looping = true;
		Scanner scanner = new Scanner(System.in);
		while(looping){
			Print.println("Enter a line of text.");
			sentence = scanner.nextLine();
			SASentence = sentence.split(" ");
			StringHandling.handleString(SASentence);
		}
		scanner.close();
	}
}
