public class Q21_RemoveDuplicate {

    static int removeDuplicates(int[] arr, int n) {
        if (n == 0 || n == 1) {
            System.out.println("Provide Array with more than two values");
        }
        int[] temp = new int[n];
        int k = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int num = arr[i];
                if (num == arr[j]) {
                    arr[j] = -1;
                }
            }
            if (arr[i] != -1) {
                temp[k++] = arr[i];
            }
        }

        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
        return k;
    }

    public static void main(String[] args) {
        int[] arr = { 6, 9, 3, 6, 1, 5, 7, 1, 8, 2, 9, 5, 8 };

        System.out.print("Original Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int length = arr.length;
        length = removeDuplicates(arr, length);

        System.out.print("After Removing Duplicates: ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        
    }
}
