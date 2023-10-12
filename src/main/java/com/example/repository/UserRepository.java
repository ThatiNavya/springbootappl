package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entity.User;
@Repository
public interface UserRepository extends CrudRepository<User,Integer>{
 
	public List<User>findByUsername(String name);
	public List<User>findByAgeGreaterThanEqual(Integer age);
	public List<User>findByAgeGreaterThanEqualAndLocation(Integer  age,String location);
	public List<User> findByLocationIn(List<String> countries);
	
	@Query(value ="From User")
	public List<User> getAllUserHql();

	
	
	@Query(value="select * from user_details where user_location = :loc", nativeQuery = true)
	public List <User> getUserByLocation(String loc);
}

