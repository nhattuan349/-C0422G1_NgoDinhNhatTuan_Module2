package ss12_Java_Collection_FrameWork_Map.LyThuyet.Main;

import java.util.*;

// Tra từ  diển Anh Việt:
//1. Thêm từ ( Từ khóa, ý nghĩa)
//2. Xóa từ
//3. Tìm ý nghĩa của từ khóa --> Tra từ
//4. In ra danh sách từ khóa
//5. In ra số lượng từ.
//6. XÓa tất cả các từ khóa/


public class TuDien {
    private Map<String, String> duLieu = new TreeMap<String, String>();

    //1. Thêm từ ( Từ khóa, ý nghĩa)
    public String themTu(String tuKhoa, String yNghia) {
        return this.duLieu.put(tuKhoa, yNghia);
    }

    //2. Xóa từ
    public String xoaTu(String tuKhoa) {
        return this.duLieu.remove(tuKhoa);
    }

    //3. Tìm ý nghĩa của từ khóa --> Tra từ
    public String traTu(String tuKhoa3) {
        String yNghia = this.duLieu.get(tuKhoa3);
        return yNghia;
    }

    //4. In ra danh sách từ khóa
    public void inTuKhoa() {
        Set<String> tapHopTuKhoa = this.duLieu.keySet();
        System.out.println(Arrays.toString(tapHopTuKhoa.toArray()));
    }

    //5. In ra số lượng từ.
    public int laySoLuong() {
        return this.duLieu.size();
    }

    //6. XÓa tất cả các từ khóa/
    public void xoaTatCa() {
        this.duLieu.clear();
    }

    public static void main(String[] args) {
        TuDien tuDien = new TuDien();

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Menu--------------\n" +
                    "1. Thêm từ ( Từ khóa, ý nghĩa)\n" +
                    "2. Xóa từ\n" +
                    "3. Tìm ý nghĩa của từ khóa\n" +
                    "4. In ra danh sách từ khóa\n" +
                    "5. In ra số lượng từ.\n" +
                    "6. XÓa tất cả các từ khóa" +
                    "0. Thoát" +
                    "Mời bạn chọn chức năng:");
            int input = Integer.parseInt(scanner.nextLine());
            switch (input) {
                case 1:
                    System.out.println("Nhâp vao tu khoa");
                    String tuKhoa = scanner.nextLine();
                    System.out.println("Nhâp vao Ý nghĩa từ khóa");
                    String yNghia = scanner.nextLine();
                    tuDien.themTu(tuKhoa, yNghia);
                    break;
                case 2:
                    System.out.println("Nhập từ cần xóa");
                    String tuKhoa2 = scanner.nextLine();
                    tuDien.xoaTu(tuKhoa2);
                    break;
                case 3:
                    System.out.println("Nhập từ khóa cần tìm ý nghĩa ");
                    String tuKhoa3 = scanner.nextLine();
                    System.out.println(tuDien.traTu(tuKhoa3));
                    break;
                case 4:
                    System.out.println("In ra danh sách từ khóa");
                    tuDien.inTuKhoa();
                    break;
                case 5:
                    System.out.println("In ra số lượng từ");
                    System.out.println(tuDien.laySoLuong());
                    break;
                case 6:
                    System.out.println("Xóa tất cả các từ khóa");
                    tuDien.xoaTatCa();
                    break;
                case 0:
                    System.out.println("Thoát chương trình");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhập sai mời bạn nhập lại");
            }
        } while (true);
    }
}
