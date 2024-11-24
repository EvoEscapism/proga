
package Sources;


public class Enemy extends Character implements Moveble {
    private Location location;
    private Location homeLocation;

    private Planet planet_from;
    private double rating;

    public Enemy(String name) {
        this(name, new Location("дом", "Unknown"));
    }

    public Enemy(String name, Location location) {
        this(name, location, Planet.MARS);
    }

    public Enemy(String name, Location homeLocation, Planet planet_from) {
        super(name);
        this.homeLocation = homeLocation;
        this.location = homeLocation;
        this.planet_from = planet_from;
    }

    public void formRating(Planet planet_from, double rating) {
        if (this.planet_from == planet_from) {
            this.rating = rating - 2;
        } else {
            this.rating = rating;
        }

    }

    public void moveLocation(Location location) {
        System.out.println(getName() + " пришёл из " + this.location.city() + " в " + location.city());
        this.location = location;
    }



    @Override
    public void printInformation() {
        System.out.println("Локация слушателя: " + location.planet() + " домашняя локация: " + homeLocation.planet() + " любимый жанр: " + planet_from.name());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Enemy enemy = (Enemy) obj;
        return planet_from == enemy.getPlanet_from();
    }

    @Override
    public int hashCode(){
        return planet_from.name().hashCode();
    }

    @Override
    public String toString() {
        return "Слушатель: " + getName();
    }



    public  Planet getPlanet_from() {
        return planet_from;
    }

    public void setLoveGenre(Planet planet_from) {
        this.planet_from = planet_from;
    }

    public double getRating() {
        return rating;
    }

    public Location getLocation() {
        return location;
    }

    public Location getHomeLocation() {
        return homeLocation;
    }

    public void setHomeLocation(Location homeLocation) {
        this.homeLocation = homeLocation;
    }
}
