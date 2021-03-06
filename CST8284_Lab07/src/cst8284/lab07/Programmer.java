package cst8284.lab07;
/*
 * Class Name: CST8284_300
 * Student Name: Jie Ke
 * Class Name: lab 7
 * Due Date: Aug 4, 2021
 */


// LAB 7: YOU ARE REQUIRED TO MODIFY THIS CODE!!!

//Programmer.java

//Programmer - This is an abstract superclass that IMPLEMENTS the Payme interface.

//SOME MODIFICATION ARE REQUIRED IN THIS SECTION OF YOUR HERE - LOOK CLOSELY!!!

public abstract class Programmer implements Payme{

private String firstName;
private String lastName;
private String socialSecurityNumber;

//three-argument constructor

public Programmer(String first, String last, String ssn) {
 firstName = first;
 lastName = last;
 socialSecurityNumber = ssn;
}

/** CHANGES ARE REQUIRED IN THIS SECTION. 
* THINK OF THE BEST WAY TO ACCESS PRIVATE VARIABLES.
* IN THIS PORTION OF YOUR CODE INCLUDE ALL OF SUCH THAT APPLIES.
*/


//return String representation of Programmer object
@Override
public String toString() {
	System.out.println();
return String.format("%s %s\n%s:%s ", 
  getFirstName(), getLastName(), "social security number",getSocialSecurityNumber());
} 


/**
 * @return the firstName
 */
public String getFirstName() {
	return firstName;
}

/**
 * @param firstName the firstName to set
 */
public void setFirstName(String firstName) {
	this.firstName = firstName;
}

/**
 * @return the lastName
 */
public String getLastName() {
	return lastName;
}

/**
 * @param lastName the lastName to set
 */
public void setLastName(String lastName) {
	this.lastName = lastName;
}

/**
 * @return the socialSecurityNumber
 */
public String getSocialSecurityNumber() {
	return socialSecurityNumber;
}

/**
 * @param socialSecurityNumber the socialSecurityNumber to set
 */
//Note: We do NOT implement Payme method getPaymentAmount() here. 
// THEREFORE, TO AVOID A COMPILATION ERROR, YOU SHOULD DECLARE THIS CLASS AS....??
public void setSocialSecurityNumber(String socialSecurityNumber) {
	this.socialSecurityNumber = socialSecurityNumber;
}

public abstract double getPaymentAmount(); /** No implementation here. DO YOU KNOW WHY? What should this method be?*/
} 


