package net.javaguides.sms.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.sms.entity.Student;
import net.javaguides.sms.repository.StudentRepo;
import net.javaguides.sms.services.StudentService;


@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepo studentrepo;

	@Override
	public List<Student> getAllStudents() {
		return studentrepo.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentrepo.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return studentrepo.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentrepo.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentrepo.deleteById(id);
	}

}
