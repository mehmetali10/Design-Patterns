package models;

public class Circle extends Shape{

    public Circle(Color color) {
        super(color);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void colorIt() {
       System.out.print("Circle filled with ");
       color.fillColor(); 
    }
    
}
