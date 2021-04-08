import java.util.ArrayList;
import java.util.Random;

public class Security {
    private ArrayList<Integer> usedCode;
    private Random randObj;
    public static int MAX_CODE = 999;
    
    public Security() {
        randObj = new Random();
        usedCode = new ArrayList<Integer>();
        randObj.setSeed(30);
    }
    
    public String toString() {
        return String.format("The max range is %d and the current code list is: %s", MAX_CODE, usedCode.toString());
    }
    
    public int getNextCode() {
        int nextCode = randObj.nextInt(MAX_CODE); // fixed
        usedCode.add(nextCode);
        return nextCode;
    }
    
    public ArrayList<Integer> getListOfUsedCode() {
        return usedCode;
    }
}