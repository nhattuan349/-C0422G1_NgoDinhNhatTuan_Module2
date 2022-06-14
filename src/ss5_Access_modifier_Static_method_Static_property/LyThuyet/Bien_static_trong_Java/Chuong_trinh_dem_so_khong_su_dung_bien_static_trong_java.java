package ss5_Access_modifier_Static_method_Static_property.LyThuyet.Bien_static_trong_Java;

public class Chuong_trinh_dem_so_khong_su_dung_bien_static_trong_java {
    int count = 5; // sẽ lấy bộ nhớ khi instance được tạo ra

    Chuong_trinh_dem_so_khong_su_dung_bien_static_trong_java() {
        count++;
        System.out.println(count);
    }

    public static void main(String args[]) {

        Chuong_trinh_dem_so_khong_su_dung_bien_static_trong_java c1 = new Chuong_trinh_dem_so_khong_su_dung_bien_static_trong_java();
        Chuong_trinh_dem_so_khong_su_dung_bien_static_trong_java c2 = new Chuong_trinh_dem_so_khong_su_dung_bien_static_trong_java();
        Chuong_trinh_dem_so_khong_su_dung_bien_static_trong_java c3 = new Chuong_trinh_dem_so_khong_su_dung_bien_static_trong_java();

    }
}
