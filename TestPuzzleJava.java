import java.util.ArrayList;
import java.util.Random;
public class TestPuzzleJava {

    public static void main(String[] args){
        
        PuzzleJava generator = new PuzzleJava();

        // ---- getTenRolls Test ----
		ArrayList<Integer> randomRolls = generator.getTenRolls(20);
		System.out.println(randomRolls);

        // ---- getRandomLetter Test ----
        System.out.println("Your random letter is " + generator.getRandomLetter());

    }
}

