public class Social extends App {
    // Поля
    private String typeSN;
    private int userCountSN;
    private static int socialNetworkAppCount = 0;  // Статическая переменная для счетчика объектов

    // Конструктор с параметрами
    public Social(String title, String author, String os, String type, int userCount) {
        super(title, author, os);  // Вызов конструктора родительского класса App
        this.typeSN = type;
        this.userCountSN = userCount;
        socialNetworkAppCount++;  // Увеличение счетчика при создании объекта
    }

    // Конструктор по умолчанию
    public Social() {
        this("", "", "", "Unknown", 0);  // Инициализация с значениями по умолчанию
    }

    // Геттеры и сеттеры
    public String getType() {
        return typeSN;
    }

    public void setType(String typeSN) {
        this.typeSN = typeSN;
    }

    public int getUserCount() {
        return userCountSN;
    }

    public void setUserCount(int userCountSN) {
        this.userCountSN = userCountSN;
    }

    // Реализация абстрактного метода run()
    @Override
    public void run() {
        System.out.println("Тип социальной сети " + typeSN + " общее количество " + userCountSN + " пользователей.");
    }

    // Переопределение метода для вывода информации
    @Override
    public void displayInfo() {
        super.displayInfo();  // Вызов метода родительского класса
        System.out.println("Тип соц.сети: " + typeSN);
        System.out.println("Количество пользователей: " + userCountSN);
    }

    // Статический метод для получения количества созданных приложений
    public static int getSocialNetworkAppCount() {
        return socialNetworkAppCount;
    }
}
