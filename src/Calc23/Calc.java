package Calc23;

public class Calc {

    public static int arabCalc (int num1, char oper, int num2) {
        int result = 0;
        if ((num1 <= 10 && num2 <= 10) && (num1 >= -10 && num2 >= -10)) {
            switch (oper) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                case '*':
                    result = num1 * num2;
            }
        }
        return result;
    }

    public static String romanCalc (String numRom1, char oper, String numRom2) {
        int num1 = Roman.romanToArab(numRom1);
        int num2 = Roman.romanToArab(numRom2);
        int resultArab = 0;
        if ((num1 > 0 && num2 > 0) && (num1 <= 10 && num2 <= 10)) {
            switch (oper) {
                case '+':
                    resultArab = num1 + num2;
                    break;
                case '-':
                    resultArab = num1 - num2;
                    break;
                case '/':
                    resultArab = num1 / num2;
                    break;
                case '*':
                    resultArab = num1 * num2;
            }
        }
        String resultRom = Roman.arabToRoman(resultArab);
        return resultRom;
    }
}
