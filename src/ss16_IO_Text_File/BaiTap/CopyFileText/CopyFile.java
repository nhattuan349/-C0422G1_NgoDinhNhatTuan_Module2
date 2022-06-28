package ss16_IO_Text_File.BaiTap.CopyFileText;

import java.io.*;

public class CopyFile {
    public static void readAndCopyFile(String source, String target) {
        File fileSource = new File(source);
        File fileTarget = new File(target);
        try (FileReader fileReader = new FileReader(fileSource);
             BufferedReader bufferedReader = new BufferedReader(fileReader);

             FileWriter fileWriter = new FileWriter(fileTarget);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            if (!fileSource.exists() && !fileTarget.exists()) {
                throw new FileNotFoundException();
            }
            String line;
            while (true) {
                line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                String[] arr = line.split("");
                for (String copy : arr) {
                    bufferedWriter.write(copy);
                }
                bufferedWriter.newLine();
            }
        } catch (Exception e) {
            System.out.println("File không tồn tại hoặc nội dung có lỗi!");
        }
    }

    public static void main(String[] args) {
        String source = "src/ss16_IO_Text_File/BaiTap/CopyFileText/source.csv";
        String target = "src/ss16_IO_Text_File/BaiTap/CopyFileText/target.csv";
        readAndCopyFile(source, target);
        System.out.println("sao chép thành công....");
    }
}
