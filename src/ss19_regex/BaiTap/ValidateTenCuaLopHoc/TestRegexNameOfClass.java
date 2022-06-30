package ss19_regex.BaiTap.ValidateTenCuaLopHoc;

import java.util.Scanner;
import java.util.regex.Pattern;

public class TestRegexNameOfClass {
    public static void main(String[] args) {
        String testClassName = "^(C|P|A)[0-9]{4}(G|H|I|K|L|M)[0-9]{1}$";
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập Tên của lớp học --- Ví dụ: C0422G1");
            String className = scanner.nextLine();

            boolean check = Pattern.matches(testClassName, className);
            if (check) {
                System.out.println("className :" + className + "" + " --> Khớp");
            } else System.out.println("className :" + className + "" + " --không khớp, mời nhập lại");
        }while (true);
    }
}
