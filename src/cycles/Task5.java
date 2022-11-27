package cycles;

public class Task5 {
    public static void main(String[] args) {
        Task5.printFirstTenNumbers();
    }
    public static void printFirstTenNumbers() {
        int i = 0;
        int count = 0;
        while (count < 10) {
            System.out.println(i);
            i -= 5;
            count += 1;
        }
    }
}
