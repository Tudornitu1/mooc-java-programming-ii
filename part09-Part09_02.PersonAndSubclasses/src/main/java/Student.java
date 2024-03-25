
public class Student extends Person {   
    private int credits;

    public Student(String name,String adress){
        super(name,adress);
        this.credits=0;
    }    

    public int credits(){
        return this.credits;
    }

    public void study(){
        this.credits++;
    }

    public String toString(){
        return this.getName()+'\n'+"  "+this.getAdress()+'\n'+"  Study credits "+this.credits;
    }
}
