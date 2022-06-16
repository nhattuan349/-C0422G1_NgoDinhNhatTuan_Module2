package ss7_Abstract_Class_Interface.BaiTap.Trien_khai_interface_Resizeable_cho_cac_lop_hinh_hoc.Main;

import ss7_Abstract_Class_Interface.BaiTap.Trien_khai_interface_Resizeable_cho_cac_lop_hinh_hoc.Model.Square;

public class TestSquare {
    public static void main(String[] args) {
        Square square =new Square();
        System.out.println(square);

        square = new Square("black",true,4);
        System.out.println(square);
        System.out.println("Dien tich square: "+square.getArea());
        System.out.println("Chu vi square: "+square.getPerimeter());
    }


}
