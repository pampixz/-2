public class Mobile extends Game {
    // Поля
    private boolean isFreeToPlay;

    // Конструктор с параметрами
    public Mobile(String title, String author, String os, String genre, String[] features, boolean isFreeToPlay) {
        super(title, author, os, genre, features); // Вызов конструктора класса Game
        this.isFreeToPlay = isFreeToPlay;
    }

    // Конструктор по умолчанию
    public Mobile() {
        this("", "", "", "", new String[]{}, true); // Вызов конструктора с параметрами, по умолчанию FreeToPlay = true
    }

    // Геттеры и сеттеры
    public boolean isFreeToPlay() {
        return isFreeToPlay;
    }

    public void setFreeToPlay(boolean isFreeToPlay) {
        this.isFreeToPlay = isFreeToPlay;
    }

    // Переопределение метода run()
    @Override
    public void run() {
        System.out.println("Мобильная игра запущена на  " + getOs() + (isFreeToPlay ? " (Бесплатная)" : ""));
    }

    // Переопределение метода displayInfo()
    @Override
    public void displayInfo() {
        super.displayInfo(); // Вызов метода displayInfo из класса Game
        System.out.println("Бесплатная: " + (isFreeToPlay ? "Да" : "Нет"));
    }
}
