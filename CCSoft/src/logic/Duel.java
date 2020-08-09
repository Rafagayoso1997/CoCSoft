package logic;

public class Duel {

    private Person attacker;
    private short stars;
    private short thLevelAttacked;

    public Duel(Person attacker, short stars, short thLevelAttacked) {
        this.attacker = attacker;
        this.stars = stars;
        this.thLevelAttacked = thLevelAttacked;
    }

    public Person getAttacker() {
        return attacker;
    }

    public void setAttacker(Person attacker) {
        this.attacker = attacker;
    }

    public short getStars() {
        return stars;
    }

    public void setStars(short stars) {
        this.stars = stars;
    }

    public short getThLevelAttacked() {
        return thLevelAttacked;
    }

    public void setThLevelAttacked(short thLevelAttacked) {
        this.thLevelAttacked = thLevelAttacked;
    }
}
