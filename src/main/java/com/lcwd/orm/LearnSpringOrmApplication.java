package com.lcwd.orm;

import com.lcwd.orm.entities.Laptop;
import com.lcwd.orm.entities.Student;
import com.lcwd.orm.entities.User;
import com.lcwd.orm.repositories.LaptopRepository;
import com.lcwd.orm.repositories.StudentRepository;
import com.lcwd.orm.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class LearnSpringOrmApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private LaptopRepository laptopRepository;
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

//		userService.deleteUser(1);


		//ONE TO ONE MAPPING

//		Student student = new Student();
//		student.setStudentName("Vinay Maurya");
//		student.setAbout("I am business man");
//		student.setStudentId(42);
//
//		Laptop laptop = new Laptop();
//		laptop.setModelNumber("1333");
//		laptop.setBrand("ASUS");
//		laptop.setLaptopId(2223);
//		student.setLaptop(laptop);
//		laptop.setStudent(student);
//
//		Student save = studentRepository.save(student);
//		logger.info("Saved student: {}", save.getStudentName());
////		Laptop save1 = laptopRepository.save(laptop);
////		logger.info("Saved laptop : {}", save1.getBrand());
//
//		//manually we have to save the laptop // jab ham student save karenge to laptop bhi save ho jaye apne aap
//		//or we have to use the property known as the Cascade


		Student student = studentRepository.findById(42).get();
		logger.info("Name is {}", student.getStudentName());
		Laptop laptop = student.getLaptop();
		logger.info("Laptop {}, {}", laptop.getBrand(), laptop.getModelNumber());
	}
}
