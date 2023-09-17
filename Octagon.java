public class Octagon extends Shape{
    private double radius;

    public Octagon(String name, double radius){
        super(name);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }
}
