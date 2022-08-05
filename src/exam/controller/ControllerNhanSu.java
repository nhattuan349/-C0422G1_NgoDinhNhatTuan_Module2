package exam.controller;


import exam.service.impl.HocVienImpl;
import exam.service.impl.NhanVienImpl;

import java.util.Scanner;

public class ControllerNhanSu {
    public static  void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (true) {
            System.out.println("--------CHƯƠNG TRÌNH QUẢN LÝ NHÂN SỰ---------\n" +
                    "Chọn chức năng theo số \n" +
                    "1. Thêm mới nhân sự \n" +
                    "2. Xóa nhân sự \n" +
                    "3. Xem danh sách nhân sự\n" +
                    "4. Sắp xếp nhân sự\n" +
                    "5. Thoát\n" +
                    "Chọn chức năng:");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai định dạng");
            }
            switch (choice) {
                case 1:
                    themMoiNhanSu();
                    break;
                case 2:
                    xoaNhanSu();
                    break;
                case 3:
                    xemDanhSachNhanSu();
                    break;
                case 4:
                    sapXepNhanSu();
                    break;
                case 5:
                    System.exit(3);
            }
        }
    }

    private static void sapXepNhanSu() {
        NhanVienImpl nhanVienImpl = new NhanVienImpl();
        HocVienImpl hocVienImpl = new HocVienImpl();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (true) {
            System.out.println("------- Sắp xếp nhân sự-------\n" +
                    "1.Sắp xếp Nhân viên \n" +
                    "2.Sắp xếp  Học viên \n" +
                    "3. Trở về menu");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai định dạng");
            }
            switch (choice) {
                case 1:
                    nhanVienImpl.sort();
                    break;
                case 2:
                    hocVienImpl.sort();
                    break;
                case 3:
                    return;
            }
        }
    }

    private static void xemDanhSachNhanSu() {
        NhanVienImpl nhanVienImpl = new NhanVienImpl();
        HocVienImpl hocVienImpl = new HocVienImpl();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (true) {
            System.out.println("------- Xem danh sách nhân sự-------\n" +
                    "1.Xem danh sách Nhân viên \n" +
                    "2.Xem danh sách Học viên \n" +
                    "3. Trở về menu");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai định dạng");
            }
            switch (choice) {
                case 1:
                    nhanVienImpl.display();
                    break;
                case 2:
                    hocVienImpl.display();
                    break;
                case 3:
                    return;
            }
        }
    }

    private static void xoaNhanSu() {
        NhanVienImpl nhanVienImpl = new NhanVienImpl();
        HocVienImpl hocVienImpl = new HocVienImpl();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (true) {
            System.out.println("------- Xóa nhân sự-------\n" +
                    "1.Xóa Nhân viên \n" +
                    "2.Xóa Học viên \n" +
                    "3. Trở về menu");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai định dạng");
            }
            switch (choice) {
                case 1:
                    nhanVienImpl.delete();
                    break;
                case 2:
                    hocVienImpl.delete();
                    break;
                case 3:
                    return;
            }
        }
    }

    private static void themMoiNhanSu() {
        NhanVienImpl nhanVienImpl = new NhanVienImpl();
        HocVienImpl hocVienImpl = new HocVienImpl();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (true) {
            System.out.println("------- Thêm mới nhân sự-------\n" +
                    "1.Thêm mới Nhân viên \n" +
                    "2.Thêm mới Học viên \n" +
                    "3. Trở về menu");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai định dạng");
            }
            switch (choice) {
                case 1:
                    nhanVienImpl.add();
                    break;
                case 2:
                    hocVienImpl.add();
                    break;
                case 3:
                    return;
            }
        }
    }


}
