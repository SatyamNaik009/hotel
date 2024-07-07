package com.hotel.backend.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.hotel.backend.entity.Booking;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDto {

    private Long id;

    private String email;
    private String name;
    private String phoneNumber;
    private String role;
    private List<BookingDto> bookings=new ArrayList<>();
}
