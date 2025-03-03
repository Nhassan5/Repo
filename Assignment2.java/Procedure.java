/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: A class named Procedure that represents a medical procedure that has been performed on a patient. 
 * The Procedure class should have fields for the following data: Name of the procedure. 
 * Date of the procedure (for example 06/12/2023). Name of the practitioner who performed the procedure. 
 * Charges for the procedure.
 * Due: 2/24/25
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Nadia Hassan
*/

package PatientDriverApp;

public class Procedure {

    // Fields
    private String procedureName;
    private String procedureDate;
    private String practitionerName;
    private double procedureCharge;

    // No-arg constructor
    public Procedure() {
        this.procedureName = "";
        this.procedureDate = "";
        this.practitionerName = "";
        this.procedureCharge = 0.0;
    }

    // Constructor with procedure name and date
    public Procedure(String procedureName, String procedureDate) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        this.practitionerName = "";
        this.procedureCharge = 0.0;
    }

    // Constructor with all attributes
    public Procedure(String procedureName, String procedureDate, String practitionerName, double procedureCharge) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        this.practitionerName = practitionerName;
        this.procedureCharge = procedureCharge;
    }

    // Accessors
    public String getProcedureName() {
        return procedureName;
    }

    public String getProcedureDate() {
        return procedureDate;
    }

    public String getPractitionerName() {
        return practitionerName;
    }

    public double getProcedureCharge() {
        return procedureCharge;
    }

    // Mutators
    public void setProcedureName(String procedureName) {
        this.procedureName = procedureName;
    }

    public void setProcedureDate(String procedureDate) {
        this.procedureDate = procedureDate;
    }

    public void setPractitionerName(String practitionerName) {
        this.practitionerName = practitionerName;
    }

    public void setProcedureCharge(double procedureCharge) {
        this.procedureCharge = procedureCharge;
    }

    // toString method
    @Override
    public String toString() {
        return "\n	Procedure: " + procedureName + "\n" +
               "	ProcedureDate= " + procedureDate + "\n" +
               "	Practitioner= " + practitionerName + "\n" +
               "	Charge= " + procedureCharge + "\n";
    }
}

