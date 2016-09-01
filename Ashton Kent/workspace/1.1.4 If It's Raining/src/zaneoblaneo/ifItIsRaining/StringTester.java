package zaneoblaneo.ifItIsRaining;

import java.util.Random;

public class StringTester {
		public static void stringTester(String[] args){
		Random random = new Random();
		WeatherIndex.makeWeatherIndex();
		String weatherCondition = WeatherIndex.weatherIndex.get(random.nextInt(WeatherIndex.weatherIndex.size()));
		float temp = random.nextFloat()*120;
		float humidity = random.nextFloat()*80;
		boolean nTemp = random.nextBoolean();
		if(nTemp){
			temp *=-200f;
		}
		
		if((weatherCondition.contains("tornado") || weatherCondition.contains("thunder") || weatherCondition.contains("tornado") || weatherCondition.contains("storm") || weatherCondition.contains("hurricane"))){
			if(weatherCondition.contains("storm")){
				System.out.println("It is going to storm!");
			}
			if(weatherCondition.contains("showers")){
				System.out.println("it is going to shower... with thunder!");
			}
			if(weatherCondition.contains("tornado") || weatherCondition.contains("severe") || weatherCondition.contains("hurricane") || weatherCondition.contains("tropical")){
				System.out.println("Seek shelter... it will get hairy with a " + weatherCondition);
			}
		} else if(weatherCondition.contains("mixed")) System.out.println("bring an unbrellea");
		else if(weatherCondition.contains("shower") || weatherCondition.contains("drizzle")){
			if(!weatherCondition.contains("snow")){
				System.out.println("bring an unbrellea");
			}
			else{
				System.out.println("it's gonna snow!");
			}
		} 
		else if(weatherCondition.contains("freezing")) System.out.println("drive carefully!");
		else if(weatherCondition.contains("cold")) System.out.println("wear a jacket");
		else if(weatherCondition.contains("sleet")) System.out.println("stay indoors! sleet time!");
		else if(weatherCondition.contains("snow")) System.out.println("it's gonna snow!");
		else if(weatherCondition.contains("windy")) System.out.println("wind there will be!");
		else if(weatherCondition.contains("hot")) System.out.println("stay indoors! it's going to be a bit warm...");
		else if(weatherCondition.contains("dust") || weatherCondition.contains("smoky") || weatherCondition.contains("cloud") || weatherCondition.contains("smoke") || weatherCondition.contains("haze") || weatherCondition.contains("fog"))System.out.println("visibility will be limited!");
		else if(weatherCondition.contains("sunny") || weatherCondition.contains("fair") || weatherCondition.contains("clear")) System.out.println("you are all good!");
		else if(weatherCondition.contains("hail")) System.out.println("it's going to be one hail of a day... get it?");
		
		System.out.println("the tempature will be: " + temp + "�F");
		System.out.println("the humidity will be: " + humidity + "%");
		System.out.println(weatherCondition);
		System.out.println("STAY INSIDE!");
		
		
	}

}
