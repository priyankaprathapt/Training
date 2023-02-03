package com.StudentECR.StudentECR.Controller;

import com.StudentECR.StudentECR.Dao.Student;
import com.StudentECR.StudentECR.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class HomeController {

    @Autowired
    StudentService service;
    List<Student> studlist = null;
    public List<Student> addData(){
        return service.addData();
    }

    @GetMapping("/all")
    public List<Student> getallstudentdetails(){
        List<Student> Studentlist = addData();
        return Studentlist;
    }

    @GetMapping("/student/{id}")
    public Student getallstudent(@PathVariable("id") int id){
        List<Student> Studentlist = addData();
        return Studentlist.stream().filter(p->p.getStud_id()==id).
                findFirst().orElse(null);

    }


}
