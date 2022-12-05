import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Puzzle1A extends Puzzle{
    public Puzzle1A() {
        super(1, 'A');
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
        setResult(Collections.max(caloriesPerElf));
    }
}
