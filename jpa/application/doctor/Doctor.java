package com.chainsys.jpa.application.doctor;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Doctor")
public class Doctor {
	@Id
	private int doctor_id;
	private String doctor_name;
	private Date dob;
	private String speciality;
	private String city;
	private long phoneno;
	@Column(name="standard_fees")
	private float standard_fees;
	public int getDoctor_id() {
		return doctor_id;
	}
	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}
	public String getDotor_name() {
		return doctor_name;
	}
	public void setDotor_name(String dotor_name) {
		this.doctor_name = dotor_name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPhone_no() {
		return phoneno;
	}
	public void setPhone_no(long phoneno) {
		this.phoneno = phoneno;
	}
	public float getFees() {
		return standard_fees;
	}
	public void setFees(float fees) {
		this.standard_fees = fees;
	}
	@Override
	public String toString() {
		return String.format("%d,%s,%s,%s,%s%d,%d",doctor_id,doctor_name,dob,speciality,city,phoneno,standard_fees);

}
	
}
