package castudymodul2.until;

import java.util.Scanner;

public class FacilityRentalType {
    static Scanner scanner = new Scanner(System.in);

    public static String rentalType() {
        do {
            System.out.println("Nhập kiểu thuê:\n" +
                    "1.Thuê theo năm: \n" +
                    "2.Thuê theo tháng: \n" +
                    "3.Thuê theo ngày: \n" +
                    "4.Theo theo giờ: \n" +
                    "Nhập để chọn: ");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    return "Thuê theo năm";
                case "2":
                    return "Thuê theo tháng ";
                case "3":
                    return "Thuê theo ngày";
                case "4":
                    return "Thuê theo giờ";
                default:
                    System.err.println("CHƯƠNG TRÌNH YÊU CẦU CHỌN TRONG KHOẢN TỪ 1--->4");
            }
        } while (true);
    }
}