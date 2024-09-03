import java.lang.Math;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;;

public class Q6_GenerateRandomNumber {
    public static void main(String[] args) {
        // METHOD - 1 : using Math.random()
        System.out.println("Random Number1 : " + Math.random());
        System.out.println("Random Number2 : " + Math.random());

        // random number between 5 and 20
        System.out.println("Random Number3: " + (int) (Math.random() * (20 - 5 + 1) + 5));

        // METHOD - 2 : using Random class
        Random r1 = new Random();
        System.out.println("Random Number4: " + r1.nextInt(100));
        System.out.println("Random Number5: " + r1.nextInt(50, 100));
        System.out.println("Random Number6: " + r1.nextFloat(100));

        // METHOD - 3 using ThreadLocalRandom class
        System.out.println("Random Number7: " + ThreadLocalRandom.current().nextInt());
        System.out.println("Random Number8: " + ThreadLocalRandom.current().nextInt(49, 50));
        System.out.println("Random Number9: " + ThreadLocalRandom.current().nextFloat(49, 50));

        // METHOD - 4 : using JAVA 8
        Random r2 = new Random();
        r2.ints(5, 10, 15).forEach(System.out::println);
    }
}
