package com.chainsys.jpa.application.doctor;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface DoctorRepository extends CrudRepository<Doctor, Integer> {
	Doctor findById(int id);// Query will generates here

	Doctor save(Doctor Dr);

	// used for adding new doctor and modifying the doctor
	void deleteById(int id);

	List<Doctor> findAll();

}
