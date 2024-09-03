public class Q1_TotalCharactersInString {

    static int countTotalCharacters(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "The best of both worlds";
        int characters = countTotalCharacters(str);
        System.out.println("Total No. of Characters : " + characters);
    }
}
