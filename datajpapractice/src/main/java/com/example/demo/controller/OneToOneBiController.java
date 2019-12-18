package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.entity.UserDetails;
import com.example.demo.repository.UserDetailsRepository;
import com.example.demo.repository.UserRepository;

@RestController
public class OneToOneBiController {
	
	@Autowired
	UserDetailsRepository userDetailsRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/onetoone")
	public void method() {
		
		/* onetoone insert
		
		User user = new User();
		user.setUsername("rama");
		
		UserDetails userDetails = new UserDetails();
		userDetails.setPhone("11111111111");
		
		user.setUserDetails(userDetails);
		userDetails.setUser(user);
		
		userDetailsRepository.save(userDetails);
		
		
		UserDetails userDetails = userDetailsRepository.getOne(1);
		System.out.println(userDetails.getUid()+"\t"+userDetails.getPhone()+"\t"+userDetails.getUser().getId()+"\t"+userDetails.getUser().getUsername());
		
		UserDetails userDetails2 = userDetailsRepository.getOne(1);
		userDetails2.getUser().setUsername("krishna");
		userDetailsRepository.save(userDetails2);
		
		userDetailsRepository.delete(1);
		
		*/
		
		/*User user = new User();
		user.setUsername("rama");
		
		UserDetails userDetails = new UserDetails();
		userDetails.setPhone("11111111111");
		
		user.setUserDetails(userDetails);
		userDetails.setUser(user);
		
		userRepository.save(user);*/
		
		
		User user2 = userRepository.getOne(2);
		System.out.println(user2.getId()+"\t"+user2.getUsername()+"\t"+user2.getUserDetails().getUid()+"\t"+user2.getUserDetails().getPhone());
		
		User user3 = userRepository.getOne(2);
		user3.getUserDetails().setPhone("2222222222");
		userRepository.save(user3);
		
		userRepository.delete(2);
		
	}
}
