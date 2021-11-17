package studentPackage;

import java.util.Objects;

public class Student {
private String firstName;
private String lastName;
private String mail;
private int studentID;

//create a student
public Student(String firstName, String lastName, String mail, int studentID) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.mail = mail;
	this.studentID = studentID;
}
@Override
//defualt hashcode
public int hashCode() {
	return Objects.hash(firstName, lastName, mail, studentID);
}
@Override
//default equals to compare students
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	return Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName)
			&& Objects.equals(mail, other.mail) && studentID == other.studentID;
}
//getters and setters
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
public int getStudentID() {
	return studentID;
}
public void setStudentID(int studentID) {
	this.studentID = studentID;
}
}
