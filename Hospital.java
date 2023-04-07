package health_care_management_system;


import java.util.ArrayList;

class Hospital {
	private ArrayList<Patient> patient_array;
	
	
	
	
	public Hospital() {
       patient_array  = new ArrayList<>();  
    }
	
	public void add_patient(Patient patient)
	
	{
		patient_array.add(patient);
	}
	public void view_patients()
	
	{
		for (Patient patient : patient_array) {
			System.out.println("Patient Name:" + patient.Name);
			System.out.println("Patient Age: "  + patient.age);
			System.out.println("patient gender" + patient.gender);
			System.out.println("patient illness : " + patient.illness);
            
        }
		
	}
}
