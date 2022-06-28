package casestudy2.controller;

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
                System.out.println("Bạn đã nhạp sai định dạng, vui lòng nhập lại:");
                check = true;
            }
        } while (check);
        return inputChoose;
    }

    public static void displayMainMenu() {
        do {
            System.out.println("--------Menu---------" +
                    "1. Employee Management" +
                    "2. Customer Management" +
                    "3. Facility Management" +
                    "4. Booking Management" +
                    "5. Promotion Management" +
                    "6. Exit");
            System.out.println("Enter your choice: ");

            switch (checkException(choose)) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("không có chức năng này!!");
            }
        } while (true);
    }

    private static void displayCustomersMenu() {
    }
}
