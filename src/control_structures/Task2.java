package control_structures;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Task2.findTimeOfYear();

    }

    public static void findTimeOfYear() {
        System.out.println("Enter the number of the month : ");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i >= 3 && i <= 5) {
            System.out.println("Spring");
        } else if (i >= 6 && i <= 8) {
            System.out.println("Summer");
        } else if (i >= 9 && i <= 11) {
            System.out.println("Autumn");
        } else if (i == 12 || i == 1 || i == 2) {
            System.out.println("Winter");
        } else {
            System.out.println("There is no such month");
        }
        scanner.close();
    }


}
