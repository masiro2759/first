package raisetech.StudentManagement.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import raisetech.StudentManagement.data.Student;
import raisetech.StudentManagement.data.Student_courses;
import raisetech.StudentManagement.service.StudentService;

@RestController
public class StudentController {

  private StudentService service;

  @Autowired
  public StudentController(StudentService service) {
    this.service = service;
  }

  @GetMapping("/student")
  public List<Student> getStudentinfo() {
    return service.searchStudentList();
  }
  @GetMapping("/student_courses")
  public List<Student_courses> getStudent_Courses() {
    return service.searchStudentCoursesList();
  }
}
