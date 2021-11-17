package studentPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class studentControllerTest {

	private Student student1,student2;
	private StudentController sc;
	private String firstName;
	private String lastName;
	private String mail;
	private int studentID;
	@BeforeEach
	void setUp() throws Exception {
		firstName = "Bob";
		lastName = "Wixler";
		mail = "bob.wixler@gmail.com";
		studentID = 123;
		student1 = new Student(firstName, lastName, mail, studentID);
		firstName = "John";
		lastName = "Wick";
		mail = "myDog@gmail.com";
		studentID = 456;
		student2 = new Student(firstName,lastName,mail,studentID);
		sc = new StudentController();
	}

	/*
	 * testing add student function
	 * input:student,null
	 * expected:Added student correctly, can't add same student, cant add null
	 * */
	@Test
	void testAddStudent() {
		assertTrue(sc.addStudent(student1));
		assertFalse(sc.addStudent(student1));
		assertFalse(sc.addStudent(null));
	}
	/*
	 * testing remove student
	 * input:student1,null
	 * expected:student removed correctly,cant remove same student after it's been removed,cant remove null*/
	@Test
	void testRemoveStudent() 
	{
		sc.addStudent(student1);
		assertTrue(sc.removeStudent(student1));
		assertFalse(sc.removeStudent(student1));
		assertFalse(sc.removeStudent(null));
	}

	/*
	 * testing edit student
	 * input:student1,student2,null
	 * expected:cant edit a student that doesnt exist, can edit correctly student that does exist,can edit student with itself,cant edit null*/
	@Test
	void testEditStudent()
	{
		assertFalse(sc.editStudent(student1, student2));
		sc.addStudent(student1);
		assertTrue(sc.editStudent(student1, student2));
		assertTrue(sc.editStudent(student2, student2));
		assertFalse(sc.editStudent(student2, null));
		System.out.println("hi");
	}

	
}
