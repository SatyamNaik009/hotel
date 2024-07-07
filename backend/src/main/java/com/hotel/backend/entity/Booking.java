package com.hotel.backend.entity;

import com.hotel.backend.dto.RoomDto;
import com.hotel.backend.dto.UserDto;
import jakarta.persistence.*;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name="bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message="check in date is required")
    private LocalDate checkInDate;
    @Future(message="check out date must be in future")
    private LocalDate checkOutDate;

    @Min(value=1,message="no of adults must be at least 1")
    private int numOfAdults;
    @Min(value=0,message="no of adults must not be negative")
    private int numOfChildren;

    private int totalNumOfGuest;
    private String bookingConfirmationCode;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="user_id")
    private User user;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="room_id")
    private Room room;

    public void calculateTotalNumberOfGuests(){
        this.totalNumOfGuest=this.numOfAdults+this.numOfChildren;
    }

    public void setNumOfAdults(@Min(value = 1, message = "no of adults must be at least 1") int numOfAdults) {
        this.numOfAdults = numOfAdults;
        calculateTotalNumberOfGuests();
    }

    public void setNumOfChildren(@Min(value = 0, message = "no of adults must not be negative") int numOfChildren) {
        this.numOfChildren = numOfChildren;
        calculateTotalNumberOfGuests();
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", checkInDate=" + checkInDate +
                ", checkOutDate=" + checkOutDate +
                ", numOfAdults=" + numOfAdults +
                ", numOfChildren=" + numOfChildren +
                ", totalNumOfGuest=" + totalNumOfGuest +
                ", bookingConfirmationCode='" + bookingConfirmationCode + '\'' +
                '}';
    }
}
