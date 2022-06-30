package ss16_IO_Text_File.LyThuyet.castudymodul2.controllers;

import castudymodul2.services.CustomerServiceIpl;
import castudymodul2.services.EmployeeServiceIpl;
import castudymodul2.services.FacilityServiceIpl;

import java.util.Scanner;

public class Controller {
    static Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {
        System.out.println("Menu\n" +
                "1. Employee Management\n" +
                "2. Customer Management\n" +
                "3. Facility Management\n" +
                "4. Exit");
        do {
            System.out.println("Nhấn để chọn chức năng");
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.err.println("---Employee Management---");
                    caseEmployee();
                    break;
                case "2":
                    System.err.println("---Customer Management---");
                    caseCustomer();
                    break;
                case "3":
                    System.err.println(" ---Facility Management---");
                    caseFacility();
                    break;
                case "4":
                    System.err.println("Kết thúc chương trình   ---Good Bye---");
                    System.exit(0);
                default:
                    System.err.println("CHỨC NĂNG NÀY KHÔNG CÓ \n" + "MỜI BẠN CHỌN LẠI TRONG KHOẢNG 1-->4\n" + "NHẬP LẠI");
            }
        } while (true);

    }

    /**
     * Method Case3
     */
    public static void caseFacility() {
        FacilityServiceIpl facilityServiceIpl = new FacilityServiceIpl();
        do {
            backMenu();
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    System.err.println("-------Display list facility--------");
                    facilityServiceIpl.display();
                    break;
                case "2":
                    System.err.println("-----Add new facility-----");
                    facilityServiceIpl.add();
                    break;
                case "3":
                    System.err.println("------Display list facility maintenance--------");
                    facilityServiceIpl.displayMaintain();
                    break;
                case "4":
                    displayMainMenu();
                    return;
                default:
                    System.err.println("MỜI BẠN CHỌN LẠI\n" + "CHƯƠNG TRÌNH MỜI BẠN CHỌN TỪ 1--->4\n" + "NHẬP LẠI");
            }
        } while (true);
    }

    /**
     * Method Case2
     */
    public static void caseCustomer() {
        CustomerServiceIpl customerServiceIpl = new CustomerServiceIpl();
        do {
            System.out.println("1.Display list customers\n" +
                    "2.Add new customer\n" +
                    "3.Edit customer\n" +
                    "4.Return main menu\n");
            System.out.println("Nhập để chọn tính năng: ");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    System.err.println("----Display list customers-----");
                    customerServiceIpl.display();
                    break;
                case "2":
                    System.err.println("-----Add new customer-----");
                    customerServiceIpl.add();
                    break;
                case "3":
                    System.err.println("------Edit customer----");
                    customerServiceIpl.update();
                    break;
                case "4":
                    displayMainMenu();
                    return;
                default:
                    System.err.println("MỜI BẠN CHỌN LẠI\n" + "\"CHƯƠNG TRÌNH MỜI BẠN CHỌN TỪ 1--->4\n" + "NHẬP LẠI");
            }
        } while (true);
    }

    /**
     * Method Case1
     */
    public static void caseEmployee() {
        EmployeeServiceIpl employeeServiceIpl = new EmployeeServiceIpl();
        do {
            System.out.println("1.Display list employees\n" +
                    "2.Add new employee\n" +
                    "3.Edit employee\n" +
                    "4.Return main menu\n" +
                    " Nhập để chọn tính năng: ");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    System.err.println("----Display list employees-----");
                    employeeServiceIpl.display();
                    caseEmployee();
                    break;
                case "2":
                    System.err.println("----Add new employee----");
                    employeeServiceIpl.add();
                    caseEmployee();
                    break;
                case "3":
                    System.err.println("----Edit employee----");
                    employeeServiceIpl.update();
                    caseEmployee();
                    break;
                case "4":
                    displayMainMenu();
                    return;
                default:
                    System.err.println("CHỨC NĂNG KHÔNG CÓ\n" + "CHƯƠNG TRÌNH MỜI BẠN CHỌN TỪ 1--->4\n" + "NHẬP LẠI");
            }
        } while (true);
    }

    /**
     * Method of Facility
     */
    public static void backMenu() {

        System.out.println("1.Display list facility\n" +
                "2.Add new facility\n" +
                "3.Display list facility maintenance\n" +
                "4.Return main menu");
    }
}
