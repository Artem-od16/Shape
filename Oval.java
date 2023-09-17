public class Oval extends Shape{
    private double width;

    public Oval(String name, double width){
        super(name);
        this.width = width;
    }
    public double getRadius(){
        return width;
    }
}
