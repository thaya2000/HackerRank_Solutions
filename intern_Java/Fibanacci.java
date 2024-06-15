import java.util.ArrayList;
import java.util.Scanner;

public class Fibanacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n2 = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n2; i++) {
            if (i == 0) {
                arr.add(0);
            } else if (i == 1) {
                arr.add(1);
            } else {
                arr.add(arr.get(i - 2) + arr.get(i - 1));
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            System.out.printf("%d ", arr.get(i));
            // System.out.println(arr.get(i));
            // System.out.println(arr.get(i));
        }
    }
}
