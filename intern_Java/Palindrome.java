import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int num_org = num;
        int rev = 0;

        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }

        System.out.println(rev);

        if (num_org == rev) {
            System.out.println("num is Palindrome Number");
        } else {
            System.out.println("num is not Palindrome Number");
        }
        scanner.close();

    }

    // public static void main(String[] args) {

    // Scanner scanner = new Scanner(System.in);
    // String num_str = scanner.next();
    // // int num = scanner.nextInt();

    // // String num_str = Integer.toString(num);
    // int len = num_str.length();

    // boolean ispalindrome = true;

    // for (int i = 0; i < (len + 1) / 2; i++) {
    // if (num_str.charAt(i) == num_str.charAt(len - i - 1)) {
    // ispalindrome = true;
    // } else {
    // ispalindrome = false;
    // break;
    // }
    // }

    // if (ispalindrome) {
    // System.out.println("String is Palindrome Number");
    // } else {
    // System.out.println("String is not Palindrome Number");
    // }
    // scanner.close();

    // }

}
