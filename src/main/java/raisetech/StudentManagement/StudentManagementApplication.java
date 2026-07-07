package raisetech.StudentManagement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan("raisetech.StudentManagement")
@SpringBootApplication
@RestController
public class StudentManagementApplication {

	@Autowired
	private StudentRepository repository ;

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}
	@GetMapping("/student")
	public List<Student> getStudentinfo() {
		return repository.search();
	}
	@GetMapping("/student_courses")
	public List<Student_courses> getStudent_Courses() {
		return repository.searchStudent_courses();
	}
}
