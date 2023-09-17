public class Quad extends Shape{
    private double radius;

    public Quad(String name, double radius){
        super(name);
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
}
