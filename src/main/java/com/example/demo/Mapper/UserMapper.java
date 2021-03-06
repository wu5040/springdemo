package com.example.demo.Mapper;

import com.example.demo.bean.User;

import java.util.List;

public interface UserMapper {
    public User getById(int id);
    public boolean insert(String name);
    public List<User> getUsers();
    public boolean updateUser(User user);
    public boolean deleteUser(int id);
    public boolean deleteAllUsers();
}
