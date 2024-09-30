public class Game extends App {
    // Поля
    private String genreGame;
    private String[] featuresGame;
    private static int gameCount = 0; // Статическая переменная для счетчика объектов

    // Конструктор с параметрами
    public Game(String title, String author, String os, String genre, String[] features) {
        super(title, author, os); // Вызов конструктора родительского класса App
        this.genreGame = genre;
        this.featuresGame = features;
        gameCount++;
    }

    // Конструктор по умолчанию
    public Game() {
        this("", "", "", "", new String[]{});
    }

    // Геттеры и сеттеры
    public String getGenre() {
        return genreGame;
    }

    public void setGenre(String genre) {
        this.genreGame = genre;
    }

    public String[] getFeatures() {
        return featuresGame;
    }

    public void setFeatures(String[] features) {
        this.featuresGame = features;
    }

    // Реализация абстрактного метода run()
    @Override
    public void run() {
        System.out.println("Игра запущена на " + getOs()); // Используем getOs() из родительского класса
    }

    // Метод для вывода информации
    @Override
    public void displayInfo() {
        super.displayInfo(); // Вызов метода displayInfo() родительского класса
        System.out.println("Жанр: " + genreGame);
        if (featuresGame != null && featuresGame.length > 0) {
            System.out.println("Особенности: " + String.join(", ", featuresGame));
        } else {
            System.out.println("Особенности: нет");
        }
    }

    // Статический метод для получения количества игр
    public static int getGameCount() {
        return gameCount;
    }
}
