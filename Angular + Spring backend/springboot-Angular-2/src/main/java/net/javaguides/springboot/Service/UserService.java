package net.javaguides.springboot.Service;

import java.util.List;

import net.javaguides.springboot.Entity.User;

public interface UserService {

	public User addUser(User user);

	public List<User> getUsers();

	public User getUserById(Long id);



}
