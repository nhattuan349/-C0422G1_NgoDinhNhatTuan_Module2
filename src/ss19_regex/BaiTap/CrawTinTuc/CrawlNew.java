package ss19_regex.BaiTap.CrawTinTuc;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CrawlNew {
    public static void main(String[] args) {
        String regexCrawlNews = "^(https?)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Mời bạn nhập một đường link tin tức ---\n --- Ví dụ: https://james.codegym.vn/course/view.php?id=541&section=19");
            String test = scanner.nextLine();
            boolean checkRegex = Pattern.matches(regexCrawlNews, test);
            if (checkRegex) {
                System.out.println("link web: Khớp");
            } else System.out.println("link web: Không khớp, mời nhập lại");
        } while (true);
    }
}
