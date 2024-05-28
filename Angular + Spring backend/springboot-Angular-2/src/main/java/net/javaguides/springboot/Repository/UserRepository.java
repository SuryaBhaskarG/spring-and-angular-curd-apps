package net.javaguides.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import net.javaguides.springboot.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
