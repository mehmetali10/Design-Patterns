package models;

public class Rectangle extends Shape {

    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public void colorIt() {
       System.out.print("Rectangle filled with ");
       color.fillColor();
    }
    
}
