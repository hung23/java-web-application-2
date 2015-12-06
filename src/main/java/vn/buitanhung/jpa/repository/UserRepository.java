package vn.buitanhung.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.buitanhung.jpa.entity.Role;
import vn.buitanhung.jpa.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByName(String name);

}
