package com.example;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.entity.User;
import com.example.repository.UserRepository;

@SpringBootApplication
public class SpringDataJpa2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpa2Application.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
	    System.out.println(userRepository.getClass().getName());
	    
	    User u1 = new User(101,"Navya","Female",23,"Nalgonda");
	    User u2 = new User(102,"Thirupathi","Male",26,"Hyderabad");
	    User u3 = new User(103,"Navaneetha","Female",25,"Mumbai");
	    User u4 = new User(104,"Jyothsna","Female",22,"Pune");
	    User u5 = new User(105,"Sunny","Male",20,"Banglore");
	    List<User> list =Arrays.asList(u1,u2,u3,u4,u5);
	    userRepository.saveAll(list);
	    
	    
		/*
		 * Optional<User> findById = userRepository.findById(101);
		 * if(findById.isPresent()) { System.out.println(findById.get()); }
		 */
	
		/*
		 * Iterable<User> findAllById =
		 * userRepository.findAllById(Arrays.asList(101,102,103,104,105));
		 * findAllById.forEach(System.out::println);
		 */
	    
		/*
		 * Iterable<User> findAll = userRepository.findAll();
		 * findAll.forEach(System.out::println);
		 */
	    
		/*
		 * long userCount = userRepository.count(); System.out.
		 * println("Total number of Records available in the User_Details Table of USER_DATA database"
		 * +userCount);
		 */
	
		/*
		 * boolean existsById = userRepository.existsById(103);
		 * System.out.println("Record Status:"+existsById);
		 */
	    
		/*
		 * boolean existsById1 = userRepository.existsById(106);
		 * System.out.println("Record Status:"+existsById1);
		 */
	    
//	        userRepository.deleteById(105);
	    
	    
	       
		/*
		 * List<User> findByusername = userRepository.findByUsername("Navya");
		 * 
		 * findByusername.forEach(System.out::println);
		 */
		/*
		 * List<User> findByageGreaterThanEqual =
		 * userRepository.findByAgeGreaterThanEqual(25);
		 * findByageGreaterThanEqual.forEach(System.out::println);
		 */
	    
		/*
		 * List<User> findByAgeGreaterThanEqualAndLocation =
		 * userRepository.findByAgeGreaterThanEqualAndLocation(22,"Pune");
		 * findByAgeGreaterThanEqualAndLocation.forEach(System.out::println);
		 */

	    
		/*
		 * List<User> findByLocationIn =
		 * userRepository.findByLocationIn(Arrays.asList("Hyderabad","Mumbai","Pune"));
		 * findByLocationIn.forEach(System.out::println);
		 */
	    
		/*
		 * List<User> allUserHql = userRepository.getAllUserHql();
		 * 
		 * allUserHql.forEach(System.out::println);
		 */
	    
		/*
		 * List<User>allUsersNative =userRepository.getAllUsersNative();
		 * allUsersNative.forEach(System.out::println);
		 */
	    
	    
	    
	    
	    
	    
	    
	    List<User> userByLocation = userRepository.getUserByLocation("Pune"); 
	    
	    userByLocation.forEach(System.out::println);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
