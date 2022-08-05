package ss17IOBinaryFileAndSerialization.LyThuyet.utils;




import ss17IOBinaryFileAndSerialization.LyThuyet.model.CoThoiHan;
import ss17IOBinaryFileAndSerialization.LyThuyet.model.DaiHan;
import ss17IOBinaryFileAndSerialization.LyThuyet.model.VoThoiHan;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.List;
import java.util.Scanner;

public class RegexDaiHan {
    public static Scanner scanner = new Scanner(System.in);

    public static String idRegex = "STK\\-[0-9]{4}";
    public static String FIRST_CHARACTER_UPPER = "^[A-Z][\\w]+$";

    public static void dateTimeCheck(String dateOfBirth) throws Exception {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);
        LocalDate localDate1 = LocalDate.parse(dateOfBirth, formatter);
        LocalDate localDate2 = LocalDate.now();
        localDate2.format(formatter);

        int year = Period.between(localDate1, localDate2).getYears();
        if (year <= 18 && year>=100) {
            throw new DateTimeException("Error");
        }
    }

    public static String dateOfBirth() {
        String dateOfBirth;
        while (true) {
            try {
                dateOfBirth = scanner.nextLine();
                dateTimeCheck(dateOfBirth);
                break;
            } catch (DateTimeException e) {
                System.err.println("Nhập sai ");
            } catch (Exception ignored) {
                System.err.println("Nhập sai định dạng");
            }
        }
        return dateOfBirth;
    }

    public static String idRegex(List<DaiHan> daiHanList) {
        String id;
        boolean check = true;
        while (check) {
            check = false;
            while (true) {

                id = scanner.nextLine();
                if (id.matches(idRegex)) {
                    break;
                } else {
                    System.err.println("Nhập lại vD :  STK-XXXX");
                }
            }

            for (DaiHan emp : daiHanList) {
                if (emp.getIdSo().equals(id)) {
                    check = true;
                    break;
                }
            }
            if (check) {
                System.out.println("ID đã có trong list");
            } else {
                return id;
            }
        }
        return "";
    }

    public static String kiHan() {
        String kiHan = "";
        boolean checkGender = true;
        while (checkGender) {
            int choice = 0;
            System.out.println("--------Ki Han--------");
            System.out.println("1. 1 nam");
            System.out.println("2. 3 nam");
            System.out.println("3. 5 nam");
            System.out.println("4. 10 nam");
            System.out.println("Chọn 1>4");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai định dạng");
            }
            switch (choice) {
                case 1:
                    kiHan = "1 nam";
                    checkGender = false;
                    break;
                case 2:
                    kiHan = "3 nam";
                    checkGender = false;
                    break;
                case 3:
                    kiHan = "5 nam";
                    checkGender = false;
                    break;
                case 4:
                    kiHan = "10 nam";
                    checkGender = false;
                    break;
            }
        }
        return kiHan;
    }

    public static String kiHanNganHan() {
        String kiHanNganHan = "";
        boolean checkGender = true;
        while (checkGender) {
            int choice = 0;
            System.out.println("--------Ki Han--------");
            System.out.println("1. 3thang");
            System.out.println("2. 6thang");
            System.out.println("Chọn 1>2");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai định dạng");
            }
            switch (choice) {
                case 1:
                    kiHanNganHan = "3 thang";
                    checkGender = false;
                    break;
                case 2:
                    kiHanNganHan = "6 thang";
                    checkGender = false;
                    break;
            }
        }
        return kiHanNganHan;
    }

    public static String idRegexCoThoiHan(List<CoThoiHan> coThoiHanList) {
        String id;
        boolean check = true;
        while (check) {
            check = false;
            while (true) {

                id = scanner.nextLine();
                if (id.matches(idRegex)) {
                    break;
                } else {
                    System.err.println("Nhập lại vD :  STK-XXXX");
                }
            }

            for (CoThoiHan emp : coThoiHanList) {
                if (emp.getIdSo().equals(id)) {
                    check = true;
                    break;
                }
            }
            if (check) {
                System.out.println("ID đã có trong list");
            } else {
                return id;
            }
        }
        return "";
    }

    public static String idRegexVoThoiHan(List<VoThoiHan> voThoiHanList) {
        String id;
        boolean check = true;
        while (check) {
            check = false;
            while (true) {

                id = scanner.nextLine();
                if (id.matches(idRegex)) {
                    break;
                } else {
                    System.err.println("Nhập lại vD :  STK-XXXX");
                }
            }

            for (VoThoiHan emp : voThoiHanList) {
                if (emp.getIdSo().equals(id)) {
                    check = true;
                    break;
                }
            }
            if (check) {
                System.out.println("ID đã có trong list");
            } else {
                return id;
            }
        }
        return "";
    }

    public static double soTienGui() {
        double soTienGui;
        while (true) {
            try {
                soTienGui = Double.parseDouble(scanner.nextLine());
                if (soTienGui < 100 && soTienGui > 1) {
                    return soTienGui;
                }
            } catch (NumberFormatException e) {
                System.err.println("NHập sai định dạng");
            }
        }
    }
}