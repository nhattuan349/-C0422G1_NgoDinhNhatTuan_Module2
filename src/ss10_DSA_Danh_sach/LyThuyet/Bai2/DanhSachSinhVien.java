package ss10_DSA_Danh_sach.LyThuyet.Bai2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
    private ArrayList<SinhVien> danhSach;

    public DanhSachSinhVien() {
        this.danhSach = new ArrayList<SinhVien>();
    }

    public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }

    // Phương thức Thêm
    public void themSinhVien(SinhVien sv) {
        this.danhSach.add(sv);
    }

    //Hiển thị, in ra màn hình
    public void inDanhSachSinhVien() {
        for (SinhVien sinhVien : danhSach) {
            System.out.println(sinhVien);
        }
    }

    //Kiểm tra danh sách có rỗng hay không.
    public boolean kiemTraDanhSachRong() {
        return this.danhSach.isEmpty();
    }

    //Lấy ra số lượng sinh viên trong danh sách.
    public int laySoLuongSinhVien() {
        return this.danhSach.size();
    }

    //Làm rỗng danh sách sinh viên.
    public void lamRongDanhSach() {
        this.danhSach.removeAll(danhSach);
    }

    //Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trêb mã sinh viên
    public boolean kiemTraTonTai(SinhVien sv) {
        return this.danhSach.contains(sv);
    }

    //Xóa một sinh virn ra khỏi danh sách dựa trên mã sinh viên
    public boolean xoaSinhVien(SinhVien sv) {
        return this.danhSach.remove(sv);
    }

    // Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.
    public void timSinhVien(String ten) {
        for (SinhVien sinhVien:danhSach) {
            if (sinhVien.getHoVaten().indexOf(ten)>=0){
                System.out.println(sinhVien);
            }
        }
    }

    //Xuất ra danh sách sinh viên có điểm từ cao đến thấp.
    public void sapXepSinhVienGiamDanTheoDiem() {
        Collections.sort(this.danhSach, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                if (sv1.getDiemTrungBinh()<sv2.getDiemTrungBinh()){
                    return 1;
                }else if (sv1.getDiemTrungBinh()>sv2.getDiemTrungBinh()){
                    return -1;
                }else {
                    return 0;
                }
            }
        });
    }
}
