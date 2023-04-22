package DTO;

import java.util.List;

import javax.persistence.*;

@Entity
public class Patients {
	@Id
	private int patient_Id;
	private String patient_Name;
	private int patient_Age;
	private String gender;
	@ManyToMany(cascade =CascadeType.ALL)
	private List<Hospital> hospitals;

	public int getPatient_Id() {
		return patient_Id;
	}

	public String getPatient_Name() {
		return patient_Name;
	}

	public int getPatient_Age() {
		return patient_Age;
	}

	public String getGender() {
		return gender;
	}

	public List<Hospital> getHospitals() {
		return hospitals;
	}

	public void setPatient_Id(int patient_Id) {
		this.patient_Id = patient_Id;
	}

	public void setPatient_Name(String patient_Name) {
		this.patient_Name = patient_Name;
	}

	public void setPatient_Age(int patient_Age) {
		this.patient_Age = patient_Age;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setHospitals(List<Hospital> hospitals) {
		this.hospitals = hospitals;
	}

	@Override
	public String toString() {
		return "Patients [patient_Id=" + patient_Id + ", patient_Name=" + patient_Name + ", patient_Age=" + patient_Age
				+ ", gender=" + gender + ", hospitals=" + hospitals + "]";
	}

}
