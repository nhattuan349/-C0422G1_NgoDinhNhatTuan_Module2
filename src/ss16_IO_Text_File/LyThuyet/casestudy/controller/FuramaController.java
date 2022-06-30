package ss16_IO_Text_File.LyThuyet.casestudy.controller;

import casestudy.service.CustomerService;
import casestudy.service.EmployeeService;
import casestudy.service.Impl.*;

import java.util.Scanner;

public class FuramaController {
    public static int choose = 0;
    public static Scanner scanner = new Scanner(System.in);

    public static int checkException(int inputChoose) {
        boolean check = false;
        do {
            try {
                inputChoose = Integer.parseInt(scanner.nextLine());
                check = false;
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại: ");
                check = true;
            }
        } while (check);
        return inputChoose;
    }

    public static void displayMainMenu() {
        do {
            System.out.println("----Menu----");
            System.out.println("1.Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management ");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6.Exit");
            System.out.println("Enter your choice: ");

            switch (checkException(choose)) {
                case 1:
                    displayEmployeeMenu();
                    break;
                case 2:
                    displayCustomersMenu();
                    break;
                case 3:
                    displayFacilityMenu();
                    break;
                case 4:
                    displayBookingMenu();
                    break;
                case 5:
                    displayMenu();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Không có chức này!!");
            }
        } while (true);
    }

    private static void displayCustomersMenu() {
        CustomerService customerService = new CustomerServiceImpl();
        do {
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Return main menu");

            switch (checkException(choose)) {
                case 1:
                    customerService.display();
                    break;
                case 2:
                    customerService.addNew();
                    break;
                case 3:
                    customerService.edit();
                    break;
                case 4:
                    displayMainMenu();
                default:
                    System.out.println("Không có chức này!!");
            }
        } while (true);

    }

    private static void displayEmployeeMenu() {
        EmployeeService employeeService = new EmployeeServiceImpl();
        do {
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Return main menu");

            switch (checkException(choose)) {
                case 1:
                    employeeService.display();
                    break;
                case 2:
                    employeeService.addNew();
                    break;
                case 3:
                    employeeService.edit();
                    break;
                case 4:
                    displayMainMenu();
                default:
                    System.out.println("Không có chức năng này!!");
            }
        } while (true);
    }

    private static void displayMenu() {
        do {
            System.out.println("1. Display list customers use service");
            System.out.println("2. Display list customers get voucher");
            System.out.println("3. Return main menu");
        } while (true);
    }

    private static void displayBookingMenu() {
        do {
            System.out.println("1. Add new booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new constracts");
            System.out.println("4. Display list contracts");
            System.out.println("5. Edit contracts");
            System.out.println("6. Return main menu");
            BookingServiceImpl bookingService = new BookingServiceImpl();
            ContactServiceImpl contactService = new ContactServiceImpl();

            switch (checkException(choose)) {
                case 1:
                    bookingService.add();
                    break;
                case 2:
                    bookingService.display();
                    break;
                case 3:
                    contactService.createNewContact();
                    break;
                case 4:
                    contactService.displayListContact();
                default:
                    System.out.println("Không có chức năng này!!");
            }
        } while (true);
    }

    private static void displayFacilityMenu() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        do {
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Return main menu");

            switch (checkException(choose)) {
                case 1:
                    facilityService.display();
                    break;
                case 2:
                    addNewFacilityMenu();
                    break;
                case 3:

                case 4:
                    displayMainMenu();
                default:
                    System.out.println("Không có chức năng này!!");
            }
        } while (true);
    }

    private static void addNewFacilityMenu() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        do {
            System.out.println("1. Add new Villa");
            System.out.println("2. Add new House");
            System.out.println("3. Add new Room");
            System.out.println("4. Back to menu");

            switch (checkException(choose)) {
                case 1:
                    facilityService.addNewVilla();
                    break;
                case 2:
                    facilityService.addNewHouse();
                    break;
                case 3:
                    facilityService.addNewRoom();
                    break;
                case 4:
                    displayMainMenu();
                default:
                    System.out.println("Không có chức năng này!!");
            }
        } while (true);
    }
}