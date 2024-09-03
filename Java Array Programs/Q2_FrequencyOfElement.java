public class Q2_FrequencyOfElement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 8, 3, 2, 2, 2, 5, 1 };
        int[] frequency = new int[10];

        for (int i = 0; i < arr.length; i++) {
            frequency[arr[i]]++;
        }
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] != 0) {
                System.out.println(i + " -> " + frequency[i]);
            }
        }

    }
}