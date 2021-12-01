public class test {
    public static void main(String[] args) {
        int a = 6;
        int[] arab = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String [] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String  res = new String();
        for (int i = 0; i < arab.length; i++) {
            if (a >= arab[i]) {
                a = a - arab[i];
                res += roman[i];
            }
        }
        System.out.println(res);
    }
}
