package com.azure.azuresqlspringboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzuresqlSpringbootApplication {
	
	@Autowired
	private EmployeeRepository repository;
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return repository.save(employee);
	}
	
	@GetMapping("/emplyees")
	public List<Employee> getEmployee(){
		return repository.findAll();
	}

	public static void main(String[] args) {
		SpringApplication.run(AzuresqlSpringbootApplication.class, args);
	}

}
