public class Rectangle extends Shape{
    private double radius;

    public Rectangle(String name, double radius){
        super(name);
        this.radius = radius;
        }
    public double getRadius(){
        return radius;
    }
}
