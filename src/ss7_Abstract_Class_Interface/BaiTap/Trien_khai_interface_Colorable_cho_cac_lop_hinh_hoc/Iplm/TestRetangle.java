package ss7_Abstract_Class_Interface.BaiTap.Trien_khai_interface_Colorable_cho_cac_lop_hinh_hoc.Iplm;

public class TestRetangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle("red",true,5,5);
        System.out.println(rectangle);
        System.out.println("diện tích rectangle:  "+rectangle.getArea());
        System.out.println("chu vi rectangle:  "+rectangle.getPerimeter());
    }

}
