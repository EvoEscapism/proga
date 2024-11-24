package Sources;

public abstract class Character {
    private String name;

    public Character(String name) {
        this.name = name;
    }

    public abstract void printInformation();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
