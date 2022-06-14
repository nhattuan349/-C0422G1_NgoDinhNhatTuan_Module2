package ss5_Access_modifier_Static_method_Static_property.LyThuyet;
// Class tiện ích
public class Calculator {//May tinh
    // biến thường
    int x;
    // biến static
    static int y;


    public void test(){
        multiply(1,2);
    }
    public static int sum(int n1, int n2){
       // method static(phương thức satic) có thể gọi method static(phương thức satic)
        multiply(n1,n2);
        // không gọi trực tiếp được method thường
        // test()
        // gọi được biến static
        System.out.println(y);
        // không gọi được biến thường (none-static)
        // System.out.println(x);
        return n1+n2;
    }
    public static int multiply(int n1, int n2){
        return n1*n2;
    }
}
