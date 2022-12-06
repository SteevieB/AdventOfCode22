import java.util.Objects;

public class Puzzle2B extends Puzzle{
    public Puzzle2B() {
        super(2, 'B', 'A');
    }
    public void processInput() {
        int score = 0;
        for (String s : getInput()){
            switch (s) {
                case "A X" -> score += 3;
                case "A Y" -> score += 4;
                case "A Z" -> score += 8;
                case "B X" -> score += 1;
                case "B Y" -> score += 5;
                case "B Z" -> score += 9;
                case "C X" -> score += 2;
                case "C Y" -> score += 6;
                case "C Z" -> score += 7;
            }
        }
        setResult(score);
    }
}
