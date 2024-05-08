import java.util.Scanner;

public class Reverse_Num {
    // public static void main(String[] args) {

    // Scanner scanner = new Scanner(System.in);
    // int num = scanner.nextInt();

    // // int num = 1234;

    // String str = Integer.toString(num);
    // String rev = "";

    // for (int i = str.length() - 1; i >= 0; i--) {
    // rev = rev + str.charAt(i);
    // }

    // int revNum = Integer.parseInt(rev);

    // System.out.println(revNum);
    // scanner.close();
    // }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();

        int rev = 0;

        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }

        System.out.println(rev);
    }
}
