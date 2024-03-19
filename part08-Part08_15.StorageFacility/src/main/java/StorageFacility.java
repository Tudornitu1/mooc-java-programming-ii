import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String,ArrayList<String>> storage;
    public StorageFacility(){
        this.storage=new HashMap<>();
    }
    public void add(String unit,String item) {
        this.storage.putIfAbsent(unit, new ArrayList<>());
        this.storage.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        ArrayList<String> content = storage.get(storageUnit);
        if(content == null){
            ArrayList<String> empty= new ArrayList<>();
            return empty;
        } else {
            return content;
        }

    }

    public void remove(String storageUnit, String item) {
        ArrayList<String> content = storage.get(storageUnit);
        if(content.contains(item)){
            content.remove(item);
        }
        storage.put(storageUnit, content);
    }

    public ArrayList<String> storageUnits(){
        ArrayList<String> units = new ArrayList<>();
        for(String unit:storage.keySet()){
            if(storage.get(unit).size()>0){
                units.add(unit);
            }
            
        }
        return units;
    }
}
