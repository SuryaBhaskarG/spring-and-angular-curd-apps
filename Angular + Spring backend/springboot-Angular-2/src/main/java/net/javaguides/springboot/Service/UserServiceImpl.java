package net.javaguides.springboot.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.Entity.User;
import net.javaguides.springboot.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService 
{
	@Autowired
	private UserRepository userRepository;

	@Override
	public User addUser(User user) 
	{
		return userRepository.save(user) ;
	}

	@Override
	public List<User> getUsers() {
		return userRepository.findAll();
	}

	@Override
	public User getUserById(Long id) {
		return  userRepository.findById(id).get();
	}
	
}
