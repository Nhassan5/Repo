/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: A class named Patient that has fields for the following data: First name, middle name, and last name. 
 * Street Address, city, state, and ZIP code. Phone number (example 301-123-4567). 
 * Name and phone number of emergency contact.
 * Due: 2/24/2025
 * Platform/compiler:
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Nadia Hassan
*/

package PatientDriverApp;

 public class Patient {
    // Fields
    private String firstName;
    private String middleName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private String phoneNumber;
    private String emergencyContactName;
    private String emergencyContactPhone;

    // No-arg constructor
    public Patient() {
        this.firstName = "";
        this.middleName = "";
        this.lastName = "";
        this.streetAddress = "";
        this.city = "";
        this.state = "";
        this.zipCode = "";
        this.phoneNumber = "";
        this.emergencyContactName = "";
        this.emergencyContactPhone = "";
    }

    // Constructor with first, middle, and last name
    public Patient(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.streetAddress = "";
        this.city = "";
        this.state = "";
        this.zipCode = "";
        this.phoneNumber = "";
        this.emergencyContactName = "";
        this.emergencyContactPhone = "";
    }

    // Constructor with all attributes
    public Patient(String firstName, String middleName, String lastName, String streetAddress, String city, 
                   String state, String zipCode, String phoneNumber, String emergencyContactName, String emergencyContactPhone) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.emergencyContactName = emergencyContactName;
        this.emergencyContactPhone = emergencyContactPhone;
    }

    // Accessors and mutators
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getMiddleName() { return middleName; }
    public void setMiddleName(String middleName) { this.middleName = middleName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getStreetAddress() { return streetAddress; }
    public void setStreetAddress(String streetAddress) { this.streetAddress = streetAddress; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getState() { return state; }
    public void setState(String state) { this.state = state; }

    public String getZipCode() { return zipCode; }
    public void setZipCode(String zipCode) { this.zipCode = zipCode; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getEmergencyContactName() { return emergencyContactName; }
    public void setEmergencyContactName(String emergencyContactName) { this.emergencyContactName = emergencyContactName; }

    public String getEmergencyContactPhone() { return emergencyContactPhone; }
    public void setEmergencyContactPhone(String emergencyContactPhone) { this.emergencyContactPhone = emergencyContactPhone; }

    // Method to build full name
    public String buildFullName() {
        return firstName + " " + middleName + " " + lastName;
    }

    // Method to build full address
    public String buildAddress() {
        return streetAddress + " " + city + " " + state + " " + zipCode;
    }

    // Method to build emergency contact info
    public String buildEmergencyContact() {
        return emergencyContactName + " " + emergencyContactPhone;
    }

    // toString method using build methods
    @Override
    public String toString() {
        return "Patient Info:\n" +
                "  Name: " + buildFullName() + "\n" +
                "  Address: " + buildAddress() + "\n" +
                "  EmergencyContact: " + buildEmergencyContact();
    }
}

