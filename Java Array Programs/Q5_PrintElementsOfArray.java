import java.util.Arrays;

public class Q5_PrintElementsOfArray {

    static void printArray(int[] arr) {
        System.out.print("Elements of Array are : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };

        System.out.println("Array = " + Arrays.toString(arr));

        printArray(arr);

    }
}
