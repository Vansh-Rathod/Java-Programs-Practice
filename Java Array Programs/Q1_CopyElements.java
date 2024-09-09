import java.util.Arrays;

public class Q1_CopyElements {

    static void copyElements(int[] arr1, int[] arr2) {
        for(int i = 0; i < arr1.length; i++){
            arr2[i] = arr1[i];
        }
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6 };
        int[] arr2 = new int[arr1.length];

        System.out.println("Before Copying");
        System.out.println("Array1 = " + Arrays.toString(arr1));
        System.out.println("Array2 = " + Arrays.toString(arr2));

        copyElements(arr1, arr2);

        System.out.println("After Copying");
        System.out.println("Array1 = " + Arrays.toString(arr1));
        System.out.println("Array2 = " + Arrays.toString(arr2));
    }
}
