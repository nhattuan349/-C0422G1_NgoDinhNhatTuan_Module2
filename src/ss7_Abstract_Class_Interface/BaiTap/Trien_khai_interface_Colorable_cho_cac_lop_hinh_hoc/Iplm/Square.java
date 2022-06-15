package ss7_Abstract_Class_Interface.BaiTap.Trien_khai_interface_Colorable_cho_cac_lop_hinh_hoc.Iplm;

public class Square extends Shape {
    public double side;

    public Square() {

    }

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    public Square(String color, boolean filled, int side) {
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
    public void resize(double percent) {
        this.side = side * percent;
    }

    @Override
    public String toString() {
        return "Hình vuông có cạnh ="
                + getSide()
                + " là 1 lớp con của  "
                + super.toString();
    }

}
