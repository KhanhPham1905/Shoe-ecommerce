package com.nhom10.application.service;


import com.nhom10.application.entity.User;
import com.nhom10.application.model.dto.UserDTO;
import com.nhom10.application.model.request.ChangePasswordRequest;
import com.nhom10.application.model.request.CreateUserRequest;
import com.nhom10.application.model.request.UpdateProfileRequest;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<UserDTO> getListUsers();

    Page<User> adminListUserPages(String fullName, String phone, String email, Integer page);

    User createUser(CreateUserRequest createUserRequest);

    void changePassword(User user, ChangePasswordRequest changePasswordRequest);

    User updateProfile(User user, UpdateProfileRequest updateProfileRequest);
}
