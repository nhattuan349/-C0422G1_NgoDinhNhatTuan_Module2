package ss10_DSA_Danh_sach.LyThuyet.Bai2.Test;

import ss10_DSA_Danh_sach.LyThuyet.Bai2.DanhSachSinhVien;
import ss10_DSA_Danh_sach.LyThuyet.Bai2.SinhVien;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        DanhSachSinhVien dssv = new DanhSachSinhVien();

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("-----Menu----\n" +
                    "1. Thêm sinh viên vào danh sách.\n" +
                    "2. In danh sách sinh viên ra màn hình. \n" +
                    "3. Kiểm tra danh sách có rỗng hay không. \n" +
                    "4. Lấy ra số lượng sinh viên trong danh sách. \n" +
                    "5. Làm rỗng danh sách sinh viên. \n" +
                    "6. Kiểm tra sinh viên có tồn tại trong danh sách hay không , dưa x trên mã sinh viên. \n" +
                    "7. Xóa một sinh virn ra khỏi danh sách dựa trên mã sinh viên \n" +
                    "8. Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím. \n" +
                    "9.Xuất ra danh sách sinh viên có điểm từ cao đến thấp. \n" +
                    "0.Thoát khỏi chương trình. \n+" +
                    "Vui lòng chọn chức năng: ");
            int luaChon = Integer.parseInt(sc.nextLine());
            switch (luaChon) {
                case 1:
                    System.out.println("Nhập mã sinh viên: ");
                    String maSinhVien = sc.nextLine();
                    System.out.println("Nhập họ và tên: ");
                    String hoVaTen = sc.nextLine();
                    System.out.println("Nhập năm sinh: ");
                    int namSinh = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập điểm trung bình: ");
                    float diemTrungBinh = Float.parseFloat(sc.nextLine());
                    System.out.println("đã thêm thành công");

                    SinhVien sv = new SinhVien(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
                    dssv.themSinhVien(sv);

                    break;
                case 2:
                    System.out.println("Hiển thị danh sách");
                    dssv.inDanhSachSinhVien();
                    break;
                case 3:
                    System.out.println("Kiểm tra danh sách có rỗng hay không.");
                    System.out.println(dssv.kiemTraDanhSachRong());
                    break;
                case 4:
                    System.out.println("Lấy ra số lượng sinh viên trong danh sách.");
                    System.out.println(dssv.laySoLuongSinhVien());
                    break;
                case 5:
                    System.out.println("Làm rỗng danh sách sinh viên.");
                    dssv.lamRongDanhSach();
                    System.out.println("làm rỗng thành công");
                    break;
                case 6:
                    System.out.println("Kiểm tra sinh viên có tồn tại trong danh sách hay không, dưa trên mã sinh viên");
                    System.out.println("Nhập mã sinh viên: ");
                    String maSinhVien1= sc.nextLine();

                    SinhVien sv1 =new SinhVien();
                    System.out.println(dssv.kiemTraTonTai(sv1));
                    break;
                case 7:
                    System.out.println("Xóa 1 sinh viên ra khỏi danh sách");
                    System.out.println("Nhập mã sinh viên: ");
                    String maSinhVien2= sc.nextLine();

                    SinhVien sv2 =new SinhVien();
                    System.out.println(dssv.xoaSinhVien(sv2));
                    break;
                case 8:
                    System.out.println(" Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.");
                    System.out.println("Nhập họ và tên: ");
                    String hoVaTen8 = sc.nextLine();

                    System.out.println("Kết quả tìm kiếm: ");
                    dssv.timSinhVien(hoVaTen8);
                    break;
                case 9:
                    System.out.println("Xuất ra danh sách sinh viên có điểm từ cao đến thấp.");
                    dssv.sapXepSinhVienGiamDanTheoDiem();
                    dssv.inDanhSachSinhVien();
                    break;
                case 0:
                    System.out.println("kết thúch chương trình");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Bạn nhập sai moi ban nhap lai");

            }
        } while (true);
    }
}
