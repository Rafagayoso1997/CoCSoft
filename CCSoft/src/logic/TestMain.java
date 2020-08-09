package logic;

public class TestMain {

    public static void main(String[] args) {
        Person attacker = new Person("Rafa",7);
        Person defender = new Person("Pelly", 9);

        Duel duel = new Duel(attacker,1,defender,0.54);

        System.out.println(duel.pointsGained() );
    }
}
