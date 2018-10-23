package com.example.springapp.springapp;

import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.springapp.models.Users;
import com.example.springapp.springapp.repositories.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/")
	public String welcome() {
		return "Welcome";
	}
	
	@GetMapping("/users")
	public List<Users> getAllUsers(Users users){
		return userRepository.findAll();
	}
	
	@GetMapping("users/{_id}")
	public Users getUserById(@PathVariable ObjectId _id) {
		return userRepository.findBy_id(_id);
	}
	
	@PostMapping("/create-user")
	public Users createUser(@RequestBody Users user) {
		user.setBirthDate(new Date());
		user.setCreatedAt(new Date());
		user.setUpdateAt(new Date());
		userRepository.save(user);
		return user;
	}
	
	@PutMapping("/update-user/{_id}")
	public Users updateUser(@PathVariable ObjectId _id, @RequestBody Users user) {
		user.set_id(_id);
		user.setUpdateAt(new Date());
		userRepository.save(user);
		return user;
	}
	
	@DeleteMapping("/delete-user/{_id}")
	public void deleteUser(@PathVariable ObjectId _id) {
		userRepository.delete(userRepository.findBy_id(_id));
	}
}
