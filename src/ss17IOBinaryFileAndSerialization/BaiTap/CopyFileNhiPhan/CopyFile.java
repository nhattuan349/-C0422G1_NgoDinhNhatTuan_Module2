package ss17IOBinaryFileAndSerialization.BaiTap.CopyFileNhiPhan;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class CopyFile {

    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    private static void copyFileUsingStream(File source, File dest) {

        try (InputStream is = new FileInputStream(source);
             OutputStream os = new FileOutputStream(dest)) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        File sourceFile = new File("src/ss17IOBinaryFileAndSerialization/BaiTap/CopyFileNhiPhan/source.txt");
        File destFile = new File("src/ss17IOBinaryFileAndSerialization/BaiTap/CopyFileNhiPhan/target.txt");
        try {
            copyFileUsingJava7Files(sourceFile, destFile);
            System.out.printf("Copy thành công");
        } catch (IOException ioe) {
            System.out.printf("Không thể copy file");
            System.out.printf(ioe.getMessage());
        }
    }
}