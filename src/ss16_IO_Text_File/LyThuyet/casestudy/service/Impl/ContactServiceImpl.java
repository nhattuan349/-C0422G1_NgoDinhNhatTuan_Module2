package ss16_IO_Text_File.LyThuyet.casestudy.service.Impl;

import casestudy.models.Booking;
import casestudy.models.Contract;
import casestudy.models.preson.Customer;
import casestudy.service.ContactService;
import casestudy.service.Impl.BookingServiceImpl;

import java.util.*;

public class ContactServiceImpl implements ContactService {
    static List<Contract> contractList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void createNewContact() {
        Queue<Booking> bookingQueue = new LinkedList<>();
        Set<Booking> bookingSet = new BookingServiceImpl().sendBooking();
        for (Booking booking : bookingSet) {
            bookingQueue.add(booking);
        }
        while (!bookingQueue.isEmpty()) {
            Booking booking = bookingQueue.poll();

            Customer customer = booking.getCustomer();

            System.out.println("Đang tạo hợp đồng cho Booking có thông tin" + booking.toString());

            System.out.println("Đang tạo hợp đồng cho Customer có thông tin" + customer.toString());
            String id = scanner.nextLine();

            System.out.println("Nhập số tiền trả trước");
            String pre = scanner.nextLine();

            System.out.println("Nhập số chi phí");
            String pay = scanner.nextLine();

            Contract contract = new Contract(id, booking, pre, pay, customer);
            contractList.add(contract);
            System.out.println("Đã tạo hợp đồng thành công" + contract.toString());
        }
    }

    @Override
    public void displayListContact() {
        for (Contract contract : contractList) {
            System.out.println(contract.toString());
        }
    }

    @Override
    public void editContact() {
        System.out.println("Nhập id muốn sửa");
    }
}