public class Swap {

    public void swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

    public static void main(String[] args) {

        Swap obj = new Swap();

        int a = 10;
        int b = 20;

        int[] temp = { a, b };

        obj.swap(temp);

        a = temp[0];
        b = temp[1];

        System.out.println("a: " + a + " b: " + b);

    }

}
