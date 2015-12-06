package vn.buitanhung.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.buitanhung.jpa.entity.Blog;
import vn.buitanhung.jpa.entity.Role;
import vn.buitanhung.jpa.entity.User;

public interface BlogRepository extends JpaRepository<Blog, Integer>{
	
	List<Blog> findByUser(User user);
}
