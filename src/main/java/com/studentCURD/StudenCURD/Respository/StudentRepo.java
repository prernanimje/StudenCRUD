package com.studentCURD.StudenCURD.Respository;

import com.studentCURD.StudenCURD.Model.Student;

import java.util.List;

public interface StudentRepo {
    Student insertStudent(Student student);
    Student getStudent(int student);
    List<Student> getStudentList();
    Student updateStudent(int studentId, Student student);
    String deleteStudent();
}
