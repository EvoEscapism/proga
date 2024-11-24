package Sources;

import java.util.ArrayList;
import java.util.List;

public class Expedition {
    private String name;
    private Explorers_group explorers_group;
    private Location location;
    private List<Enemy> enemies = new ArrayList<>();

    public Expedition(String name, Explorers_group explorers_group, Location location) {
        this.name = name;
        this.explorers_group = explorers_group;
        this.location = location;
        System.out.println("Господин Спрутс объявили о сборе полиции из-за экспедиции \"" + name + "\" " + "на " + location.planet() + " в городе " + location.city());
    }

    public void play(float all_power, float guard_power) throws NoExplorerFoundException {
        if (explorers_group.getMembers().size() == 0) {
            throw new NoExplorerFoundException("Нет участников в экспедиции");
        }
        if (all_power < guard_power){
        System.out.println("Экспедиция: \"" + explorers_group.getName() + "\" изменила место назначения: \"" + name + "\" в " + location.planet() + " из-за полиции, новый город: " + Planet.MANTISS);

        for (Explorer explorer: explorers_group.getMembers()) {
            explorer.seeViews();
        }
        System.out.println("Экспедиция " + explorers_group.getName() + " Приземлилась в городе " + Planet.MANTISS + " И начала исследовательские работы");
        for (Explorer explorer: explorers_group.getMembers()) {
            explorer.doWork();
        }
        System.out.println("Экспедиция: \"" + explorers_group.getName() + "\" закончила работы : \"" + name + "\" в " + location.planet());
        for (Enemy enemy : enemies) {
            enemy.formRating(explorers_group.getPlanet(), explorers_group.getRating());
        }
        System.out.println("Экспедиция " + explorers_group.getName() + " Отправилась обратно домой ");}
        else{System.out.println("Экспедиция: \"" + explorers_group.getName() + "\" не изменила место назначения, так как исследователи оказались сильнее полиции");


            System.out.println("Экспедиция " + explorers_group.getName() + " Приземлилась в городе " + Planet.FANTOMAS + " И начала исследовательские работы");
            for (Explorer explorer: explorers_group.getMembers()) {
                explorer.doWork();
            }
            System.out.println("Экспедиция: \"" + explorers_group.getName() + "\" закончила работы : \"" + name + "\" в " + location.planet());
            for (Enemy enemy : enemies) {
                enemy.formRating(explorers_group.getPlanet(), explorers_group.getRating());
            }
            System.out.println("Экспедиция " + explorers_group.getName() + " Отправилась обратно домой ");
            System.out.println(all_power);}


    }

    public void addListener(Enemy enemy) {
        enemies.add(enemy);
        enemy.moveLocation(location);
    }

    public String getName() {
        return name;
    }

    public Explorers_group getOrchestra() {
        return explorers_group;
    }

    public Location getLocation() {
        return location;
    }

    public List<Enemy> getListeners() {
        return enemies;
    }
}