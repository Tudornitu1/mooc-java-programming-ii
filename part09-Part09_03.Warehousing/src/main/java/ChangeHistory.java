import java.util.ArrayList;

public class ChangeHistory{
private ArrayList<Double> history;
    public ChangeHistory(){
        this.history=new ArrayList<>();
    }
    public void add(double status) {
        history.add(status);
    }
    public void clear(){
        history.clear();
    }
    public String toString() {
        return history.toString();
    }

    public double maxValue(){
        if(history.isEmpty()){
            return 0;
        }
        double max=0;
        for(int i=0;i<history.size();i++){
            if(history.get(i)>max){
                max=history.get(i);
            }
        }
        return max;
    }

    public double minValue(){
        if(history.isEmpty()){
            return 0;
        }
        double min=history.get(0);
        for(int i=0;i<history.size();i++){
            if(history.get(i)<min){
                min=history.get(i);
            }
        }
        return min;
    }
    public double average(){
        if(history.isEmpty()){
            return 0;
        }
        double sum=0;;
        int k=0;
        for(int i=0;i<history.size();i++){
            sum=sum+history.get(i);
            k++;
            }
        return sum/k;
    }
}
