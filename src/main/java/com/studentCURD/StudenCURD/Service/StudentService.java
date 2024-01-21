package com.studentCURD.StudenCURD.Service;

import com.studentCURD.StudenCURD.Model.Student;

import java.util.List;

public interface StudentService {
    Student insertStudent(Student student);
    Student getStudent(int studentId);

    List<Student> getStudentList();
    Student updateStudent(int studentId,Student student);
    String deleteStudent();
}
