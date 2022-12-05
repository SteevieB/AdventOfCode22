import java.util.Objects;

public class Puzzle2B extends Puzzle{
    public Puzzle2B() {
        super(2, 'B', 'A');
    }
    public void processInput() {
        int score = 0;
        for (String s : getInput()){
            switch (s){
                case "A X":
                    score += 3;
                    break;
                case "A Y":
                    score += 4;
                    break;
                case "A Z":
                    score += 8;
                    break;
                case "B X":
                    score += 1;
                    break;
                case "B Y":
                    score += 5;
                    break;
                case "B Z":
                    score += 9;
                    break;
                case "C X":
                    score += 2;
                    break;
                case "C Y":
                    score += 6;
                    break;
                case "C Z":
                    score += 7;
                    break;
            }
        }
        setResult(score);
    }
}
