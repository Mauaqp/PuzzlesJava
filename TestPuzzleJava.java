import java.util.Arrays;
import java.util.ArrayList;

public class TestPuzzleJava {
    
	public static void main(String[] args) {
		
		
		PuzzleJava generator = new PuzzleJava();
		
		System.out.println("--- Random list ---");
		ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println(randomRolls);
		
		
		System.out.println("--- Random letter ---");
		String letras = generator.getRandomLetter();
		System.out.println(letras);
		
		System.out.println("--- Random pasword ---");
		String pass = generator.generatePassword();
		System.out.println(pass);
		
		System.out.println("--- Random pasword Set ---");
		String[] passwords = generator.getNewPasswordSet(4);
        System.out.println(Arrays.toString(passwords));
        
        System.out.println("--- Random Shuffle ---");
        String[] arreglo = {"1", "2", "3", "4", "5"};
        String[] random = generator.shuffleArray(arreglo);
        System.out.println(Arrays.toString(random));
        
	}
}