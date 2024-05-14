package lesson_8.HomeWork;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

    abstract class Plant {
        private static final AtomicInteger counter = new AtomicInteger(0); // Для уникального номера
        protected int id;
        protected String name;
        protected double height;  // Текущая высота растения
        protected double maxGrowthPerSpring;
        protected double maxGrowthPerSummer;
        protected double maxGrowthPerAutumn;
        protected double maxGrowthPerWinter;
        protected double maxHeight;

        public Plant(String name, double initialHeight, double maxGrowthPerSpring, double maxGrowthPerSummer, double maxGrowthPerAutumn, double maxGrowthPerWinter, double maxHeight) {
            this.id = counter.incrementAndGet();
            this.name = name;
            this.height = initialHeight;
            this.maxGrowthPerSpring = maxGrowthPerSpring;
            this.maxGrowthPerSummer = maxGrowthPerSummer;
            this.maxGrowthPerAutumn = maxGrowthPerAutumn;
            this.maxGrowthPerWinter = maxGrowthPerWinter;
            this.maxHeight = maxHeight;
        }

        public void grow(String season) {
            Random rand = new Random();
            double growth = 0;

            switch (season.toLowerCase()) {
                case "spring":
                    growth = rand.nextDouble() * maxGrowthPerSpring;
                    break;
                case "summer":
                    growth = rand.nextDouble() * maxGrowthPerSummer;
                    break;
                case "autumn":
                    growth = rand.nextDouble() * maxGrowthPerAutumn;
                    break;
                case "winter":
                    growth = rand.nextDouble() * maxGrowthPerWinter;
                    break;
                default:
                    System.out.println("Invalid season");
                    return;
            }

            height = Math.min(height + growth, maxHeight);
            System.out.println(name + " (ID: " + id + ") grew by " + String.format("%.2f", growth) + " cm in " + season + ". Total height: " + String.format("%.2f", height) + " cm.");
        }

        public double getHeight() {
            return height;
        }
    }

