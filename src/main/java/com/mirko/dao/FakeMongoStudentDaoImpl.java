package com.mirko.dao;

import com.mirko.entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;

@Repository
@Qualifier("fakeMongoData")
public class FakeMongoStudentDaoImpl implements StudentDao {


    @Override
    public Collection<Student> getAllStudents() {
        return new ArrayList<Student>(){
            {
                add(new Student(1, "Branko", "Muzicko"));
            }
        };
    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public void removeStudentById(int id) {

    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void insertStudentToDb(Student student) {

    }

    @Override
    public Collection<Student> getStudentByName(String ime) {
        return null;
    }
}
