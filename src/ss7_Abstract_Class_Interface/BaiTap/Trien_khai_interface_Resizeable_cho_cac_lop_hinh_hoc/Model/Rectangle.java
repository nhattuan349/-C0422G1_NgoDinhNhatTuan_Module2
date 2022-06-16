package ss7_Abstract_Class_Interface.BaiTap.Trien_khai_interface_Resizeable_cho_cac_lop_hinh_hoc.Model;

import ss7_Abstract_Class_Interface.BaiTap.Trien_khai_interface_Resizeable_cho_cac_lop_hinh_hoc.Iplm.ShapeIpml;

public class Rectangle extends ShapeIpml {
    private double width=1d;
    private double height=1d;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    @Override
    public void resize(double percent) {
        this.width*=percent/100;
        this.height*=percent/100;
    }

    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public double getPerimeter() {
        return (width+height)*2;
    }

    @Override
    public String toString() {
        return " Rectangle: " +
                " width= " + width +
                " height= " + height +
                super.toString();
    }
}
