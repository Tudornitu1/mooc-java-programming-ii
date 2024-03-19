import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> Abbreviations;
    public Abbreviations(){
        this.Abbreviations= new HashMap<>();
    }
    public void addAbbreviation(String abbreviation, String explanation) {
        Abbreviations.put(abbreviation, explanation);
    }
    public boolean hasAbbreviation(String abbreviation) {
        if(Abbreviations.containsKey(abbreviation)){
            return true;
        } else {
            return false;
        }
    }
    public String findExplanationFor(String abbreviation) {
        if(hasAbbreviation(abbreviation)){
            return Abbreviations.get(abbreviation);
        } else {
            return null;
        }
    }
}
