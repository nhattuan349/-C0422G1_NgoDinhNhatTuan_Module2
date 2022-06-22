package ss12_Java_Collection_FrameWork_Map.BaiTap.Su_dung_ArrayList_LinkedList_trongCollectionFW.Model;

import ss12_Java_Collection_FrameWork_Map.BaiTap.Su_dung_ArrayList_LinkedList_trongCollectionFW.Model.SanPham;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main extends SanPham {
    public static List<SanPham> sanPhams = new LinkedList<>();
    public static Scanner scanner = new Scanner(System.in);

    static {
        sanPhams.add(new SanPham(1, "SamSung", 20, 10, "Hàn Quốc"));
        sanPhams.add(new SanPham(2, "Iphone", 30, 20, "Mỹ"));
        sanPhams.add(new SanPham(3, "Nokia", 12, 30, "Mỹ"));
        sanPhams.add(new SanPham(4, "Xiaomi", 14, 40, "Trung Quốc"));
        sanPhams.add(new SanPham(5, "Huawei", 30, 50, "Trung Quốc"));
    }

    public void add() {
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập giá");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số lượng sản phẩm");
        int amount = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập nhà sản xuất");
        String production = scanner.nextLine();

        SanPham sanPham = new SanPham(id, name, price, amount, production);
    }

    public void display() {
        for (SanPham sanPham : sanPhams) {
            System.out.println(sanPham);
        }
    }

    public void update() {
        System.out.println("Nhập id cần sửa");
        int id = Integer.parseInt(scanner.nextLine());
        boolean check = true;
        for (SanPham sanPham : sanPhams) {
            if (id == sanPham.getId()) {
                System.out.println("Nhập id");
                int id1 = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập tên");
                String name1 = scanner.nextLine();
                System.out.println("Nhập giá");
                int price1 = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập số lượng sản phẩm");
                int amount1 = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập nhà sản xuất");
                String production1 = scanner.nextLine();

                sanPham.setId(id1);
                sanPham.setName(name1);
                sanPham.setPrice(price1);
                sanPham.setAmount(amount1);
                sanPham.setProduction(production1);

                System.out.println("Sửa thành công");
                check = false;
            }
        }
        if (check) {
            System.out.println("id không tồn tại");
        }
    }

    public void delete() {
        System.out.println("Nhập vị trí muốn xóa");
        int id = Integer.parseInt(scanner.nextLine());
        boolean check = true;
        for (int i = 0; i < sanPhams.size(); i++) {
            if (id == sanPhams.get(i).getId()) {
                sanPhams.remove(sanPhams.get(i));
                System.out.println("xoa thanh cong");
                check = false;
            }
        }
        if (check) {
            System.out.println("Không tìm thấy id");
        }
    }

    public void search() {
        System.out.println("Nhập tên để tìm kiếm sản phẩm: ");
        String name = scanner.nextLine();
        name= name.toUpperCase();
        boolean check =true;
        for (SanPham sanPham:sanPhams) {
            if (sanPham.getName().contains(name)) {
                System.out.println(sanPham);
                check = false;
            }
        }
        if (check) {
            System.out.println("Không tìm thấy tên này");
        }
    }

    public void sortLow() {
        sanPhams.sort((o1, o2) -> (int) (o2.getPrice()- o1.getPrice()));
    }

    public void sortUp() {
        sanPhams.sort((o1, o2) -> (int) (o1.getPrice()- o2.getPrice()));
    }
}
