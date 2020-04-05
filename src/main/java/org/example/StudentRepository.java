package org.example;


public interface StudentRepository {
   void addStudent(Student student);
   void deleteStudent(String id);
   void selectStudentBasedOnAge(int age);

};
