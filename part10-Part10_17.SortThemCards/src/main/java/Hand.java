import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Hand implements Comparable<Hand>{
    private ArrayList<Card> hand;
    public Hand(){
        this.hand= new ArrayList<>();
    }

    public void add(Card card) {
        hand.add(card);
    }

    public int sum(){
        int sum=0;
        for(Card c:hand) {
            sum= sum+c.getValue();
        }
        return sum;
    }

    public void print() {
        for(Card c:hand){
            System.out.println(c);
        }
    }

    public void sort() {
        Collections.sort(this.hand);
    }

    public final int compareTo(Hand object) {
        return sum()-object.sum();
    }

    public void sortBySuit(){
        Collections.sort(this.hand, new BySuitInValueOrder());
    }
}
