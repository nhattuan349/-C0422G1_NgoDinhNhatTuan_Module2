package castudymodul2.until;

import java.util.Scanner;

public class EmployeeLevelAndLocation {
    static Scanner scanner = new Scanner(System.in);

    public String level() {
        do {
            System.out.println("Nhập trình độ:\n" +
                    "1.Trung cấp\n" +
                    "2.Cao đẳng\n" +
                    "3.Đại học\n" +
                    "4.Sau đại học\n" +
                    "Nhập để chọn: ");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    return "Trung cấp";
                case "2":
                    return "Cao đẳng";
                case "3":
                    return "Đại học";
                case "4":
                    return "Sau đại học";
                default:
                    System.err.println("CHƯƠNG TRÌNH YÊU CẦU CHỌN TRONG KHOẢN TỪ 1--->4");
            }
        } while (true);
    }

    public String location() {
        do {
            System.out.println("Nhập chức vụ: \n" +
                    "1.Lễ tân\n" +
                    "2.Phục vụ\n" +
                    "3.Chuyên viên\n" +
                    "4.Giám sát\n" +
                    "5.Quản lý\n" +
                    "6.Giám đốc\n" +
                    "Nhập để chọn: ");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    return "Lễ tân";
                case "2":
                    return "Phục vụ";
                case "3":
                    return "Chuyên viên";
                case "4":
                    return "Giám sát";
                case "5":
                    return "Quản lý";
                case "6":
                    return "Giám đốc";
                default:
                    System.err.println("CHƯƠNG TRÌNH YÊU CẦU CHỌN TRONG KHOẢN TỪ 1--->6");
            }
        } while (true);
    }
}

