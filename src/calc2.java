import java.util.Scanner;
public class calc2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            int num1 = scan.nextInt();
            char op = scan.next().charAt(0);
            int num2 = scan.nextInt();
            if ((num1 <= 10 && num2 <= 10) && (num1 >= -10 && num2 >= -10)) {
                switch (op) {
                    case '+':
                        System.out.println(num1 + num2);
                        break;
                    case '-':
                        System.out.println(num1 - num2);
                        break;
                    case '/':
                        System.out.println(num1 / num2);
                        break;
                    case '*':
                        System.out.println(num1 * num2);
                }
            }
        }
        if (scan.hasNext()) {
            String str1 = scan.next();
            char op = scan.next().charAt(0);
            String str2 = scan.next();
            int numRom1 = rom(str1);
            int numRom2 = rom(str2);
            int result = 0;
            if ((numRom1 > 0 && numRom2 > 0) && (numRom1 <= 10 && numRom2 <= 10)) {
                switch (op) {
                    case '+':
                        result = numRom1 + numRom2;
                        break;
                    case '-':
                        result = numRom1 - numRom2;
                        break;
                    case '/':
                        result = numRom1 / numRom2;
                        break;
                    case '*':
                        result = numRom1 * numRom2;
                }
            } String res1 = toArab(result);
            System.out.println(res1);
        }
    }

    private static int rom(String str) {
        String[] rum = {"I", "II", "III", "IV", "V", "VI", "XII", "VIII", "IX", "X"};
        int num1 = 0;
        for (int i = 0; i < 10; i++)
            if (rum[i].equals(str)) {
                num1 = num1 + i + 1;
            }
        return num1;
    }
    public static String toArab (int number) {
        int[] arabArray = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanArray = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < arabArray.length; i += 1) {
            while (number >= arabArray[i]) {
                number -= arabArray[i];
                res.append(romanArray[i]);
            }
        }
        return res.toString();
    }
}
