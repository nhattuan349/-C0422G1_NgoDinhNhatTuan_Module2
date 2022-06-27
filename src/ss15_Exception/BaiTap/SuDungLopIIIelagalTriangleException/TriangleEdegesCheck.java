package ss15_Exception.BaiTap.SuDungLopIIIelagalTriangleException;

import java.util.Scanner;

public class TriangleEdegesCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check;
        do {
            try {
                System.out.println("Nhập cạnh a");
                double a = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập cạnh b");
                double b = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập cạnh c");
                double c = Double.parseDouble(scanner.nextLine());
                try {
                    if (a + b <= c || a + c <= b || b + c <= a) {
                        throw new TriangleEdegesException("Tam giác lỗi \n Mời nhập lại");
                    } else {
                        System.out.println("Tam giác ok");
                        break;
                    }
                } catch (TriangleEdegesException e) {
                    e.printStackTrace();
                    check = true;
                }
            } catch (Exception e) {
                e.printStackTrace();
                check = true;
            }
        } while (check);
    }
}
