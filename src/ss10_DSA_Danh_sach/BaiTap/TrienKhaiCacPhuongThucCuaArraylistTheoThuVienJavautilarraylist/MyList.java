package ss10_DSA_Danh_sach.BaiTap.TrienKhaiCacPhuongThucCuaArraylistTheoThuVienJavautilarraylist;
;

import java.util.Arrays;

    public class MyList<E> {
        private int size = 0;
        public static final int DEFAULT_CAPACITY = 10;
        private Object[] elements;

        public MyList() {
            elements = new Object[DEFAULT_CAPACITY];//???
        }

        public MyList(int capacity) {
            elements = new Object[capacity];
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public Object[] getElements() {
            return elements;
        }

        public void setElements(Object[] elements) {
            this.elements = elements;
        }

        //Thêm một phần tử
        public void add(int index, E element) {
            if (index > elements.length) {
                //Từ khoá throw trong java được sử dụng để ném ra một ngoại lệ (exception) cụ thể
                //IllegalArgumentException() Tham số được sử dụng để gọi phương thức không hợp lệ,
                throw new IllegalArgumentException("index: " + index);
            } else {
                //public void ensureCapacity(int minimumCapacity): được sử dụng để đảm bảo dung lượng ít nhất bằng mức tối thiểu nhất định.
                this.ensureCapacity(DEFAULT_CAPACITY);
            }
            if (elements[index] == null) {
                elements[index] = element;
                size++;
            } else {
                for (int i = size + 1; i >= index; i--) {
                    elements[i] = elements[i - 1];
                }
                elements[index] = element;
                size++;
            }
        }

        //Xóa một phần tử
        public E remove(int index) {
            if (index < 0 || index > elements.length) {
                throw new IllegalArgumentException("Error index: " + index);
            }
            E element = (E) elements[index];
            for (int i = index; i < size - 1; i++) {
                elements[i] = elements[i + 1];
            }
            elements[size - 1] = null;
            size--;
            return element;
        }
        //Clone có nghĩa là tạo ra một bản sao từ một bản gốc, trong class Object của java có 1 method là clone().
        public E clone() {
            MyList<E> clone = new MyList<>(elements.length);
            for (Object x : elements) {
                clone.add((E) x);
            }
            return (E) clone;
        }

        public boolean contains(E o) {
            return this.indexOf(o) >= 0;
        }

        public int indexOf(E o) {
            for (int i = 0; i < size; i++) {
                if (this.elements[i].equals(o)) {
                    return i;
                }
            }
            return -1;
        }

        public boolean add(E o) {
            if (size == elements.length) {
                ensureCapacity(DEFAULT_CAPACITY);
            }
            elements[size] = o;
            size++;
            return true;
        }

        public void ensureCapacity(int minCapacity) {
            if (minCapacity >= 0) {
                int newSize = this.elements.length + minCapacity;
                elements = Arrays.copyOf(elements, newSize);
            } else {
                throw new IllegalArgumentException("minCapacity: " + minCapacity);
            }
        }

        public E get(int index) {
            E element = null;
            for (int i = 0; i < elements.length; i++) {
                if (i == index) {
                    element = (E) elements[i];
                }
            }
            return element;
        }

        public void clear() {
            size = 0;
            Arrays.fill(elements, null);
        }
    }