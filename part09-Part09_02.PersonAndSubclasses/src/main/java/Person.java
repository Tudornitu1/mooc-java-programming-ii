
public class Person {
    private String name;
    private String adress;
    public Person(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }
    public Person(){
        this.name="";
        this.adress="";
    }
    
    
    public String toString(){
        return this.name+'\n'+"  "+this.adress;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    

}
