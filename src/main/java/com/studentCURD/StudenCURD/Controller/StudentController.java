package com.studentCURD.StudenCURD.Controller;

import com.studentCURD.StudenCURD.Model.Student;
import com.studentCURD.StudenCURD.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@ComponentScan
@RestController
public class StudentController {
   @Autowired
    private StudentService studentService;
    @PostMapping("/student")
    public Student insertStudent(@RequestBody Student student){
        return studentService.insertStudent(student);
    }
    @GetMapping("/student/{studentId}")
    public Student getStudent(@PathVariable int studentId){
        return studentService.getStudent(studentId);
    }
    @GetMapping("/student")
    public List<Student> getStudentList(){
        return studentService.getStudentList();
    }
    @PutMapping("/student/{studentId}")
    public Student updateStudent(@PathVariable int studentId,@RequestBody Student student){
        return studentService.updateStudent(studentId,student);
    }
    @DeleteMapping("/student/{studentId}")
    public String deleteStudent(@PathVariable int studentId){
        return "Deleted Successfully";
    }
}
