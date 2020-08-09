package logic;

public class Person {

    private String name;
    private short thLevel;

    public Person(String name, short thLevel) {
        this.name = name;
        this.thLevel = thLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getThLevel() {
        return thLevel;
    }

    public void setThLevel(short thLevel) {
        this.thLevel = thLevel;
    }
}
