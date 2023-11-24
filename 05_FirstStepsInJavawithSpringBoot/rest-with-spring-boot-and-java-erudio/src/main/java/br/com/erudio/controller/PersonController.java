package br.com.erudio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import br.com.erudio.service.PersonServices;
import br.com.erudio.vo.v1.PersonVO;

@RestController
@RequestMapping("/api/person/v1")
public class PersonController {
	
	@Autowired
	private PersonServices personService;
	
	@GetMapping(value = "/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public PersonVO findById (
			@PathVariable(value = "id") Long id
			) throws Exception {
				return personService.findById(id);		
	}
	
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public List<PersonVO> findAll (
			) throws Exception {
				return personService.findAll();		
	}
	
	@PostMapping( produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public PersonVO create (
			@RequestBody PersonVO person
			) throws Exception {
				return personService.create(person);
	}
	
	@PutMapping( produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public PersonVO update (
			@RequestBody PersonVO person
			) throws Exception {
				return personService.update(person);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete (
			@PathVariable(value = "id") Long id
			) throws Exception {
				personService.delete(id);
				return ResponseEntity.noContent().build();
	}
	
	
}
