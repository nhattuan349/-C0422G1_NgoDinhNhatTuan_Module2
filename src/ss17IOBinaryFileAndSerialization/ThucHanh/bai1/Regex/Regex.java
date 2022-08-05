package ss17IOBinaryFileAndSerialization.ThucHanh.bai1.Regex;


import ss17IOBinaryFileAndSerialization.ThucHanh.bai1.Exception.IdException;
import ss17IOBinaryFileAndSerialization.ThucHanh.bai1.model.CoThoiHan;
import ss17IOBinaryFileAndSerialization.ThucHanh.bai1.model.DaiHan;
import ss17IOBinaryFileAndSerialization.ThucHanh.bai1.model.VoThoiHan;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
    public static Scanner scanner = new Scanner(System.in);
    /**
     * Regex DaiHan
     */
    public static String idRegex = "STK\\-[0-9]{4}";

    public static String idRegexDaiHan(List<DaiHan> daiHanList) {
        String id;
        boolean check = true;
        while (check) {
            check = false;
            while (true) {
                id = scanner.nextLine();
                if (id.matches(idRegex)) {
                    break;
                } else {
                    System.out.println("Nhập lại ID Ví dụ : STK-XXXX");
                }
            }
            for (DaiHan item : daiHanList) {
                if (item.getIdSo().equals(id)) {
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
                    System.out.println("Nhập lại ID Ví dụ : STK-XXXX");
                }
            }
            for (CoThoiHan item : coThoiHanList) {
                if (item.getIdSo().equals(id)) {
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
                    System.out.println("Nhập lại ID Ví dụ : STK-XXXX");
                }
            }
            for (VoThoiHan item : voThoiHanList) {
                if (item.getIdSo().equals(id)) {
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

    public static String kiHanDaiHan() {
        String kiHan = "";
        boolean checkGender = true;
        while (checkGender) {
            int choice = 0;
            System.out.println("Kì Hạn----------" +
                    "1. 1 Năm" +
                    "2. 2 Năm" +
                    "3. 5 Năm" +
                    "4. 10 Năm" +
                    "Chọn 1>4");
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
                    kiHan = "5 nam";
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

    public static void dateTimeCheck(String dateOfBirth) throws Exception {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);
        LocalDate localDate1 = LocalDate.parse(dateOfBirth, formatter);
        LocalDate localDate2 = LocalDate.now();
        localDate2.format(formatter);

        int year = Period.between(localDate1, localDate2).getYears();
        if (year <= 18 && year >= 100) {
            throw new DateTimeException("Error");
        }
    }

    public static String dateException() {
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

    public static String idKhachHangRegexDaiHan = "[0-9]*";

    public static String idKhachHangRegexDaiHan(List<DaiHan> daiHanList) {
        String id;
        boolean check = true;
        while (check) {
            check = false;
            while (true) {
                id = scanner.nextLine();
                if (id.matches(idKhachHangRegexDaiHan)) {
                    break;
                } else {
                    System.out.println("Nhập lại ID Ví dụ : Nhập Số khác");
                }
            }
            for (DaiHan item : daiHanList) {
                if (item.getIdSo().equals(id)) {
                    check = true;
                    break;
                }
            }
            if (check) {
                System.out.println("ID Khách hàng đã có trong list");
            } else {
                return id;
            }
        }
        return "";
    }

    public static String idKhachHangRegexCoThoiHan(List<CoThoiHan> coThoiHanList) {
        String id;
        boolean check = true;
        while (check) {
            check = false;
            while (true) {
                id = scanner.nextLine();
                if (id.matches(idKhachHangRegexDaiHan)) {
                    break;
                } else {
                    System.out.println("Nhập lại ID Ví dụ : Nhập Số khác");
                }
            }
            for (CoThoiHan item : coThoiHanList) {
                if (item.getIdSo().equals(id)) {
                    check = true;
                    break;
                }
            }
            if (check) {
                System.out.println("ID Khách hàng đã có trong list");
            } else {
                return id;
            }
        }
        return "";
    }

    public static String idKhachHangRegexVoThoiHan(List<VoThoiHan> voThoiHanList) {
        String id;
        boolean check = true;
        while (check) {
            check = false;
            while (true) {
                id = scanner.nextLine();
                if (id.matches(idKhachHangRegexDaiHan)) {
                    break;
                } else {
                    System.out.println("Nhập lại ID Ví dụ : Nhập Số khác");
                }
            }
            for (VoThoiHan item : voThoiHanList) {
                if (item.getIdSo().equals(id)) {
                    check = true;
                    break;
                }
            }
            if (check) {
                System.out.println("ID Khách hàng đã có trong list");
            } else {
                return id;
            }
        }
        return "";
    }

    /**
     * "Nhập Số Tiền Gửi"
     */
    public static boolean SoTienGuiRegex(String str) {
        final String VALID_NUMBER = "^[0-9]*$";
        Pattern pattern = Pattern.compile(VALID_NUMBER);
        return pattern.matcher(str).matches();
    }

    public static String SoTienGuiRegexDaiHan(List<DaiHan> daiHanList) {
        String soTienGUi;
        do {
            try {
                soTienGUi = scanner.nextLine();
                if (Regex.SoTienGuiRegex(soTienGUi)) {
                    break;
                } else throw new IdException("Sai dinh dang");//System.out.println("Nhập lại");
            } catch (IdException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
        return soTienGUi;
    }

    public static String SoTienGuiRegexCoThoiHan(List<CoThoiHan> coThoiHanList) {
        String soTienGUi;
        do {
            try {
                soTienGUi = scanner.nextLine();
                if (Regex.SoTienGuiRegex(soTienGUi)) {
                    break;
                } else throw new IdException("Sai dinh dang");//System.out.println("Nhập lại");
            } catch (IdException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
        return soTienGUi;
    }

    public static String SoTienGuiRegexVoThoiHan(List<VoThoiHan> voThoiHanList) {
        String soTienGUi;
        do {
            try {
                soTienGUi = scanner.nextLine();
                if (Regex.SoTienGuiRegex(soTienGUi)) {
                    break;
                } else throw new IdException("Sai dinh dang");//System.out.println("Nhập lại");
            } catch (IdException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
        return soTienGUi;
    }

    public static boolean LaiSuatRegex(String str) {
        final String VALID_NUMBER = "^0$|^[1-9]\\d*$|^\\.\\d+$|^0\\.\\d*$|^[1-9]\\d*\\.\\d*$";
        Pattern pattern = Pattern.compile(VALID_NUMBER);
        return pattern.matcher(str).matches();
    }

    public static String LaiSuatRegexDaiHan(List<DaiHan> daiHanList) {
        String LaiSuat;
        do {
            try {
                LaiSuat = scanner.nextLine();
                if (Regex.LaiSuatRegex(LaiSuat)) {
                    break;
                } else throw new IdException("Sai dinh dang");//System.out.println("Nhập lại");
            } catch (IdException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
        return LaiSuat;
    }

    public static String LaiSuatRegexCoThoiHan(List<CoThoiHan> coThoiHanList) {
        String LaiSuat;
        do {
            try {
                LaiSuat = scanner.nextLine();
                if (Regex.LaiSuatRegex(LaiSuat)) {
                    break;
                } else throw new IdException("Sai dinh dang");//System.out.println("Nhập lại");
            } catch (IdException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
        return LaiSuat;
    }

    public static String LaiSuatRegexVoThoiHan(List<VoThoiHan> voThoiHanList) {
        String LaiSuat;
        do {
            try {
                LaiSuat = scanner.nextLine();
                if (Regex.LaiSuatRegex(LaiSuat)) {
                    break;
                } else throw new IdException("Sai dinh dang");//System.out.println("Nhập lại");
            } catch (IdException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
        return LaiSuat;
    }

    /**
     * "Nhập ưu Đãi"
     */
    public static boolean uuDaiRegex(String str) {
        final String VALID_NUMBER = "^[a-zA-Z0-9ÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõ" +
                "ùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂẾưăạảấầẩẫậắằẳẵặẹẻẽềềểếỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢ" +
                "ỤỦỨỪễệỉịọỏốồổỗộớờởỡợụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ\\s\\W|_]+$";
        Pattern pattern = Pattern.compile(VALID_NUMBER);
        return pattern.matcher(str).matches();
    }

    public static String uuDaiRegexDaiHan(List<DaiHan> daiHanList) {
        String uuDai;
        do {
            try {
                uuDai = scanner.nextLine();
                if (Regex.uuDaiRegex(uuDai)) {
                    break;
                } else throw new IdException("Sai dinh dang");//System.out.println("Nhập lại");
            } catch (IdException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
        return uuDai;
    }


    /**
     * "Nhập Ngày mở sổ"
     */
//    public static boolean formatNgayMoSoRegex(String str) {
//        final String VALID_NUMBER = "^[a-zA-Z0-9ÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõ" +
//                "ùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂẾưăạảấầẩẫậắằẳẵặẹẻẽềềểếỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢ" +
//                "ỤỦỨỪễệỉịọỏốồổỗộớờởỡợụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ\\s\\W|_]+$";
//        Pattern pattern = Pattern.compile(VALID_NUMBER);
//        return pattern.matcher(str).matches();
//    }
//
//    public static String NgayMoSoRegex() {
//        String ngayMoSo;
//        do {
//            try {
//                System.out.print("nhập ID");
//                ngayMoSo = scanner.nextLine();
//                if (Regex.formatNgayMoSoRegex(ngayMoSo)) {
//                    break;
//                } else throw new NgayMoSoException("Sai dinh dang");//System.out.println("Nhập lại");
//            } catch (NgayMoSoException e) {
//                System.out.println(e.getMessage());
//            }
//        } while (true);
//        return ngayMoSo;
//    }
}
