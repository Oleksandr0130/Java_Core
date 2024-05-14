package lesson_8.HomeWork;

public class VisualGarden {
    public static void main(String[] args) {
        Garden garden = new Garden();

        // Создаем растения и добавляем их в сад
        Tree oak = new Tree("Oak Tree");
        Bush roseBush = new Bush("Rose Bush");
        Flower tulip = new Flower("Tulip");

        garden.addPlant(oak);
        garden.addPlant(roseBush);
        garden.addPlant(tulip);

        System.out.println("============растения в саду===========");
        garden.displayPlants();

        // Моделируем несколько сезонов
        for (int i = 0; i < 4; i++) { // Проходим через 4 сезона
        System.out.println("=======================");
            garden.nextSeason();
            garden.displayPlants();
        }
    }
}

