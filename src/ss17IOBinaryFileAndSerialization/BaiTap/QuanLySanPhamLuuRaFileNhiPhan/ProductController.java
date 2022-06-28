package ss17IOBinaryFileAndSerialization.BaiTap.QuanLySanPhamLuuRaFileNhiPhan;

import java.util.Scanner;

public class ProductController {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        displayMenu();
    }

    public static void displayMenu() {
        ProductImpl product = new ProductImpl();
        boolean check = false;
        do {
            do {
                try {
                    System.out.println("----Quản lý sản phẩm----");
                    System.out.println("1.Hiển thị danh sách sản phẩm");
                    System.out.println("2.Thêm mới sản phẩm");
                    System.out.println("3.Tìm sản phẩm");
                    System.out.println("4.Kết thúc chương trình");
                    System.out.println("Nhập để chọn chức năng:");
                    int input = Integer.parseInt(scanner.nextLine());
                    switch (input) {
                        case 1:
                            System.out.println("--------------------Sản phẩm hiện có-------------------");
                            product.display();
                            break;
                        case 2:
                            System.out.println("---Nhập để thêm sản phẩm---");
                            product.add();
                            break;
                        case 3:
                            System.out.println("---Nhập để tìm sản phẩm---");
                            product.search();
                            break;
                        case 4:
                            System.out.println("----Kết thúc chương trình--Hẹn gặp lại-----");
                            System.exit(0);
                        default:
                            System.err.println("Bạn chỉ được chọn 1 trong 4 chương trình");
                    }
                } catch (Exception e) {
                    System.err.println("Sai định dạng..Bạn cần nhập số");
                    check = true;
                }
            } while (check);
        } while (true);
    }
}