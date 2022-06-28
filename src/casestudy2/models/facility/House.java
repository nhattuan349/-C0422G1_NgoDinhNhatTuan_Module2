package casestudy2.models.facility;

public class House extends Facility{
    private String standardRoom;
    private int Floor;

    public House() {
    }

    public House(String standardRoom, int floor) {
        this.standardRoom = standardRoom;
        Floor = floor;
    }

    public House(String idFacility, String nameService, String areaService, int rentalPrice, int rentalPeopleMax, String styleRental, String standardRoom, int floor) {
        super(idFacility, nameService, areaService, rentalPrice, rentalPeopleMax, styleRental);
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
                "standardRoom='" + standardRoom + '\'' +
                ", Floor=" + Floor +
                '}';
    }
}
