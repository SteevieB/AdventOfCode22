import java.io.IOException;
import java.util.ArrayList;

public abstract class Puzzle {
    private ArrayList<String> input;
    private String puzzleID;
    private String result;

    public Puzzle(int day, char part){
        this(day,part,part);
    }

    public Puzzle(int day, char part, char override){
        puzzleID = Integer.toString(day) + part;
        greeter();
        puzzleID = Integer.toString(day) + override;
        try {
            readInput("input" + puzzleID + ".txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        processInput();
        System.out.println("Solution: " + getResult());
    }

    public abstract void processInput();

    public void greeter(){
        System.out.println("Solving puzzle: " +  puzzleID + "...");
    }

    public void readInput(String filename) throws IOException {
        IOReaderWriter iorw = new IOReaderWriter();
        input = iorw.readFile(filename);
    }

    public ArrayList<String> getInput(){
        return this.input;
    }

    public String getResult(){
        return this.result;
    }

    public void setResult(int i){
        this.result = Integer.toString(i);
    }

    public void setResult(String s){
        this.result = s;
    }
}
