import java.util.Objects;

public class Puzzle2A extends Puzzle{
    public Puzzle2A() {
        super(2, 'A');
    }
    public void processInput() {
        int score = 0;
        for (String s : getInput()){
            switch (s){
                case "A X":
                    score += 4;
                    break;
                case "A Y":
                    score += 8;
                    break;
                case "A Z":
                    score += 3;
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
                    score += 7;
                    break;
                case "C Y":
                    score += 2;
                    break;
                case "C Z":
                    score += 6;
                    break;
            }
        }
        setResult(score);
    }
}
