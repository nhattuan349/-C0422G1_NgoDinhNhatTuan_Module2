package ss17IOBinaryFileAndSerialization.LyThuyet.controllers;



import ss17IOBinaryFileAndSerialization.LyThuyet.services.impl.CoThoiHanImpl;
import ss17IOBinaryFileAndSerialization.LyThuyet.services.impl.DaiHanImpl;
import ss17IOBinaryFileAndSerialization.LyThuyet.services.impl.VoThoiHanImp;

import java.util.Scanner;

public class MainController {

    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (true) {
            System.out.println("----Quan lY so tiet kiem----");
            System.out.println("1. Tài Khoản Tiết Kiệm ngan hạn");
            System.out.println("2.Tài Khoản Tiết kiệm dai hạn");
            System.out.println("3. thoát");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");
            }
            switch (choice) {
                case 1:
                    nganHan();
                    break;
                case 2:
                    daiHan();
                    break;
                case 3:
                    System.exit(3);
            }
        }
    }
    public static void daiHan () {
        DaiHanImpl daiHan = new DaiHanImpl();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (true) {
            System.out.println("----Tai Khoan dai han----");
            System.out.println("1. Thêm mới");
            System.out.println("2.  Xóa");
            System.out.println("3. hiển thị danh sách ");
            System.out.println("4. Exit menu");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");

            }
            switch (choice) {
                case 1:
                    daiHan.add();
                    break;
                case 2:
                    daiHan.delete();
                    break;
                case 3:
                    daiHan.display();
                    break;
                case 4:
                    return;
            }
        }
    }

    public static void nganHan () {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (true) {
            System.out.println("----Tai Khoan ngan han----");
            System.out.println("1. tai khoan vo thoi han");
            System.out.println("2. tai khoan ngan thoi han");
            System.out.println("3. thoát menu");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");
                ;
            }
            switch (choice) {
                case 1:
                    voThoiHan();
                    break;
                case 2:
                    coThoiHan();
                    break;
                case 3:
                    return;
            }
        }
    }

    private static void coThoiHan() {
        CoThoiHanImpl coThoiHan = new CoThoiHanImpl();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (true) {
            System.out.println("----Tai Khoan Co thoi han----");
            System.out.println("1. Thêm mới");
            System.out.println("2.  Xóa");
            System.out.println("3. hiển thị danh sách ");
            System.out.println("4. Exit menu");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");

            }
            switch (choice) {
                case 1:
                    coThoiHan.add();
                    break;
                case 2:
                    coThoiHan.delete();
                    break;
                case 3:
                    coThoiHan.display();
                    break;
                case 4:
                    return;
            }
        }
    }

    private static void voThoiHan() {
        VoThoiHanImp voThoiHanImp = new VoThoiHanImp();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (true) {
            System.out.println("----Tai Khoan Vo thoi han----");
            System.out.println("1. Thêm mới");
            System.out.println("2.  Xóa");
            System.out.println("3. hiển thị danh sách ");
            System.out.println("4. Exit menu");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");

            }
            switch (choice) {
                case 1:
                    voThoiHanImp.add();
                    break;
                case 2:
                    voThoiHanImp.delete();
                    break;
                case 3:
                    voThoiHanImp.display();
                    break;
                case 4:
                    return;
            }
        }
    }
}