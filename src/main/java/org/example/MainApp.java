package org.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class MainApp
{
    public static void main( String[] args )
    {
        TreeSet<Student> studentSortedSetByAge = new TreeSet<Student>(Collections.reverseOrder(new StudentComparator()));

        studentSortedSetByAge.add(new Student("Ana","Red",1994,"female","2955213039174"));
        studentSortedSetByAge.add(new Student("Vasile","Yellow",1977,"male","1920921289876"));
        studentSortedSetByAge.add(new Student("Marin","Green",1927,"male","192092889876"));


        for (Student student:studentSortedSetByAge) {
            System.out.println(student.firstName +" "+ student.lastName + " "+student.yearOfBirth + " "+student.ID + " "+student.gender);

        }

    }

    static class StudentComparator implements Comparator<Student> {

        @Override
        public int compare (Student student1, Student student2) {
            if(student1.getAge() > student2.getAge()){
                return 1;
            }
            else {
                return -1;
            }
        }
    }
}
