import java.lang.Math;

public class AmstrongProgram2 {

    static boolean isAmstrong2(int n) {
        int temp, last = 0, digit = 0, sum = 0;

        temp = n;
        while (temp > 0) { // finding no. of digits in the number
            temp = temp / 10;
            digit++;
        }

        temp = n;
        while (temp > 0) {
            // (mod can also be find out - divide the number by dividend, then subtract the value before the point and then multiply it by 10)
            last = temp % 10;
            sum += (Math.pow(last, digit));
            temp = temp / 10;
        }
        if (sum == n) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        int n = 1634;
        System.out.println("Number: " + n);

        if (isAmstrong2(n)) {
            System.out.println("Amstrong Number");
        } else {
            System.out.println("Not a Amstrong Number");
        }


        // code for finding all the Armstrong numbers up to the specified limit.
        // int limit = 999;
        // for (int i = 0; i < limit; i++) {
        //     if(isAmstrong2(i)){
        //         System.out.println(i);
        //     }
        // }

    }
}
