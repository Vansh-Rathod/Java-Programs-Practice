public class Q10_PrintSmallest {
    public static void main(String[] args) {
        int[] arr = { 56, 12, 89, 54, 67, 21, 43 };
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum Element = " + min);
    }
}
