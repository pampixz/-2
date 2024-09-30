public class Point3 extends Point2 {
    // Координата Z
    private double zCoord;

    // Конструктор с параметрами
    public Point3(double x, double y, double z) {
        super(x, y);  // Вызов конструктора родительского класса для установки X и Y
        zCoord = z;   // Инициализация Z
    }

    // Конструктор по умолчанию
    public Point3() {
        this(0, 0, 0);  // Вызов конструктора с параметрами, инициализация всех координат нулями
    }

    // Возвращение координаты Z
    public double getZ() {
        return zCoord;
    }

    // Установка значения координаты Z
    public void setZ(double val) {
        zCoord = val;
    }
}