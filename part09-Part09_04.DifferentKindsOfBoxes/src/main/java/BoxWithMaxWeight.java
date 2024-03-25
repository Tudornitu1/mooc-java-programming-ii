import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{
    private int capacity;
    private ArrayList<Item> box;
    public BoxWithMaxWeight(int capacity) {
        this.capacity=capacity;
        this.box=new ArrayList<>();
    }

    public int weight(){
        int w=0;
        for(Item x:this.box){
            w=w+x.getWeight();
        }
        return w;
    }
    public void add(Item item) {
        if(weight()+item.getWeight()<=capacity){
            box.add(item);
        }
    }
    public boolean isInBox(Item item){
        if(box.contains(item)){
            return true;
        } else {
            return false;
        }
    }

}
