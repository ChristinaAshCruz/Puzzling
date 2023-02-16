import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {
    Random randMachine = new Random();
    
    public ArrayList<Integer> getTenRolls(int bound){
        ArrayList<Integer> rollResults = new ArrayList<Integer>();
        for(int id = 0; id < 10; id++){
            Integer rollResult = randMachine.nextInt(bound);
            rollResults.add(rollResult);
        }
        return rollResults;
    }
    
    public char getRandomLetter(){
        String randLetterString = "abcdefghijklmnopqrstuvwxyz";
        char randLetterResult = randLetterString.charAt(randMachine.nextInt(25));
        return randLetterResult;
    }
    
    public String generatePassword(){
        String passwordResult = "";
        for(int id = 0; id < 8; id++){
            passwordResult = passwordResult + getRandomLetter();
        }
        return passwordResult;
    }
    
    public ArrayList<String> getNewPasswordSet(int length){
        ArrayList<String> passwordArray = new ArrayList<String>();
        for (int numOfPasswords = 0; numOfPasswords < (length + 1); numOfPasswords++){
            String onePassword = generatePassword();
            passwordArray.add(onePassword);
        }
        return passwordArray;
    }

}