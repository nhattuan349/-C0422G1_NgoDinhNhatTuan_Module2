package ss7_Abstract_Class_Interface.BaiTap.Trien_khai_interface_Resizeable_cho_cac_lop_hinh_hoc.Ipml;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle("red", false, 5);
        System.out.println("Dien tích circle: "+circle.getArea());
        System.out.println("Chu vi circle: "+circle.getPerimeter());
        System.out.println(circle);
    }
}
