import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

public class Herd implements Movable{
    private List<Movable> herd;
    public Herd() {
        this.herd= new ArrayList<>();
    }

    public String toString() {
        String output="";
        for(Movable x:herd){
            output=output+x.toString()+'\n';
        }
        return output;
    }

    public void addToHerd(Movable movable){ 
        herd.add(movable);
    }

    public void move(int dx, int dy) {
        for(Movable x:herd){
            x.move(dx, dy);
        }
    }
}
