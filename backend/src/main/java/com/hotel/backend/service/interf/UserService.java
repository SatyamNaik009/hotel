package com.hotel.backend.service.interf;

import com.hotel.backend.dto.LoginRequestDto;
import com.hotel.backend.dto.Response;
import com.hotel.backend.entity.User;

public interface UserService {
    Response register(User user);

    Response login(LoginRequestDto loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);
}
