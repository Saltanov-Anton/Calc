package Calc23;

public class Roman {
    public static int romanToArab (String str) {
        String[] rum = {"I", "II", "III", "IV", "V", "VI", "XII", "VIII", "IX", "X"};
        int num1 = 0;
        for (int i = 0; i < 10; i++)
            if (rum[i].equals(str)) {
                num1 = num1 + i + 1;
            }
        return num1;
    }

    public static String arabToRoman (int number) {
        int[] arabArray = new int[]{100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanArray = new String[]{"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < arabArray.length; i++) {
            while (number >= arabArray[i]) {
                number -= arabArray[i];
                res.append(romanArray[i]);
            }
        }
        return res.toString();
    }
}
