package health_care_management_system;

import java.util.Scanner;


public class execution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Hospital hospital = new Hospital();

        while (true) {
            System.out.println("Healthcare Management System");
            System.out.println("1. Add Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Patient Name: ");
                    String name = scanner.next();
                    System.out.println("Enter Patient Age: ");
                    int age = scanner.nextInt();
                    System.out.println("Enter Patient Gender: ");
                    String gender = scanner.next();
                    System.out.println("Enter Patient Illness: ");
                    String illness = scanner.next();

                    Patient patient = new Patient(name, age, gender, illness);
                    hospital.add_patient(patient);
                    System.out.println("Patient Added Successfully!");
                    break;
                case 2:
                    hospital.view_patients();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice. Try Again.");
                    break;
            }
        }

	}

}
