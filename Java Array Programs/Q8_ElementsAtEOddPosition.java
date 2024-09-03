public class Q8_ElementsAtEOddPosition {
    public static void main(String[] args) {
        int[] arr = { 3, 7, 3, 9, 6, 4, 2, 7, 5 };
        System.out.println("Elements at Odd Positions are: ");
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
