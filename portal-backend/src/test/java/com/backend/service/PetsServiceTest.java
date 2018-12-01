package com.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import com.portal.backend.domain.Pets;
import com.portal.backend.service.PetsService;
import com.portal.backend.starter.PortalBackendApplication;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, classes = PortalBackendApplication.class)
public class PetsServiceTest extends AbstractTestNGSpringContextTests  {

	@Autowired
	private PetsService petsService;
	
	@Test
	public void testCreatePet() {
	
		Pets pet = new Pets();
		pet.setName("Jimmy");
		pet.setBreed("Pomerian Dog");
		pet.setSpecies("Dog");
		
		petsService.create(pet);
	}
	
}
