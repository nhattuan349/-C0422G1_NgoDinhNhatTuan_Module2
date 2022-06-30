package ss16_IO_Text_File.LyThuyet.casestudy.service.Impl;

import casestudy.models.facility.House;
import casestudy.models.facility.Room;
import casestudy.models.facility.Vila;
import casestudy.service.FacilityService;
import casestudy.utils.ReadAndWrite;
import casestudy.utils.RegexData;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    public static final String REGEX_STR = "[A-Z][a-z]+";
    public static final String REGEX_ID_VILLA = "(SVVL)[-][\\d]{4}";
    public static final String REGEX_ID_HOUSE = "(SVHO)[-][\\d]{4}";
    public static final String REGEX_ID_ROOM = "(SVRO)[-][\\d]{4}";
    public static final String REGEX_AMOUNT = "^[1-9]|([1][0-9])|(20)$";
    public static final String REGEX_INT = "^[0-9]+$";
    public static final String REGEX_AREA = "^([3-9]\\d|[1-9]\\d{2,})$";

    private static Map<Vila, Integer> villaList = new LinkedHashMap<>();
    private static Map<House, Integer> houseList = new LinkedHashMap<>();
    private static Map<Room, Integer> roomList = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        Set<Vila> vilaSet = villaList.keySet();
        readFileVilla();
        for (Vila vila : vilaSet) {
            System.out.println(vila + " " + villaList.get(vila));
        }
        Set<House> houseSet = houseList.keySet();
        readFileHouse();
        for (House house : houseSet) {
            System.out.println(house + " " + houseList.get(house));
        }
        Set<Room> roomSet = roomList.keySet();
        readFileRoom();
        for (Room room : roomSet) {
            System.out.println(room);
        }
    }

    @Override
    public void displayMaintain() {
        Set<Vila> vilaSet = villaList.keySet();
        for (Vila vila : vilaSet) {
            if (villaList.get(vila) >= 5) {
                System.out.println(vila);
            }
        }
        Set<House> houseSet = houseList.keySet();
        for (House house : houseSet) {
            if (houseList.get(house) >= 5) {
                System.out.println(house);
            }
        }
        Set<Room> roomSet = roomList.keySet();
        for (Room room : roomSet) {
            if (roomList.get(room) >= 5) {
                System.out.println(room);
            }
        }
    }

    public String getStyleRental() {
        do {
            System.out.println("Chọn kiểu thuê");
            System.out.println("1.Năm");
            System.out.println("2.Tháng");
            System.out.println("3.Ngày");
            System.out.println("1.Giờ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    return "Năm";
                case 2:
                    return "Tháng";
                case 3:
                    return "Ngày";
                case 4:
                    return "Giờ";
                default:
                    System.out.println("Chọn sai rồi!! Chọn lại đi");
                    getStyleRental();
            }
        } while (true);
    }

    @Override
    public void addNewVilla() {
        String id = inputIdVilla();

        String name = inputName();

        double areaUse = Double.parseDouble(inputAreaUse());

        int rentalPrice = Integer.parseInt(inputRentalPrice());

        int rentalPeopleMax = Integer.parseInt(inputRentalPeopleMax());

        String styleRental = getStyleRental();

        String standardVilla = inputStandard();

        double areaPool = Double.parseDouble(inputAreaPool());

        int floor = Integer.parseInt(inputFloor());

        Vila vila = new Vila(id, name, areaUse, rentalPrice, rentalPeopleMax, styleRental, standardVilla, areaPool, floor);
        villaList.put(vila, 0);
        writeFileVilla();
        System.out.println("Đã thêm mới thành công");
    }

    public void writeFileVilla() {
        Set<Vila> vilaSet = villaList.keySet();
        for (Vila vila : vilaSet) {
            String line = vila.getIdFacility() + "," + vila.getNamService() + "," + vila.getAreaUse() + "," + vila.getRentalPrice() + ","
                    + vila.getRentalPeopleMax() + "," + vila.getStyleRental() + "," + vila.getStandardVilla() + "," + vila.getAreaPool() + ","
                    + vila.getFloor() + "," + villaList.get(vila);
            ReadAndWrite.writeFile("src\\casestudy\\data\\villa.csv", line);
        }
    }

    public void readFileVilla() {
        Set<Vila> vilaSet = villaList.keySet();
        List<String[]> listStr = ReadAndWrite.readFile("src\\casestudy\\data\\villa.csv");
        villaList.clear();
        for (String[] item : listStr) {
            if (item.length != 1) {
                Vila vila = new Vila(item[0], item[1], Double.parseDouble(item[2]), Integer.parseInt(item[3]), Integer.parseInt(item[4]), item[5],
                        item[6], Double.parseDouble(item[7]), Integer.parseInt(item[8]));
                villaList.put(vila, Integer.parseInt(item[9]));
            }
        }
    }

    private String inputIdVilla() {
        System.out.println("Nhập id, mã dịch vụ: ");
        return RegexData.regexStr(REGEX_ID_VILLA);
    }

    private String inputIdHouse() {
        System.out.println("Nhập id, mã dịch vụ: ");
        return RegexData.regexStr1(REGEX_ID_HOUSE);
    }

    private String inputIdRoom() {
        System.out.println("Nhập id, mã dịch vụ: ");
        return RegexData.regexStr2(REGEX_ID_ROOM);
    }

    private String inputName() {
        System.out.println("Nhập tên dịch vụ: ");
        return RegexData.regexStr3(REGEX_STR);
    }

    private String inputRentalPrice() {
        System.out.println("Nhập giá tiền: ");
        return RegexData.regexStr6(REGEX_INT);
    }

    private String inputAreaUse() {
        System.out.println("Nhập diện tích: ");
        return RegexData.regexStr5(REGEX_AREA);
    }

    private String inputRentalPeopleMax() {
        System.out.println("Nhập số lượng người: ");
        return RegexData.regexStr4(REGEX_AMOUNT);
    }

    private String inputStandard() {
        System.out.println("Nhập tiêu chuẩn dịch vụ: ");
        return RegexData.regexStr3(REGEX_STR);
    }

    private String inputAreaPool() {
        System.out.println("Nhập diện tích hồ bơi: ");
        return RegexData.regexStr5(REGEX_AREA);
    }

    private String inputFloor() {
        System.out.println("Nhập số tầng: ");
        return RegexData.regexStr6(REGEX_INT);
    }


    @Override
    public void addNewHouse() {
        String id = inputIdHouse();

        String name = inputName();

        double areaUse = Double.parseDouble(inputAreaUse());

        int rentalPrice = Integer.parseInt(inputRentalPrice());

        int rentalPeopleMax = Integer.parseInt(inputRentalPeopleMax());

        String styleRental = getStyleRental();

        String standardRoom = inputStandard();

        int floor = Integer.parseInt(inputFloor());

        House house = new House(id, name, areaUse, rentalPrice, rentalPeopleMax, styleRental, standardRoom, floor);
        houseList.put(house, 0);
        writeFileHouse();
        System.out.println("Đã thêm mới thành công");
    }

    public void writeFileHouse() {
        Set<House> houseSet = houseList.keySet();
        for (House house : houseSet) {
            String line = house.getIdFacility() + "," + house.getNamService() + "," + house.getAreaUse() + "," + house.getRentalPrice() + "," + house.getRentalPeopleMax()
                    + "," + house.getStyleRental() + "," + house.getStandardRoom() + "," + house.getFloor() + "," + houseList.get(house);
            ReadAndWrite.writeFile("src\\casestudy\\data\\house.csv", line);
        }
    }

    public void readFileHouse() {
        Set<House> houseSet = houseList.keySet();
        List<String[]> list = ReadAndWrite.readFile("src\\casestudy\\data\\house.csv");
        houseList.clear();
        for (String[] strings : list) {
            if (strings.length != 1) {
                House house = new House(strings[0], strings[1], Double.parseDouble(strings[2]), Integer.parseInt(strings[3]), Integer.parseInt(strings[4]), strings[5],
                        strings[6], Integer.parseInt(strings[7]));
                houseList.put(house, Integer.parseInt(strings[8]));
            }
        }
    }

    @Override
    public void addNewRoom() {
        String id = inputIdRoom();

        String name = inputName();

        double areaUse = Double.parseDouble(inputAreaUse());

        int rentalPrice = Integer.parseInt(inputRentalPrice());

        int rentalPeopleMax = Integer.parseInt(inputRentalPeopleMax());

        String styleRental = getStyleRental();

        String freeService = inputStandard();

        Room room = new Room(id, name, areaUse, rentalPrice, rentalPeopleMax, styleRental, freeService);
        roomList.put(room, 0);
        writeFileRoom();
        System.out.println("Đã thêm mới thành công");
    }

    public void writeFileRoom() {
        Set<Room> roomSet = roomList.keySet();
        for (Room room : roomSet) {
            String line = room.getIdFacility() + "," + room.getNamService() + "," + room.getAreaUse() + "," + room.getRentalPrice() + "," + room.getRentalPeopleMax() + "," +
                    room.getStyleRental() + "," + room.getFreeService() + "," + roomList.get(room);
            ReadAndWrite.writeFile("src\\casestudy\\data\\room.csv", line);
        }
    }

    public void readFileRoom() {
        List<String[]> list1 = ReadAndWrite.readFile("src\\casestudy\\data\\room.csv");
        roomList.clear();
        for (String[] string : list1) {
            if (string.length != 1) {
                Room room = new Room(string[0], string[1], Double.parseDouble(string[2]), Integer.parseInt(string[3]), Integer.parseInt(string[4]), string[5], string[6]);
                roomList.put(room, Integer.parseInt(string[7]));
            }
        }
    }
}
