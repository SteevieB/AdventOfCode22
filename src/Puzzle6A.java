import java.util.HashSet;
import java.util.Set;

public class Puzzle6A extends Puzzle{
    public Puzzle6A() {
        super(6, 'A');
    }
    public void processInput() {
        int lengthMarker = 4;
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
