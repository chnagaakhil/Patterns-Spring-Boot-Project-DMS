package com.NagaAkhilProject.DogsManagementSystem.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.NagaAkhilProject.DogsManagementSystem.Models.Dog;
/**
 * 
 * @author S549701 - Naga Akhil Chaparala
 *
 */
public interface DogRepository extends CrudRepository<Dog, Integer>{
	List<Dog> findByName(String name);

}
