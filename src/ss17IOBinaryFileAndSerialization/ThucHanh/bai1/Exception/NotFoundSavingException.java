package ss17IOBinaryFileAndSerialization.ThucHanh.bai1.Exception;

public class NotFoundSavingException extends Exception{
    @Override
    public  String getMessage() {
        return "Mã sổ tiết kiêm không tồn tại";
    }

}
