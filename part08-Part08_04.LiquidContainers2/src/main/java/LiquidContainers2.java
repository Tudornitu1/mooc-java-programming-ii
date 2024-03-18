
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Container first = new Container();
        Container second = new Container();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            int x = Integer.valueOf(parts[1]);
            if (parts[0].equals("add")) {
                first.add(x);
            } else if (parts[0].equals("move")) {
                if(first.contains()<x&&first.contains()>0){
                    second.add(first.contains());
                    first.remove(x);
                    
                } else if (first.contains()>0) {
                    second.add(x);
                }
                first.remove(x);
            } else if (parts[0].equals("remove")) {
                second.remove(x);
            }

        }
    }

}
