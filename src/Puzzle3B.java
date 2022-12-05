import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Puzzle3B extends Puzzle{
    public Puzzle3B() {
        super(3, 'B', 'A');
    }
    public void processInput(){
        int buffer = 0;
        ArrayList<String> elvGrp = new ArrayList<>();
        Set<Character> set;
        StringBuilder builder;
        for (String s : getInput()){
            set = new HashSet<>();
            builder = new StringBuilder();
            for (char c : s.toCharArray()) set.add(c);
            for (char c : set) builder.append(c);
            elvGrp.add(builder.toString());
            if(elvGrp.size() == 3){
                buffer += getPriority(findBadge(elvGrp));
                elvGrp = new ArrayList<>();
            }
        }
        setResult(buffer);
    }

    public char findBadge(ArrayList<String> grp) {
        for (char i : grp.get(0).toCharArray()){
            for (char j : grp.get(1).toCharArray()) {
                for (char k : grp.get(2).toCharArray()) {
                    if (i == j && j == k) return i;
                }
            }
        }
        return 0;
    }

    public int getPriority(char item){
        int prio = (int) item - 96;
        if (prio < 0) prio += 58;
        return prio;
    }
}
