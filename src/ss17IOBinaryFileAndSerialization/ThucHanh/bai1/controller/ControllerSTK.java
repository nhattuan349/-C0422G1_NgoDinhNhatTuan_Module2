package ss17IOBinaryFileAndSerialization.ThucHanh.bai1.controller;

import ss17IOBinaryFileAndSerialization.ThucHanh.bai1.Service.Impl.CoThoiHanImpl;
import ss17IOBinaryFileAndSerialization.ThucHanh.bai1.Service.Impl.DaiHanImpl;
import ss17IOBinaryFileAndSerialization.ThucHanh.bai1.Service.Impl.VoThoiHanImpl;

import java.util.Scanner;

public class ControllerSTK {
    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (true) {
            System.out.println("--------Quản lý sổ tiết kiệm---------\n" +
                    "1. Tài khoản tiết kiệm Ngắn hạn \n" +
                    "2. tài khoản tiết kiệm dài hạn \n" +
                    "3. Thoát");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai định dạng");
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

    private static void daiHan() {
        DaiHanImpl daiHanImpl = new DaiHanImpl();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (true) {
            System.out.println("-------Tai Khoản dài hạn---------\n" +
                    "1. Thêm mới \n" +
                    "2. Xóa \n" +
                    "3. Hiển thị \n" +
                    "4. Trở về \n" +
                    "");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai định dạng");
            }
            switch (choice) {
                case 1:
                    daiHanImpl.add();
                    break;
                case 2:
                    daiHanImpl.delete();
                    break;
                case 3:
                    daiHanImpl.display();
                    break;
                case 4:
                    return;
            }
        }
    }

    private static void nganHan() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (true) {
            System.out.println("------- Tai khaonr ngắn hạn-------\n" +
                    "1. Tài khoản vô thời hạn \n" +
                    "2. Tài khoản có thời hạn \n" +
                    "3. Trở về menu");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai định dạng");
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

    private static void voThoiHan() {
        VoThoiHanImpl voThoiHanImpl = new VoThoiHanImpl();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (true) {
            System.out.println("-------Tai Khoản vô thời hạn---------\n" +
                    "1. Thêm mới \n" +
                    "2. Xóa \n" +
                    "3. Hiển thị \n" +
                    "4. Sửa \n" +
                    "5. Sắp xếp \n" +
                    "6. Tìm kiếm \n" +
                    "7. Trở về");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai định dạng");
            }
            switch (choice) {
                case 1:
                    voThoiHanImpl.add();
                    break;
                case 2:
                    voThoiHanImpl.delete();
                    break;
                case 3:
                    voThoiHanImpl.display();
                    break;
                case 4:
                    voThoiHanImpl.update();
                    break;
                case 5:
                    voThoiHanImpl.sort();
                    break;
                case 6:
                    voThoiHanImpl.search();
                    break;
                case 7:
                    return;
            }
        }
    }

    private static void coThoiHan() {
        CoThoiHanImpl coThoiHanImpl = new CoThoiHanImpl();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (true) {
            System.out.println("-------Tai Khoản có thời hạn---------\n" +
                    "1. Thêm mới \n" +
                    "2. Xóa \n" +
                    "3. Hiển thị \n" +
                    "4. Trở về");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai định dạng");
            }
            switch (choice) {
                case 1:
                    coThoiHanImpl.add();
                    break;
                case 2:
                    coThoiHanImpl.delete();
                    break;
                case 3:
                    coThoiHanImpl.display();
                    break;
                case 4:
                    return;
            }
        }
    }
}
