package cycles;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Task3.sumOfNumbers();
    }

    public static void sumOfNumbers() {
        System.out.println("Enter the number : ");
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number = scanner.nextInt();
        for (int i = 1; i < number; i++) {
            sum += i;
        }
        System.out.println(sum);
    }


}
