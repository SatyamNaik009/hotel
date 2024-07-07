package com.hotel.backend.service.interf;

import com.hotel.backend.dto.Response;
import com.hotel.backend.entity.Booking;

public interface BookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);
}
