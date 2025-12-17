package com.example.demo.service.impl;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final List<Student> students = new ArrayList<>();

    @Override
    public Student saveStudent(Student student) {
        students.add(student);
        return student;
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Student getStudentById(Long id) {
        return students.get(id.intValue());
    }

    @Override
    public Student updateStudent(Long id, Student student) {
        students.set(id.intValue(), student);
        return student;
    }

    @Override
    public void deleteStudent(Long id) {
        students.remove(id.intValue());
    }
}
