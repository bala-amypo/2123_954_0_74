
package com.example.demo.services;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.entity.student;

@Service
public class StudentService {

    private Map<Integer, Student> details = new HashMap<>();

    
    public Student saveData(Student st) {
        details.put(st.getId(), st);
        return st;
    }

    
    public Student getById(int id) {
        return details.get(id);
    }

    public Collection<Studentity> getAll() {
        return details.values();
    }


    public Studentity updateStudent(int id, Studentity st) {
        if(details.containsKey(id)) {
            st.setId(id); 
            details.put(id, st);
            return st;
        }
        return null; 
    }

}