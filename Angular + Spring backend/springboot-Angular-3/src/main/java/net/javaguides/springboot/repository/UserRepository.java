package net.javaguides.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import net.javaguides.springboot.model.User;


public interface UserRepository  extends CrudRepository<User, Integer>
{
	
}