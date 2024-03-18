
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String read=scanner.nextLine();
            if(read.equals("end")){
                break;
            }
            int x=Integer.valueOf(read);
            System.out.println(x*x*x);
        }
    }
}
