package ss7_Abstract_Class_Interface.ThucHanh.HuongdanCompatorvaComparable;

import java.util.Comparator;

public class NameStudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getNameStudent().compareTo(o2.getNameStudent());
    }
}
