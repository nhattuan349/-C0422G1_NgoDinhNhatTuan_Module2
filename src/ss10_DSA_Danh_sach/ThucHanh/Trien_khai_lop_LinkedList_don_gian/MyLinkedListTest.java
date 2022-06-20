package ss10_DSA_Danh_sach.ThucHanh.Trien_khai_lop_LinkedList_don_gian;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(4, 9);
        ll.add(4, 9);
        ll.add(4, 9);
        ll.add(4, 9);
        ll.add(4, 9);
        ll.add(4, 9);
        ll.add(4, 9);
        ll.add(2, 9);
        ll.add(1, 9);
        ll.add(3, 9);

        ll.printList();
        for (int i = 0; i < args.length ; i++) {
            System.out.println(ll.get(i));
        }
    }
}
