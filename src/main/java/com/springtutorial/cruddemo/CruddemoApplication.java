package com.springtutorial.cruddemo;
import com.springtutorial.cruddemo.studentDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(studentDAO studentDAO){
		return runner->{
			//createStudent(studentDAO);
			//readStudent(studentDAO);
			//updateStudent(studentDAO);
			deleteStudent(studentDAO);


		}; // lamba expression
	}

	private void deleteStudent(studentDAO studentDAO) {
		int stud_id=2;
		System.out.println("Deleting student id: "+stud_id);
		studentDAO.delete(stud_id);
	}


	private void readStudent(studentDAO studentDAO) {
		//create obj
		System.out.println("Creating new student object...");
		student tempstudent = new student("Durga","Gowri","dg@gmail.com");

		//save obj
		System.out.println("Saving...");
		studentDAO.save(tempstudent);
		//display saved obj
		int theId = tempstudent.getId();
		System.out.println("Saved student - id"+theId);

		//retreive and display content
		System.out.println("Retrieving student with id"+theId);
		student myStudent = studentDAO.findById(theId);
		System.out.println("Found the student"+myStudent);
	}

	private void createStudent(studentDAO studentDAO) {
		//create the student object
		System.out.println("Creating new student object...");
		student tempstudent = new student("Durga","Gowri","dg@gmail.com");

		//save student obj
		System.out.println("Saving...");
		studentDAO.save(tempstudent);

		//display id of stud
		System.out.println("Saved student - id"+tempstudent.getId());
	}
	void updateStudent(studentDAO studentDAO){

		int stud_id = 1;
		System.out.println("Get student with id"+stud_id);
		student myStudent = studentDAO.findById(stud_id);

		//updating student
		System.out.println("Updating..");
		myStudent.setFirst_name("Durgagowri");
		myStudent.setLastName("Gurumoorthy");
		studentDAO.update(myStudent);

		System.out.println("Updated student: "+myStudent);
	}
}
