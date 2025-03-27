package com.curewell.services;

import com.curewell.entity.Role;
import com.curewell.payload.LoginDto;
import com.curewell.payload.RegisterDto;

import java.util.List;

public interface AuthService {
    String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
    String createRole(String name);
    String deleteRole(String name);
    List<Role> getAllRoles();
    String getRoleByName(String name);

}