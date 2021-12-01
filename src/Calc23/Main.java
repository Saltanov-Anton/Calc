package Calc23;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            int num1 = scan.nextInt();
            char op = scan.next().charAt(0);
            int num2 = scan.nextInt();
            System.out.println(Calc.arabCalc(num1, op, num2));
        } else if (scan.hasNext()) {
            String numRoman1 = scan.next();
            char op = scan.next().charAt(0);
            String numRoman2 = scan.next();
            System.out.println(Calc.romanCalc(numRoman1, op, numRoman2));
        }
    }
}
