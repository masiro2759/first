package raisetech.StudentManagement.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import raisetech.StudentManagement.repository.StudentRepository;
import raisetech.StudentManagement.data.Student;
import raisetech.StudentManagement.data.Student_courses;

@Service
public class StudentService {

  private StudentRepository repository;

  @Autowired
  public StudentService(StudentRepository repository) {
    this.repository = repository;
  }

  public List<Student> searchStudentList(){
    return repository.search();
  }
  public List<Student_courses> searchStudentCoursesList(){
    return repository.searchStudent_courses();
  }

}
