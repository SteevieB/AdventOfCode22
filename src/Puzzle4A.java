import java.util.ArrayList;

public class Puzzle4A extends Puzzle{
    public Puzzle4A() {
        super(4, 'A');
    }
    public void processInput(){
        int buffer = 0;
        String[] elvGrp;
        for (String s : getInput()){
            elvGrp = s.split(",");
            if(isFullyOverlapped(elvGrp)) buffer++;
        }
        setResult(buffer);
    }

    private boolean isFullyOverlapped(String[] elvGrp) {
        String[] bound1 = elvGrp[0].split("-");
        String[] bound2 = elvGrp[1].split("-");
        int lBound1 = Integer.parseInt(bound1[0]);
        int lBound2 = Integer.parseInt(bound2[0]);
        int rBound1 = Integer.parseInt(bound1[1]);
        int rBound2 = Integer.parseInt(bound2[1]);
        if( lBound1 <=lBound2 && rBound1 >= rBound2 ) return true;
        if( lBound1 >=lBound2 && rBound1 <= rBound2 ) return true;
        return false;
    }

}
