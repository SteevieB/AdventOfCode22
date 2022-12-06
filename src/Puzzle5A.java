import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Puzzle5A extends Puzzle{
    private ArrayList<ArrayList<String>> crates;
    public Puzzle5A() {
        super(5, 'A');
    }
    public void processInput(){
        int hLines = 9;
        crates = new ArrayList<>();
        ArrayList<String> inputBuffer = getInput();
        String[] header = inputBuffer.stream().limit(hLines).toList()
                .toArray(new String[hLines]);
        fillCrates(header);
        String[] body = inputBuffer.subList(10, inputBuffer.size()).toArray(new String[0]);
        int fCol, tCol, amnt;
        for(String line : body){
            amnt = Integer.parseInt(Arrays.stream(line.split(" ")).toList().get(1));
            fCol = Integer.parseInt(Arrays.stream(line.split(" ")).toList().get(3));
            tCol = Integer.parseInt(Arrays.stream(line.split(" ")).toList().get(5));
            moveCrate(fCol,tCol, amnt);
        }
        setResult(getTopCrates());
    }

    public void fillCrates(String[] header) {
        int cntr;
        for(int i=0;i<9;i++) crates.add(new ArrayList<>());
        for(String line : header){
            cntr=0;
            for (int i = 0; i <= line.length()/4; i++){
                crates.get(cntr).add(line.substring((cntr * 4),3+(cntr*4)));
                cntr++;
            }
        }
        formatCrates();
    }

    public void formatCrates() {
        for (ArrayList<String> crate : crates) {
            crate.remove(crate.size() - 1);
            while (crate.remove("   ")) {}
            Collections.reverse(crate);
        }
    }

    public void moveCrate(int fromCol, int toCol, int amount){
        for (int i = 0; i < amount; i++){
            crates.get(toCol-1).add(
                    crates.get(fromCol-1).remove(crates.get(fromCol-1).size() -1)
            );
        }
    }
    public String getTopCrates(){
        StringBuilder buffer = new StringBuilder();
        for (ArrayList<String> i : crates){
            buffer.append(i.get(i.size() - 1));
        }
        return buffer.toString();
    }
}
