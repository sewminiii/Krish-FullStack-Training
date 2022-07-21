package com.sewmini.rentacar.demoapplication.service;

import com.sewmini.rentacar.demoapplication.model.Student;

public interface StudentService {

    Student save(Student student);

    Student fetchStudentById(int id);
}
