import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class Puzzle1B extends Puzzle {
    public Puzzle1B() {
        super(1, 'B', 'A');
    }
    public void processInput(){
        ArrayList<Integer> caloriesPerElf = new ArrayList<>();
        int buffer = 0;
        for (String s : getInput()){
            if (!Objects.equals(s, "")){
                buffer += Integer.parseInt(s);
            } else {
                caloriesPerElf.add(buffer);
                buffer = 0;
            }
        }
        int largestElement;
        buffer = 0;
        for (int i = 0; i < 3; i++){
            largestElement = Collections.max(caloriesPerElf);
            buffer += largestElement;
            caloriesPerElf.remove(Arrays.asList(largestElement));
        }
        setResult(buffer);
    }
}
