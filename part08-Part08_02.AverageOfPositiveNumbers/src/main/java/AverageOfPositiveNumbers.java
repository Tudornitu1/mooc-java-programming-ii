
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = 0;
        int k = 0;
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            if (number > 0) {
                s = s + number;
                k++;
            }
        }
        if (s <= 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((double) s / k);
        }
    }
}
