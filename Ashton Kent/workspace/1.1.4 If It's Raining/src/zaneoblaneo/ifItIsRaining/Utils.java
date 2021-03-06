package zaneoblaneo.ifItIsRaining;

import java.nio.file.Files;
import java.nio.file.Path;

public class Utils {
	public static String[] readFileToArray(Path path){
		try{
			String[] output = new String[(int) Files.lines(path).count()];
			int i = 0;
			for(String line : Files.readAllLines(path)){
				output[i] = line;
				i++;
			}
			return output;
		} catch (Exception e){
			e.printStackTrace();
		}
		return new String[0];
	}
}
