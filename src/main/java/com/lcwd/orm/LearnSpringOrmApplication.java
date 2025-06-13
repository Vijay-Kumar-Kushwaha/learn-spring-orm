package com.lcwd.orm;

import com.lcwd.orm.entities.*;
import com.lcwd.orm.repositories.CategoryRepo;
import com.lcwd.orm.repositories.LaptopRepository;
import com.lcwd.orm.repositories.ProductRepo;
import com.lcwd.orm.repositories.StudentRepository;
import com.lcwd.orm.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class LearnSpringOrmApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private ProductRepo productRepo;

	@Autowired
	private CategoryRepo categoryRepo;

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

//
//		Student student = studentRepository.findById(42).get();
//		logger.info("Name is {}", student.getStudentName());
//		Laptop laptop = student.getLaptop();
//		logger.info("Laptop {}, {}", laptop.getBrand(), laptop.getModelNumber());


		//ONT TO MANY

//		Student student = new Student();
//		student.setStudentName("Pawan kushwaha");
//		student.setAbout("I am Scientist");
//		student.setStudentId(52);
//
//		Address a1 = new Address();
//		a1.setAddressId(131);
//		a1.setStreet("235/235");
//		a1.setCity("Ballia");
//		a1.setCountry("INDIA");
//		a1.setStudent(student);
//
//		Address a2 = new Address();
//		a2.setAddressId(133);
//		a2.setStreet("223/255");
//		a2.setCity("Singrauli");
//		a2.setCountry("INDIA");
//		a2.setStudent(student);
//
//		List<Address> addressList = new ArrayList<>();
//		addressList.add(a1);
//		addressList.add(a2);
//		student.setAddressList(addressList);
//		Student save = studentRepository.save(student);
//		logger.info("student created : with Address ");

//		Product product1 = new Product();
//		product1.setpId("pid1");
//		product1.setProductName("Iphone 14");
//
//		Product product2 = new Product();
//		product2.setpId("pid2");
//		product2.setProductName("Samsung s24 ultra");
//
//		Product product3 = new Product();
//		product3.setpId("pid3");
//		product3.setProductName(" Samsung TV");
//
//		Category category1 = new Category();
//		category1.setcId("cid1");
//		category1.setTitle("Electronics");
//
//		Category category2 = new Category();
//		category2.setcId("cid2");
//		category2.setTitle("Mobile Phone");
//
//		List<Product> category1Products = category1.getProducts();
//		category1Products.add(product1);
//		category1Products.add(product2);
//		category1Products.add(product3);
//
//		List<Product> category2Products =category2.getProducts();
//		category2Products.add(product1);
//		category2Products.add(product2);
//
//		categoryRepo.save(category1);
//		categoryRepo.save(category2);
//


//		Category category1 = categoryRepo.findById("cid1").get();
//		System.out.println(category1.getProducts().size());
//
//		Category category2 = categoryRepo.findById("cid2").get();
//		System.out.println(category2.getProducts().size());

//		Product product = productRepo.findById("pid1").get();
//		System.out.println(product.getCategories().size());

//		Optional<Product> byProductName = productRepo.findByProductName("Iphone 14");
//		System.out.println(byProductName.isPresent());
//		System.out.println(byProductName.get().getProductName());
//		System.out.println("++++++++++++++++++++++++++++++++++++++++");
//
//		List<Product> tra = productRepo.findByProductNameEndingWith("tra");
//		tra.forEach(product ->{
//			System.out.println(product.getProductName());
//		});
//
//		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
//
//		List<Product> sung = productRepo.findByProductNameContaining("sung");
//		sung.forEach(product->System.out.println(product.getProductName()));
//
//		System.out.println("+++++++++++++++++++++++++++++++++++");
//
//		List<Product> samsungS24Ultra = productRepo.findByProductNameIn(Arrays.asList("Iphone 14", "Samsung s24 ultra"));
//		samsungS24Ultra.forEach(product -> System.out.println(product.getProductName()));


//		List<Product> allProductWhileLearningJPA = productRepo.getAllProductWhileLearningJPA();
//		allProductWhileLearningJPA.forEach(product -> System.out.println(product.getProductName()));
//

		productRepo.getAllActiveProducts().forEach(product -> System.out.println(product.getProductName()));
	}
}
