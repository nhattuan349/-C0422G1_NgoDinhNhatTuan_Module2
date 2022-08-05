package ss17IOBinaryFileAndSerialization.LyThuyet.utils;

public class NotFoundSavingException extends Exception {
    @Override
    public String getMessage() {
        return "Mã sổ tiết kiệm không tồn tại";
    }
}
