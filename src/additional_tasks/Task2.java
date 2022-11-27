package additional_tasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Task2.countDeposit();
    }

    public static void countDeposit() {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        float sum = 0f;
        System.out.println("Enter deposit : ");
        float deposit = scanner1.nextFloat();
        System.out.println("Enter amount of months : ");
        int months = scanner2.nextInt();
        for (int i = 1; i <= months; i++) {
            sum = (float) (sum + deposit * 1.07);
        }
        System.out.println(sum);
    }


}
