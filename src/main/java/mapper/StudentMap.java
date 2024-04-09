package mapper;

import dto.StudentDto;
import model.Student;

public class StudentMap {
    public static StudentDto mapToDTO(Student student) {
        return new StudentDto(
                student.getId(),
                student.getName(),
                student.getEmail(),
                student.getSemester()
        );
    }
}
