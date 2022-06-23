package ss14_Thuat_toan_Sap_xep.BaiTap.MinhHoaThuatToanSapXepChen;

import java.util.Arrays;
import java.util.Scanner;

public class SortOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng");
        int lenght =Integer.parseInt(scanner.nextLine());
        int[] arr =new int[lenght];
        System.out.println("Nhập "+ arr.length+"phần tử của mảng:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] =Integer.parseInt(scanner.nextLine());
        }
        int index, arrIndex;
        for (int i = 0; i < arr.length; i++) {
            arrIndex =arr[i];
            index =i;
            while (index>0 && arrIndex < arr[index-1]) {
                arr[index]= arr[index-1];
                index--;
            }
            arr[index]=arrIndex;
            System.out.println("Mảng sau khi sắp xếp theo từng bước "+i+"là"+ Arrays.toString(arr));

        }
    }
}
