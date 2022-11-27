package control_structures;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Task3.spotOddOrEven();
    }

    public static void spotOddOrEven() {
        System.out.println("Enter the number : ");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int x = i % 2;
        if (x == 0) {
            System.out.println("even number");
        } else if (x == 1) {
            System.out.println("odd number");
        }
        scanner.close();
    }
}
