package ss11_DSA_Stack_Queue.BaiTap.DaoNguocPhanTuTrongMangSoNguyenSuDungStack;

import java.util.Arrays;
import java.util.Stack;

public class StackReverse {
    public static void main(String[] args) {
        int[] arr = {5, 6, 5, 2, 5, 65, 5, 2, 5};
        Stack<Integer> stack = new Stack<>();
        for (int num : arr) {
            stack.push(num);
        }
        System.out.println(" Mảng số nguyên đầu: " + stack.toString());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        System.out.println("Mảng số nguyên sau khi đảo: " + Arrays.toString(arr));

        // Tạo một wStack rỗng.
        String chart = "Ngo Dinh Nhat Tuan";
        char[] arr2 = chart.toCharArray();
        Stack<Character> stackChar = new Stack<>();
        for (char word: arr2){
            stackChar.push(word);
        }
        System.out.println("Chuỗi ký tự: "+ stackChar.toString());
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]=stackChar.pop();
        }
        System.out.println("Chuỗi ký tự: "+ Arrays.toString(arr2));

    }
}