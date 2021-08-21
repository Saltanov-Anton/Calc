package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        char op = scan.next().charAt(0);
        String str2 = scan.next();
        int num1 = Integer.parseInt(str1, 10);
        int num2 = Integer.parseInt(str2, 10);
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
            } else {
                System.out.println("Неверное число");
            }
    }
    static int parseInt(String str1, String str2) {
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
            return num1 + num2;
    }

}
