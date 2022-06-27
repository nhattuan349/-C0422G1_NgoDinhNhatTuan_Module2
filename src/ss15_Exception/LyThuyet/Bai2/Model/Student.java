package ss15_Exception.LyThuyet.Bai2.Model;

public class Student extends PerSon{

    private String codeStudent;
    private String point;

    public Student() {
    }

    @Override
    public String inFo() {
        return null;
    }

    public Student(String codeStudent, String point) {
        this.codeStudent = codeStudent;
        this.point = point;
    }

    public Student(int id, String name, String gender, String dayOfBirth,
                   String address, String codeStudent, String point) {
        super(id, name, gender, dayOfBirth, address);
        this.codeStudent = codeStudent;
        this.point = point;
    }

    public String getCodeStudent() {
        return codeStudent;
    }

    public void setCodeStudent(String codeStudent) {
        this.codeStudent = codeStudent;
    }

    public String getPoint() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s",
                super.getId(),
                super.getName(),
                super.getGender(),
                super.getDayOfBirth(),
                super.getAddress(),
                getCodeStudent(),
                getPoint());
    }

    public void setPoint(String point) {
        this.point = point;
    }

}
