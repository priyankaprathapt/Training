package com.StudentECR.StudentECR.Service;

import com.StudentECR.StudentECR.Dao.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    public List<Student> addData() {

        List<Student> studlist = new ArrayList<>();

        studlist.add(new Student(1,"Priyanka","Address of priyanka",80));
        studlist.add(new Student(2,"Govardhan","Address of Govardhan",90));
        studlist.add(new Student(3,"Sreepriya","Address pf Sreepriya",70));

        return studlist;
    }
}
