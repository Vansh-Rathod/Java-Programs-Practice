import java.util.Arrays;

public class Q3_LeftRotateElementsOfArray {

    static int[] leftRotateArrayElements(int[] arr, int rotations) {
        int n = arr.length;

        for (int i = 1; i <= rotations; i++) {
            int temp = arr[0];
            int j = 1;
            while (j < arr.length) {
                arr[j - 1] = arr[j];
                j++;
            }
            arr[n - 1] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int rotations = 1;

        System.out.println("Before Left Rotating Array : " + Arrays.toString(arr));

        leftRotateArrayElements(arr, rotations);

        System.out.println("After Left Rotating Array : " + Arrays.toString(arr));

    }
}
