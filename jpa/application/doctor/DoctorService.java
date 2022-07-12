package com.chainsys.jpa.application.doctor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorService {
	@Autowired
	private DoctorRepository repo;

//	@Bean
//	public void setRepo(DoctorRepository repo) {
//		this.repo = repo;
//	}
	@GetMapping("/getDoctor")
	//we need to give from where to read data from the HTTP request and also the content type application/json
	public Doctor getDoctor(int id) {
		return repo.findById(id);
	}

	@PostMapping(value ="/newDoctor",consumes ="application/json")
	public String addNewDoctor(@RequestBody Doctor Dr) {
		//System.out.println("Doctor :" + Dr.getDoctor_id()+" "+Dr.getDotor_name());
		repo.save(Dr);
		return "redirect:/getalldoctor";
	}

	@DeleteMapping("/deleteDoctor")
	public String deleteDoctor(int id) {
		repo.deleteById(id);
		return "redirect:/getalldoctor";
	}
	@PostMapping("/modifyDoctor")
	public String modifyDoctor(@RequestBody Doctor Dr) {
		//System.out.println("Doctor :" + Dr.getDoctor_id()+" "+Dr.getDotor_name());
		repo.save(Dr);
		return "redirect:/getalldoctor";
	}

	@GetMapping("/getAllDoctor")
	public List<Doctor> getDoctor() {
		return repo.findAll();
	}

}
