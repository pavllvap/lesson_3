package control_structures;

import java.util.HashMap;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Task5.findColorsOfRainbow();
    }

    public static void findColorsOfRainbow() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Orange");
        map.put(3, "Yellow");
        map.put(4, "Green");
        map.put(5, "Blue");
        map.put(6, "Navy blue");
        map.put(7, "Purple");
        System.out.println("Enter the number of color : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number >= 1 && number <= 7) {
            String color = map.get(number);
            System.out.println(color);
        } else {
            System.out.println("Incorrect number of color");
        }
        scanner.close();
    }
}








