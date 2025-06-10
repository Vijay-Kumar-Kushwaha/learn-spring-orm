package com.lcwd.orm;

import com.lcwd.orm.entities.User;
import com.lcwd.orm.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class LearnSpringOrmApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	Logger logger = LoggerFactory.getLogger(LearnSpringOrmApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringOrmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		User user = new User();
//		user.setName("Durgesh");
//		user.setCity("lucknow");
//		user.setAge(23);
//		User savedUser = userService.saveUser(user);
//		System.out.println(savedUser);

//		List<User> allUsers = userService.getAllUsers();
//		logger.info("size of user list is {}", allUsers.size());
//		logger.info("users : {}", allUsers);

//		User user = userService.getUser(2);
//		logger.info("User is: {}", user);

//		User user = new User();
//		user.setName("Vijay Kushwaha");
//		user.setAge(27);
//		user.setCity("Ballia");
//
//		User updatedUser=userService.updateUser(user, 1);
//		logger.info("Updates user details : {}", updatedUser);

		userService.deleteUser(1);
	}
}
