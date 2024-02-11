package hu.webler.weblerfirstjpahibernateproject.repository;

import hu.webler.weblerfirstjpahibernateproject.entitiy.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
