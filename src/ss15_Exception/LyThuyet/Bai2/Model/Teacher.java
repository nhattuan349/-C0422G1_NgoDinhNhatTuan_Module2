package ss15_Exception.LyThuyet.Bai2.Model;

public class Teacher extends PerSon{
    private String classes;
    private String salary;
    private String hours;

    public Teacher() {
    }

    public Teacher(String classes, String salary, String hours) {
        this.classes = classes;
        this.salary = salary;
        this.hours = hours;
    }

    public Teacher(int id, String name, String gender, String dayOfBirth, String address, String classes, String salary, String hours) {
        super(id, name, gender, dayOfBirth, address);
        this.classes = classes;
        this.salary = salary;
        this.hours = hours;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    @Override
    public String inFo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s",
                super.getId(),
                super.getName(),
                super.getGender(),
                super.getDayOfBirth(),
                super.getAddress(),
                getClasses(),
                getSalary(),
                getHours());
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "classes='" + classes + '\'' +
                ", salary='" + salary + '\'' +
                ", hours='" + hours + '\'' +
                '}';
    }
}
