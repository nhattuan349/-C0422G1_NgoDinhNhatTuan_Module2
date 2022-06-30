package ss16_IO_Text_File.LyThuyet.castudymodul2.services;

import castudymodul2.exeption.*;
import castudymodul2.models.Facility;
import castudymodul2.models.House;
import castudymodul2.models.Room;
import castudymodul2.models.Villa;
import castudymodul2.services.FacilityService;
import castudymodul2.until.FacilityRentalType;
import castudymodul2.until.ReadAndWriteFileCsv;
import castudymodul2.regex.RegexCasestudy;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceIpl implements FacilityService {

    final String PATH_VILLA = "src\\castudymodul2\\data\\villa_file.csv";
    final String PATH_HOUSE = "src\\castudymodul2\\data\\house_file.csv";
    final String PATH_ROOM = "src\\castudymodul2\\data\\room_file.csv";

    private static Scanner scanner = new Scanner(System.in);

    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Map<Villa, Integer> villaIntegerMap = new LinkedHashMap<>();
    private static Map<House, Integer> houseIntegerMap = new LinkedHashMap<>();
    private static Map<Room, Integer> roomIntegerMap = new LinkedHashMap<>();


    @Override
    public void display() {
        List<String[]> list;
        /**
         * Villa....
         */
        list = ReadAndWriteFileCsv.readFile(PATH_VILLA);
        facilityIntegerMap.clear();
        for (String[] item : list) {
            String serviceName = item[0];
            String usableArea = item[1];
            String rentalCosts = item[2];
            String peopleMaximum = item[3];
            String rentalType = item[4];
            String romStandard = item[5];
            String poolArea = item[6];
            String numberFloors = item[7];
            int num = Integer.parseInt(item[8]);

            Villa villa = new Villa(serviceName, usableArea, rentalCosts, peopleMaximum,
                    rentalType, romStandard, poolArea, numberFloors);
            facilityIntegerMap.put(villa, num);

        }

        /**
         * House
         */
//        list.clear();
        list = ReadAndWriteFileCsv.readFile(PATH_HOUSE);
        for (String[] item : list) {
            String serviceName = item[0];
            String usableArea = item[1];
            String rentalCosts = item[2];
            String peopleMaximum = item[3];
            String rentalType = item[4];
            String romStandard = item[5];
            String numberFloors = item[6];
            int num = Integer.parseInt(item[7]);

            House house = new House(serviceName, usableArea, rentalCosts, peopleMaximum,
                    rentalType, romStandard, numberFloors);
            facilityIntegerMap.put(house, num);

        }

        /**
         * Room
         */
//        list.clear();
        list = ReadAndWriteFileCsv.readFile(PATH_ROOM);
        for (String[] item : list) {
            String serviceName = item[0];
            String usableArea = item[1];
            String rentalCosts = item[2];
            String peopleMaximum = item[3];
            String rentalType = item[4];
            String serviceFree = item[5];
            int num = Integer.parseInt(item[6]);

            Room room = new Room(serviceName, usableArea, rentalCosts,
                    peopleMaximum, rentalType, serviceFree);
            facilityIntegerMap.put(room, num);
        }

        for (Map.Entry<Facility, Integer> item : facilityIntegerMap.entrySet()) {
            System.out.println(item.getKey() + " SO LAN SU DUNG " + item.getValue());
        }
    }
    @Override

    public void add() {
        List<String[]> list = ReadAndWriteFileCsv.readFile(PATH_VILLA);
        /**
         * Villa....
         */
        for (String[] item : list) {
            String serviceName = item[0];
            String usableArea = item[1];
            String rentalCosts = item[2];
            String peopleMaximum = item[3];
            String rentalType = item[4];
            String romStandard = item[5];
            String poolArea = item[6];
            String numberFloors = item[7];
            int num = Integer.parseInt(item[8]);

            Villa villa = new Villa(serviceName, usableArea, rentalCosts, peopleMaximum,
                    rentalType, romStandard, poolArea, numberFloors);
            villaIntegerMap.put(villa, num);
        }

        /**
         * House
         */
        list = ReadAndWriteFileCsv.readFile(PATH_HOUSE);

        for (String[] item : list) {
            String serviceName = item[0];
            String usableArea = item[1];
            String rentalCosts = item[2];
            String peopleMaximum = item[3];
            String rentalType = item[4];
            String romStandard = item[5];
            String numberFloors = item[6];
            int num = Integer.parseInt(item[7]);

            House house = new House(serviceName, usableArea, rentalCosts, peopleMaximum,
                    rentalType, romStandard, numberFloors);
            houseIntegerMap.put(house, num);

        }

        /**
         * Room
         */
        list = ReadAndWriteFileCsv.readFile(PATH_ROOM);
        for (String[] item : list) {
            String serviceName = item[0];
            String usableArea = item[1];
            String rentalCosts = item[2];
            String peopleMaximum = item[3];
            String rentalType = item[4];
            String serviceFree = item[5];
            int num = Integer.parseInt(item[6]);

            Room room = new Room(serviceName, usableArea, rentalCosts,
                    peopleMaximum, rentalType, serviceFree);
            roomIntegerMap.put(room, num);
        }

        do {
            System.out.println("---Chọn kiểu muốn thêm---\n" +
                    "1.Add villa\n" +
                    "2.Add house\n" +
                    "3.Add room\n" +
                    "4.Thoát\n" +
                    "Nhập để chọn: ");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    String serviceName;
                    do {
                        try {
                            System.out.print("Nhập tên dịch vụ: bát đầu bằng VSVL-XXXX với X là số từ 0-9 ");
                            serviceName = scanner.nextLine();
                            if (RegexCasestudy.codeVilla(serviceName)) {
                                break;
                            } else throw new VillaException("Sai dinh dang");
                        } catch (VillaException e) {
                            e.printStackTrace();
                        }
                    } while (true);

                    String useArea;
                    do {
                        try {
                            System.out.print("Nhập diện tích sử dụng: là số nguyên ");
                            useArea = scanner.nextLine();
                            if (RegexCasestudy.intNum(useArea)) {
                                break;
                            } else throw new AreaException("SAI DINH DANG");
                        } catch (AreaException e) {
                            e.printStackTrace();
                        }
                    } while (true);

                    String costs;
                    do {
                        try {
                            System.out.print("Nhập chi phí thuê: ");
                            costs = scanner.nextLine();
                            if (RegexCasestudy.intNum(costs)) {
                                break;
                            } else throw new AmuontException("SAI DINH DANG");
                        } catch (AmuontException e) {
                            e.printStackTrace();
                        }
                    } while (true);

                    String peopleMax;
                    do {
                        try {
                            System.out.print("Nhập số người ở tối đa: ");
                            peopleMax = scanner.nextLine();
                            if (RegexCasestudy.peopleMax(peopleMax)) {
                                break;
                            } else throw new PeopleException("SAI DINH DANG");
                        } catch (PeopleException e) {
                            e.printStackTrace();
                        }
                    } while (true);

                    String romStandard;
                    do {
                        try {
                            System.out.print("Nhập tiêu chuẩn phòng viet hoa chu cai dau : ");
                            romStandard = scanner.nextLine();
                            if (RegexCasestudy.nameService(romStandard)) {
                                break;
                            } else throw new RoomStandardException("Sai dinh dang");
                        } catch (RoomStandardException e) {
                            e.printStackTrace();
                        }
                    } while (true);

                    String poolArea;
                    do {
                        try {
                            System.out.print("Nhập diện tích hồ bơi: ");
                            poolArea = scanner.nextLine();
                            if (RegexCasestudy.poolArea(poolArea)) {
                                break;
                            } else throw new AreaException("Sai dinh dang");
                        } catch (AreaException e) {
                            e.printStackTrace();
                        }
                    } while (true);

                    String numFloors;
                    do {
                        try {
                            System.out.print("Nhập số tầng: ");
                            numFloors = scanner.nextLine();
                            if (RegexCasestudy.intNum(numFloors)) {
                                break;
                            } else throw new FloorsException("SAI DINH DANG");
                        } catch (FloorsException e) {
                            e.printStackTrace();
                        }
                    } while (true);

                    Villa villa = new Villa(serviceName, useArea, costs, peopleMax,
                            FacilityRentalType.rentalType(), romStandard, poolArea, numFloors);
                    villaIntegerMap.put(villa, 0);

                    String str = "";
                    for (Map.Entry<Villa, Integer> item : villaIntegerMap.entrySet()) {
                        String line = item.getKey().cover() + "," + item.getValue();
                        str += line + "\n";
                    }

                    ReadAndWriteFileCsv.writeFile(PATH_VILLA, str);
                    System.out.println("Đã thêm mới thành công");
                    break;
                case "2":
                    String serviceName1;
                    do {
                        try {
                            System.out.print("Nhập tên dịch vụ: bát đầu bằng VSHO-XXXX với X là số từ 0-9 ");
                            serviceName1 = scanner.nextLine();
                            if (RegexCasestudy.codeVilla(serviceName1)) {
                                break;
                            } else throw new VillaException("Sai dinh dang");
                        } catch (VillaException e) {
                            e.printStackTrace();
                        }
                    } while (true);

                    String useArea1;
                    do {
                        try {
                            System.out.print("Nhập diện tích sử dụng: là số nguyên ");
                            useArea1 = scanner.nextLine();
                            if (RegexCasestudy.intNum(useArea1)) {
                                break;
                            } else throw new AreaException("SAI DINH DANG");
                        } catch (AreaException e) {
                            e.printStackTrace();
                        }
                    } while (true);

                    String costs1;
                    do {
                        try {
                            System.out.print("Nhập chi phí thuê: ");
                            costs1 = scanner.nextLine();
                            if (RegexCasestudy.intNum(costs1)) {
                                break;
                            } else throw new AmuontException("SAI DINH DANG");
                        } catch (AmuontException e) {
                            e.printStackTrace();
                        }
                    } while (true);

                    String peopleMax1;
                    do {
                        try {
                            System.out.print("Nhập số người ở tối đa: ");
                            peopleMax1 = scanner.nextLine();
                            if (RegexCasestudy.peopleMax(peopleMax1)) {
                                break;
                            } else throw new PeopleException("SAI DINH DANG");
                        } catch (PeopleException e) {
                            e.printStackTrace();
                        }
                    } while (true);

                    String romStandard1;
                    do {
                        try {
                            System.out.print("Nhập tiêu chuẩn phòng viet hoa chu cai dau : ");
                            romStandard1 = scanner.nextLine();
                            if (RegexCasestudy.nameService(romStandard1)) {
                                break;
                            } else throw new RoomStandardException("Sai dinh dang");
                        } catch (RoomStandardException e) {
                            e.printStackTrace();
                        }
                    } while (true);

                    String poolArea1;
                    do {
                        try {
                            System.out.print("Nhập diện tích hồ bơi: ");
                            poolArea1 = scanner.nextLine();
                            if (RegexCasestudy.poolArea(poolArea1)) {
                                break;
                            } else throw new AreaException("Sai dinh dang");
                        } catch (AreaException e) {
                            e.printStackTrace();
                        }
                    } while (true);

                    String numFloors1;
                    do {
                        try {
                            System.out.print("Nhập số tầng: ");
                            numFloors1 = scanner.nextLine();
                            if (RegexCasestudy.intNum(numFloors1)) {
                                break;
                            } else throw new FloorsException("SAI DINH DANG");
                        } catch (FloorsException e) {
                            e.printStackTrace();
                        }
                    } while (true);

                    House house = new House(serviceName1, useArea1, costs1, peopleMax1, FacilityRentalType.rentalType(), romStandard1, numFloors1);
                    houseIntegerMap.put(house, 0);

                    String str1 = "";
                    for (Map.Entry<House, Integer> item : houseIntegerMap.entrySet()) {
                        String line = item.getKey().cover() + "," + item.getValue();
                        str1 += line + "\n";
                    }
                    ReadAndWriteFileCsv.writeFile(PATH_HOUSE, str1);
                    System.out.println("Đã thêm mới thành công");

                    break;
                case "3":
                    String serviceName2;
                    do {
                        try {
                            System.out.print("Nhập tên dịch vụ: bát đầu bằng VSRO-XXXX với X là số từ 0-9 ");
                            serviceName2 = scanner.nextLine();
                            if (RegexCasestudy.codeVilla(serviceName2)) {
                                break;
                            } else throw new VillaException("Sai dinh dang");
                        } catch (VillaException e) {
                            e.printStackTrace();
                        }
                    } while (true);

                    String useArea2;
                    do {
                        try {
                            System.out.print("Nhập diện tích sử dụng: là số nguyên ");
                            useArea2 = scanner.nextLine();
                            if (RegexCasestudy.intNum(useArea2)) {
                                break;
                            } else throw new AreaException("SAI DINH DANG");
                        } catch (AreaException e) {
                            e.printStackTrace();
                        }
                    } while (true);

                    String costs2;
                    do {
                        try {
                            System.out.print("Nhập chi phí thuê: ");
                            costs2 = scanner.nextLine();
                            if (RegexCasestudy.intNum(costs2)) {
                                break;
                            } else throw new AmuontException("SAI DINH DANG");
                        } catch (AmuontException e) {
                            e.printStackTrace();
                        }
                    } while (true);

                    String peopleMax2;
                    do {
                        try {
                            System.out.print("Nhập số người ở tối đa: ");
                            peopleMax2 = scanner.nextLine();
                            if (RegexCasestudy.peopleMax(peopleMax2)) {
                                break;
                            } else throw new PeopleException("SAI DINH DANG");
                        } catch (PeopleException e) {
                            e.printStackTrace();
                        }
                    } while (true);

                    String freeService;
                    do {
                        try {
                            System.out.print("Nhập dịch vụ miễn phí: ");
                            freeService = scanner.nextLine();
                            if (RegexCasestudy.nameService(freeService)) {
                                break;
                            } else throw new ServiceException("SAI DINH DANG");
                        } catch (ServiceException e) {
                            e.printStackTrace();
                        }
                    } while (true);

                    Room room = new Room(serviceName2, useArea2, costs2, peopleMax2, FacilityRentalType.rentalType(), freeService);
                    roomIntegerMap.put(room, 0);

                    String line = "";
                    for (Map.Entry<Room, Integer> item : roomIntegerMap.entrySet()) {
                        line += item.getKey().cover() + "," + item.getValue() + "\n";

                    }
                    ReadAndWriteFileCsv.writeFile(PATH_ROOM, line);
                    System.out.println("Đã thêm mới thành công");

                    break;
                case "4":
                    System.out.println("THOÁT CHỌN");
                    return;
                default:
                    System.err.println("ChƯƠNG TRÌNH YÊU CẦU CHỌN 1---4");
            }
        } while (true);
    }

    @Override
    public void update() {

    }

    @Override
    public void displayMaintain() {
        List<String[]> list;
        /**
         * Villa....
         */
        list = ReadAndWriteFileCsv.readFile(PATH_VILLA);
        facilityIntegerMap.clear();
        for (String[] item : list) {
            String serviceName = item[0];
            String usableArea = item[1];
            String rentalCosts = item[2];
            String peopleMaximum = item[3];
            String rentalType = item[4];
            String romStandard = item[5];
            String poolArea = item[6];
            String numberFloors = item[7];
            int num = Integer.parseInt(item[8]);

            Villa villa = new Villa(serviceName, usableArea, rentalCosts, peopleMaximum,
                    rentalType, romStandard, poolArea, numberFloors);
            facilityIntegerMap.put(villa, num);

        }

        /**
         * House
         */
        list.clear();
        list = ReadAndWriteFileCsv.readFile(PATH_HOUSE);
        for (String[] item : list) {
            String serviceName = item[0];
            String usableArea = item[1];
            String rentalCosts = item[2];
            String peopleMaximum = item[3];
            String rentalType = item[4];
            String romStandard = item[5];
            String numberFloors = item[6];
            int num = Integer.parseInt(item[7]);

            House house = new House(serviceName, usableArea, rentalCosts, peopleMaximum,
                    rentalType, romStandard, numberFloors);
            facilityIntegerMap.put(house, num);

        }

        /**
         * Room
         */
        list.clear();
        list = ReadAndWriteFileCsv.readFile(PATH_ROOM);
        for (String[] item : list) {
            String serviceName = item[0];
            String usableArea = item[1];
            String rentalCosts = item[2];
            String peopleMaximum = item[3];
            String rentalType = item[4];
            String serviceFree = item[5];
            int num = Integer.parseInt(item[6]);

            Room room = new Room(serviceName, usableArea, rentalCosts,
                    peopleMaximum, rentalType, serviceFree);
            facilityIntegerMap.put(room, num);
        }

        for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
            if (element.getValue() >= 5) {
                System.err.println("Đang kiểm tra....\n" + element.getKey() + "\n" +
                        " so lan da su dung \n " +
                        element.getValue() +
                        "\n--- Quá tải cần bảo trì ");
            }
        }
    }
}
