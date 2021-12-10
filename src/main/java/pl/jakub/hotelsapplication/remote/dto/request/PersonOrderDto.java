package pl.jakub.hotelsapplication.remote.dto.request;

public class PersonOrderDto {
    private String name;
    private String phone;
    private String adress;
    private String floor;

    public PersonOrderDto() {
    }

    public PersonOrderDto(String name, String phone, String adress, String floor) {
        this.name = name;
        this.phone = phone;
        this.adress = adress;
        this.floor = floor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }
}
