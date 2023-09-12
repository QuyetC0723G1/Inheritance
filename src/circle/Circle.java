package circle;

public class Circle {
    private double radius;
    private String color;
    protected double dientich;
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getDientich(){
        dientich = radius*radius*3.14;
        return dientich;
    }
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", dientich=" + getDientich() +
                ", dientich=" +getChuvi()+
                '}';
    }

    public double getChuvi(){
        return radius*2 * 3.14;
    }
}
