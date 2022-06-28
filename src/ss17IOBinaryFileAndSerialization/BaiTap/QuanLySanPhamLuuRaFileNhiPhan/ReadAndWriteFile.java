package ss17IOBinaryFileAndSerialization.BaiTap.QuanLySanPhamLuuRaFileNhiPhan;

import java.io.*;

public class ReadAndWriteFile {
    public static Object readFile(String pathFile) {
        File file = new File(pathFile);
//        Object obj = null;
        try (FileInputStream fileInputStream = new FileInputStream(file);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            Object obj = objectInputStream.readObject();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void writerFile(String pathFile, Object obj) {
        File file = new File(pathFile);
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}