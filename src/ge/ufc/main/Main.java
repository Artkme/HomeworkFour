package ge.ufc.main;


import ge.ufc.rectangle.Rectangle;

public class Main {

    public static void main(String[] args) {
        Rectangle rectOne = new Rectangle(7);
        Rectangle rectTwo = new Rectangle(15, 12);
        Rectangle rectThree = new Rectangle();

        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = rectOne;
        rectangles[1] = rectTwo;
        rectangles[2] = rectThree;

        System.out.println(Rectangle.maxArea(rectangles));
    }
}
