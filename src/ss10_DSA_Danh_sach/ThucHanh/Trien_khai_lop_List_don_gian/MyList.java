package ss10_DSA_Danh_sach.ThucHanh.Trien_khai_lop_List_don_gian;

import java.util.Arrays;

public class MyList<E> {
    public int size = 0;
    private final static int DEFAULT_CAPACITY = 10;
    private Object[] element;
    public MyList(){
        element = new Object[DEFAULT_CAPACITY];
    }

    /**
     * Phương thức copyOf() được sử dụng để sao chép mảng
     * được chỉ định vào mảng mới của cùng một kiểu.
     * Trong khi sao chép, mảng mới có thể được cắt ngắn hoặc
     * có đệm với các giá trị mặc định để nó có chiều dài chỉ định.
     */
    private void ensureCapa(){
        int newSize = element.length * 2;
        element = Arrays.copyOf(element, newSize);
    }
    //Cài đặt phương thức add();
    public void add(E e){
        if (size == element.length){
            ensureCapa();
        }
        element[size++] = e;
    }
    //Cài đặt phương thức get();
    public E get(int i){
        if (i>=size || i < 0){
            throw new IndexOutOfBoundsException("Index: " + i + " ,Size " + i);
        }
        return (E) element[i];
    }
}
