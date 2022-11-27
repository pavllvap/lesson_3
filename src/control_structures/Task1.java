package control_structures;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Task1.findTimeYear();
    }


    public static void findTimeYear (){
        System.out.println("Enter the number of the month : ");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i){
            case 1, 2, 12:
                System.out.println("Winter");
                break;
            case 3, 4, 5:
                System.out.println("Spring");
                break;
            case 6, 7, 8:
                System.out.println("Summer");
                break;
            case 9, 10, 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("There is no such month");
                scanner.close();
        }
    }







}
