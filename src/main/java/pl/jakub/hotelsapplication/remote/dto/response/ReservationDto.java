package pl.jakub.hotelsapplication.remote.dto.response;

import pl.jakub.hotelsapplication.domain.model.OrderStatusType;
import pl.jakub.hotelsapplication.remote.dto.request.HotelsDto;
import pl.jakub.hotelsapplication.remote.dto.request.PersonOrderDto;

public class ReservationDto {
    private Integer id;
    private OrderStatusType status;
    private HotelsDto hotel;
    private PersonOrderDto person;

    public ReservationDto() {
    }

    public ReservationDto(Integer id, String status, HotelsDto hotel, PersonOrderDto person) {
        this.id = id;
        this.status = status;
        this.hotel = hotel;
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public HotelsDto getHotel() {
        return hotel;
    }

    public void setHotel(HotelsDto hotel) {
        this.hotel = hotel;
    }

    public PersonOrderDto getPerson() {
        return person;
    }

    public void setPerson(PersonOrderDto person) {
        this.person = person;
    }
}
