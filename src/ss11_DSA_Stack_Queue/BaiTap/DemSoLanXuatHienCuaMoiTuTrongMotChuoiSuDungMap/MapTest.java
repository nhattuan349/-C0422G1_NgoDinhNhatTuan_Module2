package ss11_DSA_Stack_Queue.BaiTap.DemSoLanXuatHienCuaMoiTuTrongMotChuoiSuDungMap;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String str = input.nextLine();

        TreeMap<String, Integer> countLetterMap = new TreeMap<>();

        int value = 0;
        String[] arrStr = str.toUpperCase().split(" ");

        for (String item : arrStr) {
            if (countLetterMap.containsKey(item)) {
                value = countLetterMap.get(item) + 1;
                countLetterMap.put(item, value);
            } else {
                value = 1;
                countLetterMap.put(item, value);
            }
        }
        Set<String> keySet = countLetterMap.keySet();
        System.out.println("Số lần xuất hiện các từ trong chuỗi: ");
        for (String item : keySet) {
            System.out.println(item + ": " + countLetterMap.get(item));
        }
    }
}
