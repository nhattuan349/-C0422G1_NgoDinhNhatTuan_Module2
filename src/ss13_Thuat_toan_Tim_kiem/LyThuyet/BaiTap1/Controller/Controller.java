package ss13_Thuat_toan_Tim_kiem.LyThuyet.BaiTap1.Controller;

import ss13_Thuat_toan_Tim_kiem.LyThuyet.BaiTap1.Service.Ipml.PersonIpml;

import java.util.Scanner;

public class Controller {
    static Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {
        PersonIpml personIpml = new PersonIpml();
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("------Menu-----\n" +
                    "1. Hiển thị \n" +
                    "2. Thêm mới \n" +
                    "3. Xóa \n" +
                    "4. Tìm Kiếm \n" +
                    "0. Thoát");
            System.out.println("Mời bạn chọn chức năng");
            int input = Integer.parseInt(scanner.nextLine());
            switch (input) {
                case 1:
                    System.out.println("Hiển thị");
                    personIpml.display();
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

    public static void add_sp() {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("--------Menu----\n" +
                    "1." +
                    "2" +
                    "3." +
                    "4." +
                    "Mời bạn chọn chức năng");
            int abc = Integer.parseInt(scanner.nextLine());
            switch (abc) {
                case 1:displayMainMenu();
                    break;
                case 2:
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("123");
            }

        } while (true);


    }
}
