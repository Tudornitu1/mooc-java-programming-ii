
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs =  new ArrayList<>();

        while (true) {
            String row=scanner.nextLine();
            if( row.equals("end" )) {
                break;
            }
            inputs.add(row);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String task=scanner.nextLine();
        if(task.equals("n")) {
            double negative = inputs.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .filter(number -> number<0)
            .average()
            .getAsDouble();

            System.out.println("Average of the negative numbers: "+negative);

        } else if(task.equals("p")) {
            double positive = inputs.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .filter(number -> number>0)
            .average()
            .getAsDouble();

            System.out.println("Average of the positive numbers: "+ positive);
        }
    }
}
