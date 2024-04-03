
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while(true) {
            int x = Integer.valueOf(scanner.nextLine());
            if(x<0){
                break;
            }
            numbers.add(x);
        }
        numbers.stream()
        .filter(s-> s>=1&&s<=5)
        .forEach(n -> System.out.println(n));
    }
}
