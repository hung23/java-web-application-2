package vn.buitanhung.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.buitanhung.jpa.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{

	Role findByName(String name);



}
