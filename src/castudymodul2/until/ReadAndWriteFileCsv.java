package castudymodul2.until;


import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class ReadAndWriteFileCsv implements Serializable {
    /**
     * Ghi file
     */
    public static void writeFile(String path, String line) {
        try (FileWriter fileWriter = new FileWriter(path, false);// co ghi de file hay khong true/false
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(line);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Đoc file
     */
    public static List<String[]> readFile(String path) {
        List<String[]> listLine = new ArrayList<>();
        try (FileReader fileReader = new FileReader(path);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line = null;
            while (true) {
                line = bufferedReader.readLine();
                if (line == null || line.equals("")) {
                    break;
                }
                String[] read = line.split(",");
                listLine.add(read);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listLine;
    }
}
