package hu.webler.weblerfirstjpahibernateproject.service;

import hu.webler.weblerfirstjpahibernateproject.entitiy.Student;
import hu.webler.weblerfirstjpahibernateproject.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }
}
