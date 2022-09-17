package com.online.restaurant.Repo;

import java.time.LocalDate;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.online.restaurant.domain.Recipe;

public interface RecipeRepo extends CrudRepository<Recipe, String>{
	
	@Modifying
	@Transactional
	@Query(nativeQuery = true, value = "INSERT INTO Recipe (Category,NameOfItem,description,Ingredients,steps) VALUES (?1,?2,?3,?4,?5)")
	public void insertData(String category, String nameOfItem, String description, String ingredients, String steps);

}
