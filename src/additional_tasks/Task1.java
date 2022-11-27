package additional_tasks;

public class Task1 {
    public static void main(String[] args) {
        Task1.printSequenceFibonacci();
    }

    public static void printSequenceFibonacci() {
        int num1 = 1;
        int num2 = 1;
        int num3;
        System.out.print(num1 + "  " + num2 + "  ");
        for (int i = 1; i < 9; i++){
            num3 = num1 + num2;
            System.out.print(num3 + "  ");
            num1 = num2;
            num2 = num3;
        }

    }
}


