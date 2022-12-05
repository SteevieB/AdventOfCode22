import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class Puzzle3A extends Puzzle {

    public Puzzle3A() {
        super(3, 'A');
    }
    public void processInput(){
        int buffer = 0;
        for (String s : getInput()){
            buffer += getPriority(findCommonItem(s));
        }
        setResult(buffer);
    }

    private char findCommonItem(String line) {
        int len = line.length();
        String compartment1 = line.substring(0,len/2);
        String compartment2 = line.substring(len/2,len);
        for (char i : compartment1.toCharArray()){
            for (char j : compartment2.toCharArray()){
                if(i == j) return i;
            }
        }
        return 'a';
    }

    public int getPriority(char item){
        int prio = (int) item - 96;
        if (prio < 0) prio += 58;
        return prio;
    }

}
