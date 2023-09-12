package circle;

public class Cylinder extends Circle {
    double theTich;
    double height;
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double getTheTich(){
        theTich = Math.pow(this.getRadius(),2)*3.14 *height;
        return  theTich;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "theTich=" + getTheTich() +
                ", height=" + height +
                ", duongKinh=" +getDuongkinh()+
                '}';
    }

    public double getDuongkinh(){
        return getRadius()*2;
    }
}
