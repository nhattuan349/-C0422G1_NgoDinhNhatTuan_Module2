package ss5_Access_modifier_Static_method_Static_property.LyThuyet.Phuong_thuc_static_trong_Java;

public class Cach_su_dung_phuong_thuc_static {
    int rollno;
    String name;
    static String college = "Bưu Chính Viễn Thông";

    static void change() {
        // Thay đổi thuộc tính static (thuộc tính chung của tất cả các đối tượng)
        college = "Đại Học Công Nghệ";
    }

    Cach_su_dung_phuong_thuc_static(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(rollno + " - " + name + " - " + college);
    }

    public static void main(String args[]) {
        Cach_su_dung_phuong_thuc_static.change();

        Cach_su_dung_phuong_thuc_static s1 = new Cach_su_dung_phuong_thuc_static(111, "Thông");
        Cach_su_dung_phuong_thuc_static s2 = new Cach_su_dung_phuong_thuc_static(222, "Minh");
        Cach_su_dung_phuong_thuc_static s3 = new Cach_su_dung_phuong_thuc_static(333, "Anh");

        s1.display();
        s2.display();
        s3.display();
    }
}
