package ss13_Thuat_toan_Tim_kiem.LyThuyet.BaiTap1.Model;

public abstract  class Person {
    private int id;
    private String codePerson;
    private String fullName;
    private String dayOfBirth;
    private String address;

    public Person() {
    }

    public Person(int id, String codePerson, String fullName, String dayOfBirth, String address) {
        this.id = id;
        this.codePerson = codePerson;
        this.fullName = fullName;
        this.dayOfBirth = dayOfBirth;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodePerson() {
        return codePerson;
    }

    public void setCodePerson(String codePerson) {
        this.codePerson = codePerson;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public abstract String inFor();

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", codePerson='" + codePerson + '\'' +
                ", fullName='" + fullName + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
