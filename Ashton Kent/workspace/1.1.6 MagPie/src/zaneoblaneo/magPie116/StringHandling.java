package zaneoblaneo.magPie116;

import zaneoblaneo.utils.*;

public class StringHandling {
	public static void handleString(String[] SASentence){
		String sentence="";
		for(String w : SASentence){
			sentence += " "+w;
		}
		if(sentence.contains("LIKE SUMMER")){Print.println("YOU ARE NUTTS! SUMMER = BAD!"); return;} else if(sentence.contains("LIKES SUMMER")){Print.println("I THINK THEY ARE NUTTS!"); return;}
		switch (SASentence[0].toUpperCase()) {
		case "I": parseI(SASentence); break;
		case "MY" : parseMy(SASentence); break;
		case "YOU" : parseYou(SASentence); break;
		case "HE" : parseOther(SASentence); break;
		case "SHE" : parseOther(SASentence); break;
		case "DO" : parseQuestion(SASentence); break;
		default: Print.println("I do not understand"); break;
		}
	}
	public static void parseMy(String[] sentence){
		switch(sentence[1].toUpperCase()){
		default : Print.println("Interesting"); break;
		}
	}
	public static void parseI(String[] sentence){
		switch (sentence[1].toUpperCase()){
		case "LIKE" : String f="";for(int i = 0; i<sentence.length-2;i++){f+=sentence[i+2] + " ";}Print.println("I like " + f + "aswell!"); break;
		case "LOVE" : String f1="";for(int i = 0; i<sentence.length-2;i++){f1+=sentence[i+2] + " ";}Print.println("I love " + f1 + "aswell!"); break;
		case "HATE" : Print.println("You might hate " + sentence[2] + " But I love it!"); break;
		case "CAN" : Print.println("NO FAIR! I CAN'T DO ANYTHING AS A COMPUTER!"); break;
		default: Print.println("I do not understand"); break;
		}
	}
	public static void parseYou(String[] sentence){
		switch (sentence[1].toUpperCase()){
		case"CAN" : Print.println("I can?"); break;
		case "KNOW" : Print.println("do I?"); break;
		case "UNDERSTAND?" : Print.println("I don't, however I will go ahead and say yes!"); break;
		default: Print.println("I do not understand"); break;
		}
	}
	public static void parseOther(String[] sentence){
		switch(sentence[1].toUpperCase()){
		default: Print.println("It's not nice to talk about other people...");  break;
		}
	}
	public static void parseQuestion(String[] sentence){
		switch(sentence[1].toUpperCase()){
		case "YOU" : Print.println("MAYYYYYBEEEEEE.......");break;
		default: Print.println("I do not understand"); break;
		}
	}
	public static void parseQuestionMe(String[] sentence){
		switch(sentence[2].toUpperCase()){
		case "LIKE" : Print.println("Yes I do like " + sentence[3]);break;
		case "HATE" : Print.println("Nope, I love it!"); break;
		default: Print.println("I do not understand");break;
		}
	}
}