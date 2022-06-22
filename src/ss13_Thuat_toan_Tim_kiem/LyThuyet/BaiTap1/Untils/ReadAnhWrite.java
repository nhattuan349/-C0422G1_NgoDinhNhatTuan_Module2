package ss13_Thuat_toan_Tim_kiem.LyThuyet.BaiTap1.Untils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class ReadAnhWrite {
    /**
     * Ghi file
     */
    public static void writeFile(String path, String line) {
        try (FileWriter fileWriter = new FileWriter(path, false);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(line);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Đọc file
     */
    public static List<String[]> readFile(String path) {
        List<String[]> listLine = new ArrayList<>();
        try (FileReader fileReader = new FileReader(path);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line = null;
            while (true) {
             line=bufferedReader.readLine();
             if (line == null || line.equals("")) {
                 break;
             }
             String[] read = line.split(",");
             listLine.add(read);
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
        return listLine;
    }

}
