import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {
    Random randMachine = new Random();
    
    public ArrayList<Integer> getTenRolls(int bound){
        ArrayList<Integer> rollResults = new ArrayList<Integer>();
        for(int id = 0; id < 9; id++){
            Integer rollResult = randMachine.nextInt(bound);
            rollResults.add(rollResult);
        }
        return rollResults;
    }
    
    public ArrayList

    }