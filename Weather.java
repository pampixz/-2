public class Weather extends App {
    // Поля
    private String regionWeather;
    private static int weatherAppCount = 0; // Статическая переменная для счетчика объектов

    // Конструктор с параметрами
    public Weather(String title, String author, String os, String region) {
        super(title, author, os);  // Вызов конструктора родительского класса App
        this.regionWeather = region;
        weatherAppCount++;  // Увеличение счетчика при создании объекта
    }

    // Конструктор по умолчанию
    public Weather() {
        this("", "", "", "Unknown");  // Инициализация значениями по умолчанию
    }

    // Геттеры и сеттеры
    public String getRegion() {
        return regionWeather;
    }

    public void setRegion(String regionWeather) {
        this.regionWeather = regionWeather;
    }

    // Реализация абстрактного метода run()
    @Override
    public void run() {
        System.out.println("Погода для региона: " + regionWeather);
    }

    // Переопределение метода для вывода информации
    @Override
    public void displayInfo() {
        super.displayInfo();  // Вызов метода displayInfo() родительского класса
        System.out.println("Регион: " + regionWeather);
    }

    // Статический метод для получения количества созданных приложений
    public static int getWeatherAppCount() {
        return weatherAppCount;
    }
}
