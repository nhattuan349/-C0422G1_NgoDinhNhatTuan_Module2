package ss6_Ke_thua.Ly_thuyet;

public  class Person {
    protected int id;
    protected String name;
    protected String address;
    protected boolean gender;

    public Person() {
    }

    public Person(int id, String name, String address, boolean gender) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
    public  void goToBy(){
        System.out.println("đi bộ");
    }
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", gender=" + gender +
                '}';
    }
}
