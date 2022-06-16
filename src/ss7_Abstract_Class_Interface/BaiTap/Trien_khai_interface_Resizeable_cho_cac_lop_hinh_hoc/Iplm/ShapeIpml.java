package ss7_Abstract_Class_Interface.BaiTap.Trien_khai_interface_Resizeable_cho_cac_lop_hinh_hoc.Iplm;

import ss7_Abstract_Class_Interface.BaiTap.Trien_khai_interface_Resizeable_cho_cac_lop_hinh_hoc.IResizeable;

public abstract class ShapeIpml implements IResizeable {
    private String color = "green";
    private boolean filled = true;

    public ShapeIpml() {
    }

    public ShapeIpml(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();


    @Override
    public void resize(double percent) {
    }

    @Override
    public String toString() {
        return
                " color= " + color +
                " filled= " + filled;
    }
}
