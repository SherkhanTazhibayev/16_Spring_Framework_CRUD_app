package fibbonachi;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();

        int a = 0;
        int b = 1;
        int next = 0;

        for (int i = 2; i < target + 1; i++) {
            next = a + b;
            a = b;
            b = next;
        }
        System.out.println(next);
    }
}
