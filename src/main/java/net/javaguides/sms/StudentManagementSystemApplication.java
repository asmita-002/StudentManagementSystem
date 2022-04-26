package net.javaguides.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.sms.entity.Student;
import net.javaguides.sms.repository.StudentRepo;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
	@Autowired
	private StudentRepo studentrepo;

	@Override
	public void run(String... args) throws Exception {
//		Student student = new Student("nikita", "chougule", "nikitac@gmail.com");
//		studentrepo.save(student);
//		
//		Student student1 = new Student("aman", "dubey", "amandubey@gmail.com");
//		studentrepo.save(student1);
//		
//		Student student2 = new Student("shubhangi", "poddar", "shubhamp@gmail.com");
//		studentrepo.save(student2);
	}

}
