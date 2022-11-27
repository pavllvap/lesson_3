package additional_tasks;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        Task3.printMultiplicationTable();
    }
    public static void printMultiplicationTable() {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                int result = i * j;
                String s = i + " * " + j + " = " + result;
                list1.add(s);
            }
        }
        for (String i : list1
        ) {
            if (i.length() < 10) {
                i += " ";
                list2.add(i);
            } else {
                list2.add(i);
            }
        }
        for (int i = 0; i < 9; i++) {
            System.out.print(list2.get(i));
            for (int j = i + 9; j < list2.size(); j += 9) {
                System.out.print("  " + list2.get(j) + "  ");
            }
            System.out.println();
        }
    }
}
