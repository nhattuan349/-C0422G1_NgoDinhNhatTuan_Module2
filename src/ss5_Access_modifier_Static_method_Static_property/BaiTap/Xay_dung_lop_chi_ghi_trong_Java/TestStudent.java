package ss5_Access_modifier_Static_method_Static_property.BaiTap.Xay_dung_lop_chi_ghi_trong_Java;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 =new Student("Tuan","C04");
        System.out.println("Ten Hoc vien: "+student1.getName()+" Ten lop: "+student1.getClasses());
        student1.setName("Nhat Tuan");
        student1.setClasses("C0422G1");
        System.out.println("Ten Hoc vien: "+student1.getName()+" Ten lop: "+student1.getClasses());
    }
}
