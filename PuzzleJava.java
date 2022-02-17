import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {
	
	public ArrayList<Integer> getTenRolls() {
		Random random = new Random();
		int min = 1;
		int max = 20;
		ArrayList<Integer> array = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			array.add(random.nextInt(max-min) + min);
		}
		return array;
	}
	
	public String getRandomLetter() {
		Random random = new Random();
		int min = 1;
		int max = 26;
		String[] letras = {"a","e","i","o","u","b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"};
		
		String letra = letras[random.nextInt(max-min) + min];
		return letra;
	}
	public String generatePassword () {
		String password = "";
		for (int i = 0; i <= 8; i++) {
			password += getRandomLetter();
		}
		return password;
	}
	
	public String[] getNewPasswordSet(int length) {
		String[] passwords = new String[length];
		for ( int i = 0; i < passwords.length; i++) {
			passwords[i] = generatePassword();
		}
		return passwords;
	}
	
	public String[] shuffleArray(String[] array) {
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			int randNum = random.nextInt(i+1);
			String value = array[i];
			array[i] = array[randNum];
			array[randNum] = value;
		}
		return array;
		
	}
}
