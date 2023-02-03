package com.StudentECR.StudentECR.Dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {


    private int stud_id;
    private String stud_name;
    private String Address;
    private int mark;




}
