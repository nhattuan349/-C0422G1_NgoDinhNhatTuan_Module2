package ss6_Ke_thua.Ly_thuyet;

public class Employee  extends Person{
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee() {
    }

    public Employee(int id, String name, String address, boolean gender, int salary) {
        super(id, name, address, gender);
        this.salary = salary;
    }
    public void working(){
        System.out.println("làm việc");
    }
}
