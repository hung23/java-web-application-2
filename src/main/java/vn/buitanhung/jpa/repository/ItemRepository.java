package vn.buitanhung.jpa.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import vn.buitanhung.jpa.entity.Blog;
import vn.buitanhung.jpa.entity.Item;
import vn.buitanhung.jpa.entity.Role;

public interface ItemRepository extends JpaRepository<Item, Integer>{
	
	List<Item> findByBlog(Blog blog , Pageable pageable);
}
