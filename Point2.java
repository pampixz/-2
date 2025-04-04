public class Point2 {
    /** координата X **/
    private double xCoord;
    /** координата Y **/
    private double yCoord;
    /** Конструктор инициализации **/
    public Point2 (double x, double y) {
        xCoord = x;
        yCoord = y;
    }
    /** Конструктор по умолчанию. **/
    public Point2 () {
        this(0, 0);
    }
    /** Возвращение координаты X **/
    public double getX () {
        return xCoord;
    }
    /** Возвращение координаты Y **/
    public double getY () {
        return yCoord;
    }
    /** Установка значения координаты X. **/
    public void setX ( double val) {
        xCoord = val;
    }
    /** Установка значения координаты Y. **/
    public void setY ( double val) {
        yCoord = val;
    }
}
