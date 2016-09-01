package zaneoblaneo.SciFiName;

public class ScifiGen {
	private static char[] scifiName;
	private static char[] world;
	private static String worldHelper = "thebrownfoxjumpsoverthelazydogTHEBROWNFOXJUMPSOVERTHELAZYDOG";
	private static char[] althebet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz ".toCharArray();
	
	public static String genScifiName(String name){
		char[] caName = name.toCharArray();
		world = new char[(int) (name.length()/1.125)];
		
		scifiName = caName;
		int i = 0;
		for(char c : caName){
			System.out.println(c/1);
			c = althebet[c%53];
			
			scifiName[i] = c;
			i++;
		}
		for(i=0;i<world.length;i++){
			world[i] = worldHelper.toCharArray()[caName[i]%60];
		}

		String tmp = String.valueOf(scifiName) + " from the planet: " + String.valueOf(world);
		return tmp;
	}

	public char[] getScifiName(){
		return scifiName;
	}
}
