import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main{
	public static void main(String[] args){
		
		int passwordLenght = 12;
		String lowerCase = "qwertyuiopasdfghjklzxcvbnm";
		String higherCase = "QWERTYUIOPASDFGHJKLZXCVBNM";
		String numbers = "1234567890";
		String specialSimbols = "?!%$#@-_&^";
		String result = returnStr(4, lowerCase)+returnStr(3, higherCase)+returnStr(3, numbers)+returnStr(2, specialSimbols);
		
		shuffleMethod(result);
		
		

	}

	public static void shuffleMethod(String res){
		List<Character> characters = new ArrayList<>();
		for (char c : res.toCharArray()){
			characters.add(c);
		}
		Collections.shuffle(characters);
		StringBuilder shufflestr = new StringBuilder();
		for (char c : characters){
			shufflestr.append(c);
		}
		System.out.println(shufflestr);
	}

	public static String returnStr(int len, String symbolis){
		int lenStr = symbolis.length();
		Random random = new Random();
		String res="";
		for (int i=0; i<len; i++){
			StringBuilder stringBuilder = new StringBuilder(res);
			
			int randindex = random.nextInt(lenStr);
			stringBuilder.append(symbolis.charAt(randindex));
			res = stringBuilder.toString();
		}
		return res;
	}
}
