package Sources;

import java.util.List;
import java.util.ArrayList;

public class Explorers_group implements Moveble {
    private Location location;
    private String name;
    private Planet planet;
    private List<Explorer> members = new ArrayList<>();
    private double rating;


    public Explorers_group() {
        this("Unknown");
    }

    public Explorers_group(String name) {
        this(new Location("Unknown", "Unknown"), name);
    }

    public Explorers_group(Location location, String name) {
        this(location, name, Planet.FANTOMAS);
    }

    public Explorers_group(Location location, String name, Planet planet) {
        this.location = location;
        this.name = name;
        this.planet = planet;
        System.out.println("Отправилась экспедиция: \"" + this.getName() + "\" " + "на город: " + planet);
    }

    public void addMember(Explorer member) {
        this.members.add(member);
        System.out.println("В экспедиции \"" + name + "\" учавствует " + member.getName());
    }

    public void removeMembers(Explorer member) {
        this.members.remove(member);
    }

    public void formRating() {
        for (Explorer member : members) {
            rating += member.getPower();
        }
        rating = rating / this.members.size();
    }

    public void printSize(){
        System.out.println("Группа состоит из " + members.size() + " человек");
    }

    public Location getLocation() {
        return location;
    }

    public void moveLocation(Location location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Planet getPlanet() {
        return planet;
    }

    public void setGenre(Planet planet) {
        this.planet = planet;
    }

    public List<Explorer> getMembers() {
        List<Explorer> xxx = new ArrayList<>();
        for (int i = 0; i < members.size(); i++) {
            xxx.add(members.get(i));
        }
        return xxx;
    }

    public double getRating() {
        return rating;
    }
}
