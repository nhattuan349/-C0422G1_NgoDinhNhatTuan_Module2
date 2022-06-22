package ss13_Thuat_toan_Tim_kiem.LyThuyet.BaiTap1.Controller;

import ss13_Thuat_toan_Tim_kiem.LyThuyet.BaiTap1.Service.Ipml.PersonIpml;

import java.util.Scanner;

public class controller {
    Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {
        PersonIpml personIpml = new PersonIpml();
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("------Menu-----\n" +
                    "1. Hiển thị" +
                    "2. Thêm mới" +
                    "3. Xóa" +
                    "4. Tìm Kiếm" +
                    "0. Thoát");
            System.out.println("Mời bạn chọn chức năng");
            int input = Integer.parseInt(scanner.nextLine());
            switch (input) {
                case 1:
                    System.out.println("Hiển thị");
                    personIpml.add();
                    break;
                case 2:
                    System.out.println("Thêm mới");
                    personIpml.add();
                    break;
                case 3:
                    System.out.println("Xóa");
                    personIpml.remove();
                    break;
                case 4:
                    System.out.println("Tìm Kiếm");
                    personIpml.search();
                    break;
                case 0:
                    System.out.println("Thoát chương trình ");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Bạn nhập sai, mời bạn nhập lại ");
            }
        } while (true);
    }
}
