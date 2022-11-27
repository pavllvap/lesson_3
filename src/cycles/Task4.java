package cycles;

public class Task4 {
    public static void main(String[] args) {
        Task4.printOrderOfNumbers();
    }

    public static void printOrderOfNumbers() {
        int i = 7;
        while (i >= 7 && i <= 98) {
            System.out.print(i + " ");
            i += 7;
        }
    }
}
