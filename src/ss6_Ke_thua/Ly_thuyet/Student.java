package ss6_Ke_thua.Ly_thuyet;
// dùng extends để triển khai kế thừa
public class Student extends Person {
    private String className;
    public static String school="CodeGym";

    public Student() {

    }

    public Student(int id, String name, String address, boolean gender, String className) {
        super(id, name, address, gender);
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public static String getSchool() {
        return school;
    }

    public static void setSchool(String school) {
        Student.school = school;
    }

    public void study(String subject){
        System.out.println(super.name + " đang học môn: "+ subject);
    }

    // đang overloading method phía trên
    public void study(){
        System.out.println(super.name + " đang học ");
    }

    // ghi đè lại phương thức goToBy từ lớp cha => phù hợp với class con
    @Override
     public void goToBy() {
        System.out.println("sinh viên đi xe máy");
    }

    @Override
    public String toString() {
        return "Student{" +
                "className='" + className + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", gender=" + gender +
                '}';
    }
}
