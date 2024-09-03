public class Q9_PrintLargest {
    public static void main(String[] args) {
        int[] arr = { 56, 12, 89, 54, 67, 21, 43 };
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum Element = " + max);
    }
}
