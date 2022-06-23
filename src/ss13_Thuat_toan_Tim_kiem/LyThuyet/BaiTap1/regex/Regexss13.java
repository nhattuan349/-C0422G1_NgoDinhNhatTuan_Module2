package ss13_Thuat_toan_Tim_kiem.LyThuyet.BaiTap1.regex;

import java.util.regex.Pattern;

public class Regexss13 {
    /**
     * Số nguyên và số thập phân
     */
    public static boolean numbers(String str) {
        final String VALID_NUMBER = "^\\d*(\\.\\d+)?$";
        Pattern pattern = Pattern.compile(VALID_NUMBER);
        return pattern.matcher(str).matches();
    }

    /**
     * "Nhập mã nhân viên : NVSX-XXXX với x là số "
     */
    public static boolean formatMaNhanVien(String str) {
        final String VALID_NUMBER = "^NVSX-\\d{4}$";
        Pattern pattern = Pattern.compile(VALID_NUMBER);
        return pattern.matcher(str).matches();
    }

    /**
     * "Nhập mã nhân viên : NVSX-XXXX với x là số "
     */
    public static boolean formatHovaTen(String str) {
        final String VALID_NUMBER = "^[a-zA-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõ" +
                "ùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂẾưăạảấầẩẫậắằẳẵặẹẻẽềềểếỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢ" +
                "ỤỦỨỪễệỉịọỏốồổỗộớờởỡợụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ\\s\\W|_]+$";
        Pattern pattern = Pattern.compile(VALID_NUMBER);
        return pattern.matcher(str).matches();
    }

    /**
     * Ngày/Tháng/Năm-(dd/MM/yyyy)
     */
    public static boolean formatDate(String str) {
        final String VALID_FORMAT_DATE = "^\\d{1,2}/\\d{1,2}/\\d{4}$";
        Pattern pattern = Pattern.compile(VALID_FORMAT_DATE);
        return pattern.matcher(str).matches();
    }

    /**
     * "Nhập địa chỉ :  "
     */
    public static boolean formatDiachi(String str) {
        final String VALID_NUMBER = "^[0-9a-zA-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõ" +
                "ùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂẾưăạảấầẩẫậắằẳẵặẹẻẽềềểếỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢ" +
                "ỤỦỨỪễệỉịọỏốồổỗộớờởỡợụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ\\s\\W|_]+$";
        Pattern pattern = Pattern.compile(VALID_NUMBER);
        return pattern.matcher(str).matches();
    }

    /**
     * "Nhập số sản phẩm :  "
     */
    public static boolean formatNumSP(String str) {
        final String VALID_NUMBER = "^[0-9]*[0-9]$";
        Pattern pattern = Pattern.compile(VALID_NUMBER);
        return pattern.matcher(str).matches();
    }

    /**
     * "Nhập số Số tiền Sản Phẩm :  "
     */
    public static boolean formatMoneySP(String str) {
        final String VALID_NUMBER = "^[0-9]*[0-9]$";
        Pattern pattern = Pattern.compile(VALID_NUMBER);
        return pattern.matcher(str).matches();
    }

    /**
     * "Nhập số Lương cơ bản :  "
     */
    public static boolean formatLuongCoBan(String str) {
        final String VALID_NUMBER = "^[0-9]*[0-9]$";
        Pattern pattern = Pattern.compile(VALID_NUMBER);
        return pattern.matcher(str).matches();
    }

    /**
     * "Nhập số Hẹ Số lương:  "
     */
    public static boolean formatHesoLuong(String str) {
        final String VALID_NUMBER = "^[0-9]*[0-9]$";
        Pattern pattern = Pattern.compile(VALID_NUMBER);
        return pattern.matcher(str).matches();
    }
}
