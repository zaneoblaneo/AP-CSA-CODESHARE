package zaneoblaneo.utils;

import java.util.Hashtable;

public class Print {
	public static Hashtable<Integer,Object> log = new Hashtable<Integer,Object>();
	
	public static void print(Object o){
		System.out.print(o);
		log.put(log.size(),o);
	}
	public static void println(Object o){
		System.out.println(o);
		log.put(log.size(),o);
	}
	public static void println(){
		System.out.println();
	}
	public static void printLog(){
		for(int i = 0; i<log.size(); i++){
			println(log.get(i));
		}
	}
	public static void printAndDumpLog(){
		printLog();
		log = new Hashtable<Integer,Object>();
	}
}
