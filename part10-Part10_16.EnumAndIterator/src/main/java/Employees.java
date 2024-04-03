import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class Employees {
    private ArrayList<Person> employees;
    public Employees(){
        this.employees=new ArrayList<>();
    }

    public void add(Person personToAdd) {
        employees.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        for(Person x:peopleToAdd) {
            employees.add(x);
        }
    }

    public void print() {
        java.util.Iterator<Person> employee = employees.iterator();
        while(employee.hasNext()) {
            Person e=employee.next();
            System.out.println(e);
        }
    }

    public void print(Education education) {
        java.util.Iterator<Person> employee = employees.iterator();
        while(employee.hasNext()) {
            Person e=employee.next();
            if(e.getEducation()==education) {
            System.out.println(e);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> employee = employees.iterator();
        while(employee.hasNext()) {
            Person e=employee.next();
            if(e.getEducation()==education) {
            employee.remove();
            }
        }
    }
}
