package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int rndStamina = rnd.nextInt(100 - 90) + 90;
        Player p1 = new Player(rndStamina);
        Player p2 = new Player(rndStamina);
        Player p3 = new Player(rndStamina);
        Player p4 = new Player(rndStamina);
        Player p5 = new Player(rndStamina);
        Player p6 = new Player(rndStamina);
        Player.info();
        for (int i = 0; i < rndStamina; i++) {
            p1.run();
        }
        Player.info();
    }
}
