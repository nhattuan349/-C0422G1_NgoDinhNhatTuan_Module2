package exam.regex;



import exam.model.HocVien;
import exam.model.NhanVien;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexNhanSu {
    public static Scanner scanner = new Scanner(System.in);
    /**
     * Regex Ma DInh Danh
     */
    public static String idRegex = "(NV|HV)\\-[0-9]{3}";
    public static String idMaDinhDanhRegexNhanVien(List<NhanVien> nhanVienList) {
        String idMaDinhDanh;
        boolean check = true;
        while (check) {
            check = false;
            while (true) {
                idMaDinhDanh = scanner.nextLine();
                if (idMaDinhDanh.matches(idRegex)) {
                    break;
                } else {
                    System.out.println("Nhập lại ID Ví dụ : NV-XXX");
                }
            }
            for (NhanVien item : nhanVienList) {
                if (item.getIdMaDinhDanh().equals(idMaDinhDanh)) {
                    check = true;
                    break;
                }
            }
            if (check) {
                System.out.println("ID đã có trong list");
            } else {
                return idMaDinhDanh;
            }
        }
        return "";
    }

    public static String idMaDinhDanhRegexHocVien(List<HocVien> hocVienList) {
        String idMaDinhDanh;
        boolean check = true;
        while (check) {
            check = false;
            while (true) {
                idMaDinhDanh = scanner.nextLine();
                if (idMaDinhDanh.matches(idRegex)) {
                    break;
                } else {
                    System.out.println("Nhập lại ID Ví dụ : NV-XXX");
                }
            }
            for (HocVien item : hocVienList) {
                if (item.getIdMaDinhDanh().equals(idMaDinhDanh)) {
                    check = true;
                    break;
                }
            }
            if (check) {
                System.out.println("ID đã có trong list");
            } else {
                return idMaDinhDanh;
            }
        }
        return "";
    }

    // Nhap Ho va Ten
    public static boolean HoTenRegex(String str) {
        final String VALID_NUMBER = "^[a-zA-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõ" +
                "ùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂẾưăạảấầẩẫậắằẳẵặẹẻẽềềểếỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢ" +
                "ỤỦỨỪễệỉịọỏốồổỗộớờởỡợụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ\\s\\W|_]+$";
        Pattern pattern = Pattern.compile(VALID_NUMBER);
        return pattern.matcher(str).matches();
    }

    public static String HoTenRegexNhanVien(List<NhanVien> nhanVienList) {
        String hovaTen;
        do {
            try {
                hovaTen = scanner.nextLine();
                if (RegexNhanSu.HoTenRegex(hovaTen)) {
                    break;
                } else throw new Exception("Sai dinh dang");//System.out.println("Nhập lại");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);
        return hovaTen;
    }

    public static String HoTenRegexHocVien(List<HocVien> hocVienList) {
        String hovaTen;
        do {
            try {
                hovaTen = scanner.nextLine();
                if (RegexNhanSu.HoTenRegex(hovaTen)) {
                    break;
                } else throw new Exception("Sai dinh dang");//System.out.println("Nhập lại");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);
        return hovaTen;
    }

    // Nhap Ngay thang Exception
    public static void dateTimeCheck(String dateOfBirth) throws Exception {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);
        LocalDate localDate1 = LocalDate.parse(dateOfBirth, formatter);
        LocalDate localDate2 = LocalDate.now();
        localDate2.format(formatter);

        int year = Period.between(localDate1, localDate2).getYears();
        if (year <= 1 && year >= 100) {
            throw new DateTimeException("Error");
        }
    }

    public static String ngaySinhException() {
        String ngaySinh;
        while (true) {
            try {
                ngaySinh = scanner.nextLine();
                dateTimeCheck(ngaySinh);
                break;
            } catch (DateTimeException e) {
                System.err.println("Nhập sai ");
            } catch (Exception ignored) {
                System.err.println("Nhập sai định dạng");
            }
        }
        return ngaySinh;
    }

    // Nhap Sdt
    public static boolean soDienThoaiRegex(String str) {
        final String VALID_NUMBER = "^[0-9]+$";
        Pattern pattern = Pattern.compile(VALID_NUMBER);
        return pattern.matcher(str).matches();
    }

    public static String soDienThoaiNhanVien(List<NhanVien> nhanVienList) {
        String soDienThoai;
        do {
            try {
                soDienThoai = scanner.nextLine();
                if (RegexNhanSu.soDienThoaiRegex(soDienThoai)) {
                    break;
                } else throw new Exception("Sai dinh dang");//System.out.println("Nhập lại");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);
        return soDienThoai;
    }

    public static String soDienThoaiHocVien(List<HocVien> hocVienList) {
        String soDienThoai;
        do {
            try {
                soDienThoai = scanner.nextLine();
                if (RegexNhanSu.soDienThoaiRegex(soDienThoai)) {
                    break;
                } else throw new Exception("Sai dinh dang");//System.out.println("Nhập lại");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);
        return soDienThoai;
    }


    // Nhap Sdt
    public static boolean luongRegex(String str) {
        final String VALID_NUMBER = "^[0-9]+$";
        Pattern pattern = Pattern.compile(VALID_NUMBER);
        return pattern.matcher(str).matches();
    }

    public static String luongRegexNhanVien(List<NhanVien> nhanVienList) {
        String luong;
        do {
            try {
                luong = scanner.nextLine();
                if (RegexNhanSu.luongRegex(luong)) {
                    break;
                } else throw new Exception("Sai dinh dang");//System.out.println("Nhập lại");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);
        return luong;
    }

    // Nhap Sdt
    public static boolean diemThiRegex(String str) {
        final String VALID_NUMBER = "^[0-9]{3}$";
        Pattern pattern = Pattern.compile(VALID_NUMBER);
        return pattern.matcher(str).matches();
    }

    public static String diemThiRegexHocVien(List<HocVien> hocVienList) {
        String diemThi;
        do {
            try {
                diemThi = scanner.nextLine();
                if (RegexNhanSu.diemThiRegex(diemThi)) {
                    break;
                } else throw new Exception("Sai dinh dang");//System.out.println("Nhập lại");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);
        return diemThi;
    }

}
