import java.util.Arrays;

public class Q13_RightRotateElementsOfArray {

    static void rightRotateArrayElements(int[] arr, int rotations) {
        int n = arr.length;

        for (int i = 1; i <= rotations; i++) {
            int temp = arr[n - 1];
            int j = n - 1;
            while (j > 0) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[0] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int rotations = 1;

        System.out.println("Before Left Rotating Array : " + Arrays.toString(arr));

        rightRotateArrayElements(arr, rotations);

        System.out.println("After Left Rotating Array : " + Arrays.toString(arr));
    }
}
