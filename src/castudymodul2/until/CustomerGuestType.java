package castudymodul2.until;

import java.util.Scanner;

public class CustomerGuestType {
    public static String guestType() {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập kiểu khách...\n" +
                    "1.Diamond\n" +
                    "2.Platinium\n" +
                    "3.Gold\n" +
                    "4.Sliver\n" +
                    "5.Member\n" +
                    "Nhập để chọn: ");

            String num = scanner.nextLine();

            switch (num) {
                case "1":
                    return "diamond";
                case "2":
                    return "platinium";
                case "3":
                    return "gold";
                case "4":
                    return "sliver";
                case "5":
                    return "member";
                default:
                    System.err.println("CHƯƠNG TRINHG YÊU CẦU CHỌN TRONG KHOẢN TỪ 1---->5");
            }
        } while (true);
    }
}