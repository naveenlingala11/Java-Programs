package JavaBasic.Miscellaneous;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Random Number "+random.nextInt(100));
    }
}
