package array;

import java.util.Random;

public class Cardgame {
    public static void main(String[] args) {
        Random r = new Random();
        String cardType[] = { "d", "c", "h", "s" };
        int humanCardNumber= r.nextInt(52)+1;
        int robotCardNumber= r.nextInt(52)+1;
    }
}
