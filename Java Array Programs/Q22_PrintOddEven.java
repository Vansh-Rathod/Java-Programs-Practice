public class Q22_PrintOddEven {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 6, 3, 2 };

        System.out.println("Even Numbers: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println();

        System.out.println("Odd Numbers: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
