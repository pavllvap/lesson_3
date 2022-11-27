package cycles;

public class Task1 {
    public static void main(String[] args) {
        Task1.findOddNumbers();
    }

    public static void findOddNumbers() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}
