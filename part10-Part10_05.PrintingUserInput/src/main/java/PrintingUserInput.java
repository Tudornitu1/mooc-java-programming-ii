
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> input = new ArrayList<>();
        while(true){
            String row= scanner.nextLine();
            if(row.equals("")){
                break;
            }
            input.add(row);
        }
        input.stream()
        .forEach(rows -> System.out.println(rows));
    }
}
