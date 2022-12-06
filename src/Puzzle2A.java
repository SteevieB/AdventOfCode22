import java.util.Objects;

public class Puzzle2A extends Puzzle{
    public Puzzle2A() {
        super(2, 'A');
    }
    public void processInput() {
        int score = 0;
        for (String s : getInput()){
            switch (s){
                case "A X" -> score += 4;
                case "A Y" -> score += 8;
                case "A Z" -> score += 3;
                case "B X" -> score += 1;
                case "B Y" -> score += 5;
                case "B Z" -> score += 9;
                case "C X" -> score += 7;
                case "C Y" -> score += 2;
                case "C Z" -> score += 6;
            }
        }
        setResult(score);
    }
}
