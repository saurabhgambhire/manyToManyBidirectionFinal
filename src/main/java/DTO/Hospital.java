package DTO;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Hospital {
	@Id
	private int id;
	private String name;
	private String country;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Patients> patients;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCountry() {
		return country;
	}

	public List<Patients> getPatients() {
		return patients;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setPatients(List<Patients> patients) {
		this.patients = patients;
	}

	@Override
	public String toString() {
		return "Hospital [id=" + id + ", name=" + name + ", country=" + country + ", patients=" + patients + "]";
	}

}
