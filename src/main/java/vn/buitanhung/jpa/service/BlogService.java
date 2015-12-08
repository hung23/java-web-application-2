package vn.buitanhung.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.method.P;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import vn.buitanhung.jpa.entity.Blog;
import vn.buitanhung.jpa.entity.Item;
import vn.buitanhung.jpa.entity.User;
import vn.buitanhung.jpa.exception.RssException;
import vn.buitanhung.jpa.repository.BlogRepository;
import vn.buitanhung.jpa.repository.ItemRepository;
import vn.buitanhung.jpa.repository.UserRepository;

@Service
public class BlogService {
	
	@Autowired
	private BlogRepository blogRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ItemRepository itemRepository;
	


	public void save(String name, Blog blog) {
		User user = userRepository.findByName(name);
		blog.setUser(user);
		blogRepository.save(blog);
		
	}

	@PreAuthorize("#blog.user.name == authentication.name or hasRole('ROLE_ADMIN')")
	public void delete(@P("blog") Blog blog) {
		blogRepository.delete(blog);
		
	}

	public Blog findOne(int id) {
		return blogRepository.findOne(id);
	}

}
