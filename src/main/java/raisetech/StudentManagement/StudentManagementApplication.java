package raisetech.StudentManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	@GetMapping("/Info")
	public String getInfo(@RequestParam String name) {
		Student student = repository.searchByName(name);
		return student.getName() + " " + student.getAge() + "歳";

	}

	@PostMapping("/Info")
	public void registerInfo(String name , int age) {
		repository.registerStudent(name, age);
	}

	@PatchMapping("/Info")
	public void updateInfo(String name, int age) {
		repository.updateInfo(name, age);
	}

	@DeleteMapping("/Info")
	public void deleteInfo(String name) {
		repository.deleteInfo(name);
	}

}
