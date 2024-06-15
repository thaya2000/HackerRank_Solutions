import java.util.Scanner;

public class EvenOddDigit {

    // public static void main(String[] args) {
    // Scanner scanner = new Scanner(System.in);
    // Integer num = scanner.nextInt();

    // String num_str = Integer.toString(num);
    // int len = num_str.length();

    // int count_odd = 0;
    // int count_even = 0;

    // for (int i = 0; i < len; i++) {
    // if ((Character.getNumericValue(num_str.charAt(i)) % 2 == 0)) {
    // count_even++;
    // } else {
    // count_odd++;
    // }
    // }
    // System.out.println("even : " + count_even + " odd : " + count_odd);
    // }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer num = scanner.nextInt();

        int count_odd = 0;
        int count_even = 0;

        int reminder = 0;

        while (num > 0) {
            reminder = num % 10;
            if (reminder % 2 == 0) {
                count_even++;
            } else {
                count_odd++;
            }
            num = num / 10;
        }
        scanner.close();

        System.out.println("even : " + count_even + " odd : " + count_odd);
    }

}
