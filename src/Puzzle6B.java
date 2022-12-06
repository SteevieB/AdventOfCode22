import java.util.HashSet;
import java.util.Set;

public class Puzzle6B extends Puzzle{
    public Puzzle6B() {
        super(6, 'B', 'A');
    }
    public void processInput() {
        int lengthMarker = 14;
        String signal = getInput().get(0);
        Set<Character> set = new HashSet<>();
        for(int i = 0 ; i < signal.length() - lengthMarker; i++){
            set.clear();
            for (char c : signal.substring(i,i+lengthMarker).toCharArray()) set.add(c);
            if(set.size() == lengthMarker) {
                setResult(i+lengthMarker);
                return;
            }
        }
    }
}
