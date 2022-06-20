package ss11_DSA_Stack_Queue.LyThuyet.Bai2;

import java.util.Scanner;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<String> stackChuoi = new Stack<String>();

//        stackChuoi.push("giatri"); // đưa giá trị vào stack
//        stackChuoi.pop();//lấy giá trị ra, xóa khỏi stack
//        stackChuoi.peek(); // lấy giá trị ra, nhưng không xóa khỏi stack
//        stackChuoi.clear();// xóa tất cả phần tử trong stack
//        stackChuoi.contains("giatri");// xác định giá trị có tồn tại trong stack hay không
//        stackChuoi.size(); // Lấy ra độ lớn của stack



        // ví dụ đảo ngược chuỗi
        System.out.println("NHập vào chuỗi: ");
        String nhapChuoi = scanner.nextLine();
        // Nhập TITV
        for (int i = 0; i < nhapChuoi.length(); i++) {
            stackChuoi.push(nhapChuoi.charAt(i) + "");
        }
            System.out.print("Chuỗi đảo ngươc: ");
        for (int i = 0; i < nhapChuoi.length(); i++) {
            System.out.print(stackChuoi.pop());
        }


        //Chuyển tư hệ thập phân sang hệ nhị phân
        Stack<Integer> stackSoDu = new Stack<Integer>();
        System.out.println("Nhập 1 số nguyên dương từ bàn phím ");
        int x = Integer.parseInt(scanner.nextLine());
        while (x>0) {
            int soDu=x%2;
            stackSoDu.push(soDu);
            x=x/2;
        }
        System.out.println("Số nhị phân là");
        int n = stackSoDu.size();
        for (int i = 0; i <n ; i++) {
            System.out.print(stackSoDu.pop());
        }
    }
}
