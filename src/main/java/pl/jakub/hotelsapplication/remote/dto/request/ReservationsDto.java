package pl.jakub.hotelsapplication.remote.dto.request;

import java.util.List;

public class ReservationsDto {
    private List<HotelsDto> hotels;
    private PersonOrderDto person;

    public ReservationsDto() {
    }

    public ReservationsDto(List<HotelsDto> hotels, PersonOrderDto person) {
        this.hotels = hotels;
        this.person = person;
    }

    public List<HotelsDto> getHotels() {
        return hotels;
    }

    public void setHotels(List<HotelsDto> hotels) {
        this.hotels = hotels;
    }

    public PersonOrderDto getPerson() {
        return person;
    }

    public void setPerson(PersonOrderDto person) {
        this.person = person;
    }
}
