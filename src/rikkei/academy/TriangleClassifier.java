package rikkei.academy;

import java.util.Scanner;

public class TriangleClassifier {
    Scanner scanner = new Scanner(System.in);

    public static String triangle(int a, int b, int c) {
        if ((a > 0 && b > 0 && c > 0)) {
            if (a == b && b == c) {
                return "Tam giác đều";
            } else if (a == b || b == c || c == a) {
                return "Tam giác cân";
            } else if ((a + b > c || b + c > a || c + a > b)) {
                return "tam giác thường";
            } else {
                return "không phải tam giác!";
            }
        } else {
           return "không phải tam giác";
        }
    }
}
