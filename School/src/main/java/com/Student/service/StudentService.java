package com.Student.service;

import com.Student.entity.Student;
import com.Student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }
    public Student getoneStudent(int id){
        return studentRepository.findById(id).orElse(null);
    }
    public Student create(Student student){
        return studentRepository.save(student);
    }

    public void deletebyid(int id){
        studentRepository.deleteById(id);
    }
    public Student update(int id, Student student){
        if(studentRepository.existsById(id)){
            student.setId(id);
            return studentRepository.save(student);
        }
        else {
            return null;
        }
    }


}
