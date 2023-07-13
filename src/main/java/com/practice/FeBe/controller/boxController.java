package com.practice.FeBe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.practice.FeBe.entity.box;
import com.practice.FeBe.repo.boxRepo;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@RequestMapping("/box")
@CrossOrigin
public class boxController {

	@Autowired
	private boxRepo repo;
	
	@PostMapping(consumes= {"application/json"})
	public ResponseEntity<box> addData(@RequestBody box box) 
	{
		try {
			repo.save(box);
			return ResponseEntity.status(HttpStatus.CREATED).build();
		}
		catch(Exception e){
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	@GetMapping
	public List<box> getData()
	{
		return repo.findAll();
	}
}
