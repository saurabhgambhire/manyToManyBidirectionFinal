package CONTROLLER;

import java.util.ArrayList;
import java.util.List;

import DAO.Dao;
import DTO.*;

public class Driver 
{
	public static void main(String[] args) 
	{
		Patients patients1 = new Patients();
		Patients patients2 = new Patients();
		Hospital hospital = new Hospital();
		
		patients1.setPatient_Id(1001);
		patients1.setPatient_Name("karan Bhoi");
		patients1.setPatient_Age(23);
		patients1.setGender("Male");
		
		patients2.setPatient_Id(1002);
		patients2.setPatient_Name("sachin kanerkar");
		patients2.setPatient_Age(21);
		patients2.setGender("Male");
		
		List<Patients> list = new ArrayList<Patients>();
		list.add(patients1);
		list.add(patients2);
		
		hospital.setId(1);
		hospital.setName("Pant Hopitals");
		hospital.setCountry("India");
		hospital.setPatients(list);
		
		
		
		Dao dao = new Dao();
		
//		dao.insertHospital(hospital);
//		dao.fetchHospital(1);
//		dao.deleteHospital(1);
		dao.updateHospital(1,hospital);
		
		
	}

}
