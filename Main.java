import Sources.*;

public class Main {
    public static void main(String[] args) {
        try {

            Explorer znaika = new Explorer("Знайка", Job.EXPLORER, 7,  Planet.FANTOMAS, Views.Village);
            Explorer vintik = new Explorer("Винтик", Job.REPAIRMAN, 0, Planet.FANTOMAS, Views.Craters);
            Explorer pilulkin = new Explorer("Пилюлькин", Job.DOCTOR, 0, Planet.FANTOMAS, Views.Mountains);
            Explorer shpuntik= new Explorer("Шпунтик",Job.REPAIRMAN, 0, Planet.FANTOMAS, Views.Craters);
            Explorer tubik = new Explorer("Тюбик",Job.ARTIST, 5, Planet.FANTOMAS, Views.Сlearing);
            Explorer vorchun = new Explorer("Ворчун",Job.VORCHUN, 5, Planet.FANTOMAS, Views.Village);


            Enemy Spruts = new Enemy("Спрутс", new Location("Луна", "Дворец"), Planet.FANTOMAS);
            Enemy Guard1 = new Enemy("Гвардия 1", new Location("Луна", "Отдел Фантомасской полиции"), Planet.FANTOMAS);
            Enemy Guard2 = new Enemy("Гвардия 2", new Location("Луна", "Отдел Фантомасской полиции"),Planet.FANTOMAS);
            Enemy Guard3 = new Enemy("Гвардия 3", new Location("Луна", "Отдел Фантомасской полиции"), Planet.FANTOMAS);
            Enemy Guard4 = new Enemy("Гвардия 4", new Location("Луна", "Отдел Фантомасской полиции"), Planet.FANTOMAS);

            float Guard_power = 32.0f;

            Location placeExpedition = new Location("Луна", "Фантомас");

            Explorers_group explorers_group = new Explorers_group(placeExpedition, "Первая Экспедиция", Planet.FANTOMAS);
            addMembers(explorers_group, znaika, vintik, pilulkin, shpuntik, tubik, vorchun);
            explorers_group.formRating();
            explorers_group.printSize();

            Expedition expedition = new Expedition("Первая Экспедиция", explorers_group, placeExpedition);
            addMembers(expedition, Spruts, Guard1, Guard2, Guard3, Guard4);

            float power_sum = (znaika.getPower()+ vintik.getPower()+ pilulkin.getPower()+ shpuntik.getPower()+ tubik.getPower()+ vorchun.getPower());

            expedition.play(power_sum, Guard_power);

        } catch (NonExistentPowerException | NoExplorerFoundException e) {
            System.out.println(e.getMessage());
        }

    }



    public static void addMembers(Explorers_group explorers_group, Explorer... explorer) {
        for (Explorer m : explorer) {
            explorers_group.addMember(m);
        }

    }
    public static void addMembers(Expedition expedition, Enemy... enemies) {
        for (Enemy m : enemies) {
            expedition.addListener(m);
        }
    }
}
