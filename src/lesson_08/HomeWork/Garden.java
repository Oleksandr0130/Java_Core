package lesson_08.HomeWork;


import java.util.ArrayList;
import java.util.List;

// В этом задание мы будем выращивать сад (это как тамагочи, только для сада !).
//Вам необходимо реализовать следующие классы: Дерево (Tree), Куст (Bush), Цветок (Flower).
//
//Для каждого типа растения (для дерева, для куста, для цветка) должны быть определены значения максимального роста за сезон (см. таблицу),
// но реальный рост конкретного растения за сезон определяется как случайное число не превышающее значение максимального роста за сезон. Например:
//Деревья за лето могут вырасти максимум на 15 см но реальный прирост конкретного дерева может составить 3,  7 или 10 см.
public class Garden {
    private List<Plant> plants;
    private int season; // 0: spring, 1: summer, 2: autumn, 3: winter
    private static final String[] SEASONS = {"spring", "summer", "autumn", "winter"};

    public Garden() {
        this.plants = new ArrayList<>();
        this.season = 0; // Начинаем с весны
    }

    public void addPlant(Plant plant) {
        plants.add(plant);
    }

    public void displayPlants() {
        for (Plant plant : plants) {
            System.out.println(plant.getClass().getSimpleName() + " (ID: " + plant.id + ", Name: " + plant.name + ", Height: " + String.format("%.2f", plant.getHeight()) + " cm)");
        }
    }

    public void nextSeason() {
        String currentSeason = SEASONS[season];
        System.out.println("Current season: " + currentSeason);

        for (Plant plant : plants) {
            plant.grow(currentSeason);
        }

        season = (season + 1) % 4; // Переключаем на следующий сезон по кругу
    }
}
