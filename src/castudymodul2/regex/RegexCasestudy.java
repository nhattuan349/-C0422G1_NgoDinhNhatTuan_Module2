package castudymodul2.regex;

import java.util.regex.Pattern;

public class RegexCasestudy {
    // "\d" bat ky chu so nao tu 0-9..
    // "?" xay ra 1 hoac khong lan..
    // "\s" bat ky ky tu trong nao..
    // "\" ky tu dieu khien..
    // "\w"	Bất kỳ ký tự chữ nào (chữ cái và chữ số), viết tắt của [a-zA-Z_0-9]
    public static boolean formatName(String str) {
        final String VALID_FULL_NAME = "^([A-Z]{1}[a-z]{1,}\\s{1}){1,}([A-Z]{1}[a-z]{1,})$";
        Pattern pattern = Pattern.compile(VALID_FULL_NAME);
        return pattern.matcher(str).matches();
    }

    public static boolean formatAddress(String str) {

        final String VALID_ADDRESS = "^((\\d{1,})?[//]?)+((\\s)?([A-Z]{1}[a-z]{1,}))+$";
        Pattern pattern = Pattern.compile(VALID_ADDRESS);
        return pattern.matcher(str).matches();
    }

    public static boolean intNum(String str) {
        final String VALID_NUMBER = "^\\d+$"; // nhap so bat ky
        Pattern pattern = Pattern.compile(VALID_NUMBER);
        return pattern.matcher(str).matches();
    }

    public static boolean formatPhone(String str) {
        final String VALID_PHONE = "^([+]{1})(\\d{1,2})([0]{1}\\d{9})$";
        Pattern pattern = Pattern.compile(VALID_PHONE);
        return pattern.matcher(str).matches();
    }

    public static boolean formatEmail(String str) {
        final String VALID_EMAIL = "^(\\w+)[@]{1}(\\w+)(\\.?\\w+)+$";
        Pattern pattern = Pattern.compile(VALID_EMAIL);
        return pattern.matcher(str).matches();
    }

    public static boolean formatGender(String str) {
        final String VALID_GENDER = "^(Nam|Nu){1}$";
        Pattern pattern = Pattern.compile(VALID_GENDER);
        return pattern.matcher(str).matches();
    }

    public static boolean formatDocument(String str) {
        final String VALID_DOCUMENT = "^\\d{9}$";
        Pattern pattern = Pattern.compile(VALID_DOCUMENT);
        return pattern.matcher(str).matches();
    }

    public static boolean code(String str) {
        final String VALID_CODE_EMPLOYEE = "^(EMID|CMID|BKID|CID){1}-\\d{4}$";
        Pattern pattern = Pattern.compile(VALID_CODE_EMPLOYEE);
        return pattern.matcher(str).matches();
    }

    public static boolean codeVilla(String str) {
        final String VALID_CODE_SERVICE = "^VSVL-\\d{4}$";
        Pattern pattern = Pattern.compile(VALID_CODE_SERVICE);
        return pattern.matcher(str).matches();

    }

    public static boolean codeHouse(String str) {
        final String VALID_CODE_SERVICE = "^VSHO-\\d{4}$";
        Pattern pattern = Pattern.compile(VALID_CODE_SERVICE);
        return pattern.matcher(str).matches();

    }

    public static boolean codeRoom(String str) {
        final String VALID_CODE_SERVICE = "^VSRO-\\d{4}$";
        Pattern pattern = Pattern.compile(VALID_CODE_SERVICE);
        return pattern.matcher(str).matches();
    }

    public static boolean codeservice(String str) {
        final String VALID_CODE_SERVICE = "^VS(VL|HO|RO)-\\d{4}$";
        Pattern pattern = Pattern.compile(VALID_CODE_SERVICE);
        return pattern.matcher(str).matches();
    }

    public static boolean dateFormat(String str) {
        final String VALID_FORMAT_DATE = "^\\d{1,2}/\\d{1,2}/\\d{4}$";
        Pattern pattern = Pattern.compile(VALID_FORMAT_DATE);
        return pattern.matcher(str).matches();
    }


    public static boolean borrowService(String str) {
        final String VALID_TYPE_SERVICE = "^(Hour|Day|Month|Year)$";
        Pattern pattern = Pattern.compile(VALID_TYPE_SERVICE);
        return pattern.matcher(str).matches();
    }

    public boolean typeService(String str) {
        final String VALID_TYPE_SERVICE = "^(VIP|Normal|Member)$";
        Pattern pattern = Pattern.compile(VALID_TYPE_SERVICE);
        return pattern.matcher(str).matches();
    }

    public static boolean nameService(String str) {
        final String VALID_NAME_SERVICE = "^[A-Z]{1}[a-z]{1,}$";
        Pattern pattern = Pattern.compile(VALID_NAME_SERVICE);
        return pattern.matcher(str).matches();
    }

    public static boolean peopleMax(String str) {
        final String VALID_NAME_SERVICE = "^[0-1]{1}[0-9]{1}$";
        Pattern pattern = Pattern.compile(VALID_NAME_SERVICE);
        return pattern.matcher(str).matches();
    }

    public static boolean poolArea(String str) {
        final String VALID_NAME_SERVICE = "^[0-9]{3,}|[3][2-9]|[4-9][0-9]$";
        Pattern pattern = Pattern.compile(VALID_NAME_SERVICE);
        return pattern.matcher(str).matches();
    }


}
