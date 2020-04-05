package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StudentTest {


   @Test
   public void getAge () {
      Student student = new Student("Ana","Red",1994,"female","2955213039174");
      assertEquals(26,student.getAge());
   }
}