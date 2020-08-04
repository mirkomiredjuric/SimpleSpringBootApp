package com.mirko.dao;

import com.mirko.entity.Student;

import java.util.Collection;

public interface StudentDao {
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void removeStudentById(int id);

    void updateStudent(Student student);

    void insertStudentToDb(Student student);

    Collection<Student> getStudentByName(String ime);
}
