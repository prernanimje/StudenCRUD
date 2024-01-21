package com.studentCURD.StudenCURD.Service;

import com.studentCURD.StudenCURD.Model.Student;
import com.studentCURD.StudenCURD.Respository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepo studentRepo;
    @Override
    public Student insertStudent(Student student) {
        return studentRepo.insertStudent(student);
    }
    @Override
    public Student getStudent(int studentId) {
        return studentRepo.getStudent(studentId);
    }

    @Override
    public List<Student> getStudentList() {
        return studentRepo.getStudentList();
    }

    @Override
    public Student updateStudent(int studentId, Student student) {
        return studentRepo.updateStudent(studentId, student);
    }

    @Override
    public String deleteStudent() {
        return "Deleted Successfully";
    }
}
