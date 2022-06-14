package ss6_Ke_thua.Ly_thuyet;

public class Test {
    public static void main(String[] args) {
        Student student = new Student(1,"chanh","DN",true,"C04");
        System.out.println(student.toString());
        student.goToBy();
        // gọi method ko tham số
        student.study();
        // gọi method có tham số
        student.study("Toán");

        // khai báo
        Person person1 = new Person();
        Student student1 = new Student();
        person1= student1;
        // cách 2
        Person person2 = new Student();
        // Person kiểu dữ liệu khai báo
        // person2 biến tham chiếu
        // new Student() đối tượng (kiểu Student) => kiểu thực tế
        System.out.println(person2 instanceof Person); // true
        System.out.println(person2 instanceof Student);// true
        person2.goToBy();// hiện tại gọi của person=> khi chạy gọi lớp con Student
        
    }
}
