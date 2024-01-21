package com.studentCURD.StudenCURD.Respository;

import com.studentCURD.StudenCURD.Model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class StudentRepoImpl implements StudentRepo{

    Map<Integer, Student> StudentMap= new HashMap<>();

    @Override
    public Student insertStudent(Student student) {
        return StudentMap.put(student.StudentId, student);
    }

    @Override
    public Student getStudent(int student) {
        return StudentMap.get(student);
    }

    @Override
    public List<Student> getStudentList() {
        return new ArrayList<>(StudentMap.values());
    }

    @Override
    public Student updateStudent(int studentId, Student student) {
        return StudentMap.put(studentId,student);
    }

    @Override
    public String deleteStudent() {
        return "Deleted Successfully";
    }
}
