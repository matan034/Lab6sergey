package studentPackage;

import java.util.ArrayList;

public class StudentController {
private ArrayList<Student> students = new ArrayList<>();

public boolean addStudent(Student s)
{
	if( s != null && !students.contains(s))
		return students.add(s);
	return false;
}

public boolean removeStudent(Student s)
{
	if(s!=null)
		return students.remove(s);
	return false;
}

public boolean editStudent(Student oldStudent, Student newStudent )
{
	if((oldStudent==null) || (newStudent == null) || (!students.contains(oldStudent))) return false;
	removeStudent(oldStudent);
	return students.add(newStudent);			
}
}
