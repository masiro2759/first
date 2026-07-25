package raisetech.StudentManagement.repository;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import raisetech.StudentManagement.data.Student;
import raisetech.StudentManagement.data.Student_courses;

/**
 * 受講生情報を扱うリポジトリ
 *
 * 全件検索や単一情報での検索、コース情報の検索が行えるクラスです
 */
@Mapper
@Repository
public interface StudentRepository {

  /**
   *全件検索します
   *
   * @return 全件検索した受講生情報の一覧
   */

  @Select("SELECT * FROM student")
  List<Student> search();

  @Select("SELECT * FROM student_courses")
  List<Student_courses> searchStudent_courses() ;
}
