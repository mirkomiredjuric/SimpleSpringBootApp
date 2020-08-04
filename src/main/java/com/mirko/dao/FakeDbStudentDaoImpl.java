package com.mirko.dao;

import com.mirko.entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
@Qualifier("fakeDdData")
public class FakeDbStudentDaoImpl implements StudentDao {

    private static Map<Integer, Student> students;

    static {

        students = new HashMap<Integer, Student>(){

            {
                put(1, new Student(1, "Mirko", "Spring boot 2"));
                put(2, new Student(2, "Tijana", "Engleski jezik"));
                put(3, new Student(3, "Julija", "Yoga"));
            }
        };
    }

    @Override
    public Collection<Student> getAllStudents(){
        return this.students.values();
    }

    @Override
    public Student getStudentById(int id){
        return this.students.get(id);
    }

    @Override
    public void removeStudentById(int id) {
        this.students.remove(id);
    }

    @Override
    public void updateStudent(Student student){
        Student s = students.get(student.getId());
        s.setKurs(student.getKurs());
        s.setIme(student.getIme());
        students.put(student.getId(), student);
    }

    @Override
    public void insertStudentToDb(Student student) {
        this.students.put(student.getId(), student);
    }

    @Override
    public Collection<Student> getStudentByName(String ime) {
        Map<Integer, Student> mapStudenataPoImenu = new HashMap<>();
        for(Map.Entry<Integer, Student> entry : students.entrySet()){
            if (entry.getValue().getIme().equalsIgnoreCase(ime)){
                mapStudenataPoImenu.put(entry.getKey(), entry.getValue());
            }

        }

        return mapStudenataPoImenu.values();
    }
}
