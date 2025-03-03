/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: A class name PatientDriverApp that creates an instance of the Patient class, initialized with sample data that a user entered from keyboard. 
 * Then, create three instances of the Procedure class. Make sure to create each instance using one of each constructor. 
 * Note that if you create an instance using constructors other than the one that initializes all attributes, you must set the values of all attributes.
 * Due: 2/24/2025
 * Platform/compiler:
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Nadia Hassan
*/

package PatientDriverApp;
import java.util.Scanner;

public class PatientDriverApp {

    public static void displayPatient(Patient p) {
        System.out.println(p.toString());
    }

    public static void displayProcedure(Procedure pr) {
        System.out.println(pr.toString());
    }

    public static double calculateTotalCharges(Procedure p1, Procedure p2, Procedure p3) {
        return p1.getProcedureCharge() + p2.getProcedureCharge() + p3.getProcedureCharge();
        
    }
    
 /*
   * Calculates the total charges for three given procedures.
   * p1 First Procedure object.
   * p2 Second Procedure object.
   * p3 Third Procedure object.
   * @return Total cost of all three procedures.
   */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first name ");
        String firstName = sc.nextLine();
        
        System.out.print("Enter middle name ");
        String middleName = sc.nextLine();
        
        System.out.print("Enter last name ");
        String lastName = sc.nextLine();
        
        System.out.print("Enter street adresss ");
        String streetAddress = sc.nextLine();
        
        System.out.print("Enter city ");
        String city = sc.nextLine();
        
        System.out.print("Enter state ");
        String state = sc.nextLine();
        
        System.out.print("Enter zipcode ");
        String zipCode = sc.nextLine();
        
        System.out.print("Enter phone number ");
        String phoneNumber = sc.nextLine();
        
        System.out.print("Enter name of emergency contact ");
        String emergencyContact = sc.nextLine();
        
        System.out.print("Enter phone number of emergency contact");
        String emergencyContactNumber = sc.nextLine();
        
        // Creating a Patient object with collected data
        Patient patient = new Patient (firstName, middleName, lastName, streetAddress, city, 
                state,zipCode, phoneNumber, emergencyContact, emergencyContactNumber);
        
        // Collecting details for Procedure 1
        System.out.println("\nEnter details for Procedure 1:");
        System.out.print("Name: ");
        String p1Name = sc.nextLine();
        
        System.out.print("Date: ");
        String p1Date = sc.nextLine();
        
        System.out.print("Practitioner: ");
        String p1Practitioner = sc.nextLine();
        
        System.out.print("Charge: ");
        double p1Charge = sc.nextDouble();
        
        sc.nextLine();
        Procedure procedure1 = new Procedure(p1Name, p1Date, p1Practitioner, p1Charge);

        // Collecting details for Procedure 2
        System.out.println("\nEnter details for Procedure 2:");
        System.out.print("Name: ");
        String p2Name = sc.nextLine();
        System.out.print("Date: ");
        String p2Date = sc.nextLine();
        
        System.out.print("Practitioner: ");
        String p2Practitioner = sc.nextLine();
        
        System.out.print("Charge: ");
        double p2Charge = sc.nextDouble();
        sc.nextLine();
        
        // Creating Procedure 2 with partial constructor and using setters for missing details
        Procedure procedure2 = new Procedure(p2Name, p2Date);
        procedure2.setPractitionerName(p2Practitioner);
        procedure2.setProcedureCharge(p2Charge);

        // Collecting details for Procedure 3
        System.out.println("\nEnter details for Procedure 3:"); 
        System.out.print("Name: ");
        String p3Name = sc.nextLine();
        
        System.out.print("Date: ");
        String p3Date = sc.nextLine();
        
        System.out.print("Practitioner: ");
        String p3Practitioner = sc.nextLine();
        
        System.out.print("Charge: ");
        double p3Charge = sc.nextDouble();
        
        // Creating Procedure 3 using default constructor and setting values with setters
        Procedure procedure3 = new Procedure();
        
        procedure3.setProcedureName(p3Name);
        procedure3.setProcedureCharge(p3Charge);
        procedure3.setProcedureDate(p3Date);
        procedure3.setPractitionerName(p3Practitioner);

        // Displaying collected patient and procedure details
        System.out.println("\n--- Output ---");
        displayPatient(patient);

        displayProcedure(procedure1);
        displayProcedure(procedure2);
        displayProcedure(procedure3);

        // Calculating and displaying total charges for all procedures
        double total = calculateTotalCharges(procedure1, procedure2, procedure3);
        System.out.printf("\nTotal Charges: $%,.2f\n", total);
        
        // Displaying student information
        System.out.println ("\nStudent Name:Nadia Hassan");
        System.out.println ("MC#: MC777777");
        System.out.println ("Due Date: 02/24/2025");
        
        

        sc.close();
    }
}

