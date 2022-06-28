package casestudy2.models.person;

public class Employee extends Person{
    private String level;
    private String location;
    private int salary;

    public Employee() {
    }

    public Employee(String level, String location, int salary) {
        this.level = level;
        this.location = location;
        this.salary = salary;
    }

    public Employee(String id, String name, String age, int gender, int identityCard, int phoneNumber, String mail, String level, String location, int salary) {
        super(id, name, age, gender, identityCard, phoneNumber, mail);
        this.level = level;
        this.location = location;
        this.salary = salary;
    }

    @Override
    public String getInfo() {
        return getId()+","+
                getName()+","+
                getAge()+","+
                getGender()+","+
                getIdentityCard()+","+
                getIdentityCard()+","+
                getPhoneNumber()+","+
                getMail()+","+
                location+","+
                salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "level='" + level + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                '}';
    }
}
