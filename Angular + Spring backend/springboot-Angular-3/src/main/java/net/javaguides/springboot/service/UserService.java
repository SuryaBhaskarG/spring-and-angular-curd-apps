package net.javaguides.springboot.service;

import java.util.List;
import net.javaguides.springboot.model.User;



public interface UserService {

	public User addUser(User user);

    public List<User> getUser();

    public User getUserByid(int id);

    public User updateUser(int id , User user);

    public void deleteUser(int id);
	
}
