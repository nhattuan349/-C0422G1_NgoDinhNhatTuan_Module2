package ss7_Abstract_Class_Interface.BaiTap.Trien_khai_interface_Colorable_cho_cac_lop_hinh_hoc.Iplm;

public class Square extends Shape {// hình vuông
    private double side = 1d;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }


    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void howToColor(String color) {
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return " Square " +
                " side= " + side +
                super.toString();
    }
}
