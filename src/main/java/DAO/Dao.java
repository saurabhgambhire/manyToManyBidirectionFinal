package DAO;

import java.util.List;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import DTO.*;

public class Dao 
{
	
	public static EntityManager getEMEntityManager() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("saurabh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager;
	}

	public void insertHospital(Hospital hospital) {

		EntityManager entityManager = getEMEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityTransaction.commit();

	}

	public void fetchHospital(int id) {
		
		EntityManager entityManager = getEMEntityManager();
		Hospital hospital =   entityManager.find(Hospital.class, id);
		System.out.println(hospital);
		List<Patients> list = hospital.getPatients();
		for (Patients patients : list)
		{
			System.out.println(patients);
		}
		
	}

	public void deleteHospital(int id) {
		EntityManager entityManager = getEMEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Hospital hospital =  entityManager.find(Hospital.class, id);
		
		if (hospital!=null) 
		{
			entityTransaction.begin();
			entityManager.remove(hospital);
			entityTransaction.commit();
		}
		else {
			System.out.println(" Enter correct Id to delete ");
		}
		
	}

	public void updateHospital(int id, Hospital hospital) {
		EntityManager entityManager = getEMEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Hospital hospital2 = entityManager.find(Hospital.class, id);
		hospital2.setId(id);
		hospital2.setName("Hospital");
		hospital2.setPatients(hospital.getPatients());
		entityManager.merge(hospital2);
		entityTransaction.commit();
		
	}

}
