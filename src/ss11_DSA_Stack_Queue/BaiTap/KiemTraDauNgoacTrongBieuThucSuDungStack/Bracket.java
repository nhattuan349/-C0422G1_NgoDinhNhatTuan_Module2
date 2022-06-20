package ss11StackQueue.BaiTap.KiemTraDauNgoacTrongBieuThucSuDungStack;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {

        Stack<Character> bStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập để test: ");
        String text = scanner.nextLine();
        boolean flag = true;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '(') {
                bStack.push(text.charAt(i));
            } else if (text.charAt(i) == ')') {
                if (bStack.isEmpty()) {
                    System.out.println("False");
                    flag = false;
                    break;
                }
                bStack.pop();
            }
        }
        if (flag && bStack.isEmpty()) {
            System.out.println("True");
        } else if (!bStack.isEmpty()) {
            System.out.println("False");
        }
    }
}