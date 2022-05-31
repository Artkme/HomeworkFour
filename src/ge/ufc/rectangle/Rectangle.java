package ge.ufc.rectangle;

public class Rectangle {
    private double length;
    private double width;
    private static double maxLength;
    private static double maxWidth;

    static {
        maxLength = 10;
        maxWidth = 15;
    }

    public Rectangle(double length) {
        setLength(length);
    }

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public Rectangle() {
        setWidth(17);
    }

    public static Rectangle maxArea(Rectangle[] rectangles) {
        Rectangle MaxAreaRect = new Rectangle();
        int maxArea = 0;

        for (int i = 0; i < rectangles.length; i++) {
            if (rectangles[i].area() > maxArea) {
                MaxAreaRect = rectangles[i];
            }
        }

        return MaxAreaRect;
    }

    double perimeter() {
        return 2 * (length + width);
    }

    double area() {
        return length * width;
    }

    public void setLength(double length) {
        if (length <= maxLength) {
            this.length = length;
        } else {
            this.length = maxLength;
        }
    }

    public void setWidth(double width) {
        if (width <= maxWidth) {
            this.width = width;
        } else {
            this.width = maxWidth;
        }
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public int moreThan(Rectangle other) {
        return (int) Math.signum(this.area() - other.area());
    }
}
