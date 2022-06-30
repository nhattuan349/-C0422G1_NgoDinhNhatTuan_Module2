package ss16_IO_Text_File.LyThuyet.casestudy.models.facility;

import casestudy.models.facility.Facility;

public class House extends Facility {
    private String standardRoom;
    private int Floor;

    public House() {
    }

    public House(String idFacility, String namService, double areaUse, int rentalPrice, int rentalPeopleMax, String styleRental, String standardRoom, int floor) {
        super(idFacility, namService, areaUse, rentalPrice, rentalPeopleMax, styleRental);
        this.standardRoom = standardRoom;
        Floor = floor;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public int getFloor() {
        return Floor;
    }

    public void setFloor(int floor) {
        Floor = floor;
    }

    @Override
    public String toString() {
        return "House{" +
                super.toString() +
                "standardRoom='" + standardRoom + '\'' +
                ", Floor=" + Floor +
                '}';
    }
}
