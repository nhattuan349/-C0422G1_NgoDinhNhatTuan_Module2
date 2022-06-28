package casestudy2.models.facility;

public class Room extends Facility{
    private String freeSevice;

    public Room() {

    }

    public Room(String freeSevice) {
        this.freeSevice = freeSevice;
    }

    public Room(String idFacility, String nameService, String areaService, int rentalPrice, int rentalPeopleMax, String styleRental, String freeSevice) {
        super(idFacility, nameService, areaService, rentalPrice, rentalPeopleMax, styleRental);
        this.freeSevice = freeSevice;
    }

    public String getFreeSevice() {
        return freeSevice;
    }

    public void setFreeSevice(String freeSevice) {
        this.freeSevice = freeSevice;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeSevice='" + freeSevice + '\'' +
                '}';
    }
}
