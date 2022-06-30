package ss16_IO_Text_File.LyThuyet.casestudy.models.facility;

import casestudy.models.facility.Facility;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String idFacility, String namService, double areaUse, int rentalPrice, int rentalPeopleMax, String styleRental, String freeService) {
        super(idFacility, namService, areaUse, rentalPrice, rentalPeopleMax, styleRental);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                super.toString() +
                "freeService='" + freeService + '\'' +
                '}';
    }
}
