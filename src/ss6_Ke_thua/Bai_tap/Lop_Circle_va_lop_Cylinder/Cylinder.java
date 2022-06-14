package ss6_Ke_thua.Bai_tap.Lop_Circle_va_lop_Cylinder;

public class Cylinder extends Circle{
    private double height=2d;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return 2*Math.PI*getRadius()*height;
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                " radius= " + getRadius() +
                " color= " + getColor() +
                " height= " + height +
                '}';
    }
}
