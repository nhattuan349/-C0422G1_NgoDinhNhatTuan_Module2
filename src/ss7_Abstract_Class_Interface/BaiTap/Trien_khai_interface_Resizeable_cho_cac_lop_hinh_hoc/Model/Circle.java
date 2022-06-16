package ss7_Abstract_Class_Interface.BaiTap.Trien_khai_interface_Resizeable_cho_cac_lop_hinh_hoc.Model;

import ss7_Abstract_Class_Interface.BaiTap.Trien_khai_interface_Resizeable_cho_cac_lop_hinh_hoc.Iplm.ShapeIpml;

public class Circle extends ShapeIpml {
    private double radius = 1d;

    public Circle() {
    }


    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void resize(double percent) {
        this.radius = this.radius*percent/100;
    }

    @Override
    public String toString() {
        return " Circle: " +
                " radius= " + radius +
                super.toString();
    }
}
