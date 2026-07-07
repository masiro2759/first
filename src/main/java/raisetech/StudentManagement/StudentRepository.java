package raisetech.StudentManagement;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface StudentRepository {

  @Select("SELECT * FROM student")
  List<Student> search();

  @Select("SELECT * FROM student_courses")
  List<Student_courses> searchStudent_courses() ;
}
