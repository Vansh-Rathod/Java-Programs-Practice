public class Q3_CountPunctuationCharacters {

    static int countTotalPunctuations(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '.' || str.charAt(i) == '?' || str.charAt(i) == '\'' || str.charAt(i) == '\"'
                    || str.charAt(i) == '!' || str.charAt(i) == '-' || str.charAt(i) == ',' || str.charAt(i) == ':'
                    || str.charAt(i) == ';') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "He said, 'The mailman loves you.' I heard it with my own ears.";
        int ans = countTotalPunctuations(str);
        System.out.println("Total no. of Punctuations : " + ans);
    }
}
