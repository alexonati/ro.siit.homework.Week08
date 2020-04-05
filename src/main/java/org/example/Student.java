package org.example;

public class Student extends StudentContainer implements StudentRepository {
   public String firstName;
   public String lastName;
   public int yearOfBirth;
   public String gender;
   public String ID;
   public int age;

   public Student (String firstName, String lastName, int yearOfBirth, String gender, String ID) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.yearOfBirth = yearOfBirth;
      this.gender = gender;
      this.ID = ID;
      age = 2020 - yearOfBirth;
   }

   public int getAge () {
      return age;
   }

   public String getFirstName () {
      try {
         if (firstName != null && ! firstName.isEmpty())
            return firstName;
         else {
            System.out.println("Your input was empty. Please restart!");
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
      return null;
   }

   public void setFirstName (String firstName) {
      try {
         if (firstName != null && ! firstName.isEmpty())
            this.firstName = firstName;
         else {
            System.out.println("First Name cannot be null or empty. Please restart!");
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   public String getLastName (String lastName) {
      try {
         if (lastName != null && ! lastName.isEmpty())
            return lastName;
         else {
            System.out.println("Your input was empty. Please restart!");
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
      return null;
   }

   public void setLastName (String lastName) {
      try {
         if (lastName != null && ! lastName.isEmpty())
            this.lastName = lastName;
         else {
            System.out.println("Your input was empty. Please restart!");
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
   }


   public int getDateOfBirth () {

      return yearOfBirth;

   }

   public void setDateOfBirth (int yearOfBirth) {
      try {
         if (yearOfBirth > 1900 && yearOfBirth < 2020)
            this.yearOfBirth = yearOfBirth;
         else {
            System.out.println("Your input was out of range (between 1900 - 2020). Please restart!");
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   public String getGender () {
      return gender;
   }

   public void setGender (String gender) {
      try {
         if (gender != null && ! gender.isEmpty() && gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female"))
            this.gender = gender;
         else {
            System.out.println("Your input was empty or not male or female. Please restart!");
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   public String getID (String id) {
      return ID;
   }

   public void setID (String ID) {
      try {
         if (ID != null && ! ID.isEmpty())
            this.ID = ID;
         else {
            System.out.println("Your input was empty. Please restart!");
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
   }


   @Override
   public void addStudent (Student student) {
      try {
         if (student != null)
            a.add(student);
         else {
            System.out.println("One of your inputs was empty. Please restart!");
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   @Override
   public void deleteStudent (String id) {
      try {
         if (ID != null && ! ID.isEmpty())
            a.remove(Student.this.ID);
         else {
            System.out.println("Your input was empty. Please restart!");
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   @Override
   public void selectStudentBasedOnAge (int age) {
      try {
         for (Student student : a) {
            if (student.age == age) {

               System.out.println(student.firstName + student.lastName + student.yearOfBirth + student.ID + student.gender);
            } else {
               System.out.println("Your input was empty or not in range 1900 - 2020. Please restart!");
            }
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   public int listStudentsByYearOfBirth (int yearOfBirth) {
      for (Student student : a) {
         if (yearOfBirth > 1900 && yearOfBirth < 2020 && student.yearOfBirth == yearOfBirth) {
            System.out.println(student.firstName + student.lastName + student.yearOfBirth + student.ID + student.gender);
         } else {
            System.out.println("Your input was empty or not in range 1900 - 2020. Please restart!");

         }
      }
      return yearOfBirth;
   }

}