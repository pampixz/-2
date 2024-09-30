public abstract class App {
    // Поля
    protected String title;
    protected String author;
    protected String os;

    // Конструктор с параметрами
    public App(String title, String author, String os) {
        this.title = title;
        this.author = author;
        this.os = os;
    }

    // Конструктор по умолчанию
    public App() {
        this("", "", "");
    }

    // Абстрактный метод (должен быть реализован в дочерних классах)
    public abstract void run();

    // Геттеры и сеттеры
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    // Метод для вывода информации
    public void displayInfo() {
        System.out.println("Название приложения: " + title);
        System.out.println("Автор: " + author);
        System.out.println("OS: " + os);
    }
}
