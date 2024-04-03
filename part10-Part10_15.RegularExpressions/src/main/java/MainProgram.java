

public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        String x="mon";
        boolean is= new Checker().isDayOfWeek(x);
        System.out.println(is);
        String b="oi";
        boolean b1= new Checker().allVowels(b);
        System.out.println(b1);
        String c="37:23:05";
        System.out.println(new Checker().timeOfDay(c));
    }
}
