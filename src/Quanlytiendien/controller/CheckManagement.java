package Quanlytiendien.controller;


import Quanlytiendien.service.CheckService;
import Quanlytiendien.service.CustomerService;
import Quanlytiendien.service.impl.CheckServiceImpl;
import Quanlytiendien.service.impl.CustomerServiceImpl;

import java.util.Scanner;

public class CheckManagement {
    public static Scanner scanner = new Scanner(System.in);
    static CustomerService customerService = new CustomerServiceImpl();
    static CheckService checkService = new CheckServiceImpl();

    public static void displayMenu() {
        do {
            System.out.println("-- CHƯƠNG TRÌNH QUẢN LÝ HÓA ĐƠN TIỀN ĐIỆN--");
            System.out.println("Chọn chức năng: ");
            System.out.println("1. Thêm mới khách hàng");
            System.out.println("2. Hiển thị thông tin khách hàng");
            System.out.println("3. Tìm kiếm khách hàng");
            System.out.println("4. Thêm mới hóa đơn");
            System.out.println("5. Chỉnh sửa hóa đơn");
            System.out.println("6. Hiển thị thông tin chi tiết hóa đơn");
            System.out.println("7. Thoát");
            System.out.println("Chọn chức năng: ");

            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    customerService.add();
                    break;
                case "2":
                    customerService.display();
                    break;
                case "3":
                    customerService.find();
                    break;
                case "4":
                    checkService.add();
                    break;
                case "5":
                    checkService.edit();
                    break;
                case "6":
                    checkService.display();
                    break;
                case "7":
                    System.exit(7);
                default:
                    System.out.println("Chọn chức năng sai, mời chọn lại.");
                    displayMenu();
            }
        } while (true);
    }
}
