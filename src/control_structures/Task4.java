package control_structures;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Task4.spotColdOrWarm();
    }


    public static void spotColdOrWarm() {
        System.out.println("Enter the temperature : ");
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        if (t > -5) {
            System.out.println("it's warm");
        } else if (t <= -5 && t >= -20) {
            System.out.println("it's normal");
        } else if (t < -20) {
            System.out.println("it's cold");
        }
        scanner.close();
    }
}
