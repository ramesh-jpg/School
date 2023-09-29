package com.Student.controller;

import com.Student.entity.Student;
import com.Student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/getall")
    public List<Student> getllall(){
        return studentService.getAllStudent();
    }
    @GetMapping("/getone/{id}")
    public Student getone(@PathVariable int id){
        return studentService.getoneStudent(id);
    }
    @PostMapping("/create")
    public Student create(@RequestBody Student student){
        return studentService.create(student);
    }
    @DeleteMapping("/delete")
    public void delete(@PathVariable int id){
         studentService.deletebyid(id);
    }
    public Student update(@PathVariable int id, @RequestBody Student student){
        return studentService.update(id,student);
    }
}
