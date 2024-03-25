import java.util.ArrayList;

public class Box implements Packable{
    private double capacity;
    private ArrayList<Packable> box;
    public Box(double capacity){
        this.capacity=capacity;
        this.box=new ArrayList<>();
    }

    public void add(Packable x){
        if(weight()+x.weight()<=capacity) {
        this.box.add(x);
        }
    }

    @Override
    public String toString() {
        return "Box: " + box.size() + " items, total weight " + weight() + " kg";
    }

    public double weight(){
        double weight=0;
        for(Packable p:box){
            weight+=p.weight();
        }
        return weight;
    }
    

}
