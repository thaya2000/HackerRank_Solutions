public class Reverse_Str {

    // public static void main(String[] args) {
    // String str1 = "ABCD";
    // String str2 = "";

    // for (int i = str1.length() - 1; i >= 0; i--) {
    // // System.out.print(str1.charAt(i));
    // str2 = str2 + str1.charAt(i);
    // }

    // System.out.println(str2);
    // }

    // public static void main(String[] args) {
    // String str1 = "ABCD";
    // StringBuilder reversed = new StringBuilder();

    // for (int i = str1.length() - 1; i >= 0; i--) {
    // // System.out.print(str1.charAt(i));
    // // str2 = str2 + str1.charAt(i);
    // reversed.append(str1.charAt(i));
    // }

    // String str = reversed.toString();

    // System.out.println(str);
    // }

    public static void main(String[] args) {
        String str1 = "ABCD";
        String rev = "";
        char a[] = str1.toCharArray();

        int len = a.length;

        for (int i = len - 1; i >= 0; i--) {
            // System.out.print(str1.charAt(i));
            // str2 = str2 + str1.charAt(i);
            rev = rev + a[i];

        }

        System.out.println(rev);
    }
}
