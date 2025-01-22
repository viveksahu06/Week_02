/*
Problem 5: University Management System
Description: Model a university system with Student, Professor, and Course classes.
 Students enroll in courses, and professors teach courses. 
Ensure students and professors can communicate through methods like enrollCourse() and assignProfessor().
Goal: Use association and aggregation to create a university system that emphasizes 
relationships and interactions among students, professors, and courses.
*/
package com.problems_self.training;

import java.util.ArrayList;
import java.util.List;

class Course {
    private String courseName;
    private Professor professor;
    private List<Student> students;

    //constructer to assign
    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }
    //getting value
    public String getCourseName() {
        return courseName;
    }
    //getting professsor name
    public Professor getProfessor() {
        return professor;
    }
    //assigning professor
    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }
    //adding studnet
    public void addStudent(Student student) {
        students.add(student);
    }
    //get all student
    public List<Student> getStudents() {
        return students;
    }
    //display details
    public void showCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Professor: " + professor.getName());
        System.out.println("Enrolled Students: ");
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}

// Student class representing a student in the university
class Student {
    private String name;
    private List<Course> courses;
    //inintialize by constructer
    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    //get student name
    public String getName() {
        return name;
    }
    //enrolling studnent to course
    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this); 
    }

    //display all course
    public List<Course> getCourses() {
        return courses;
    }

    //display student details
    public void showStudentDetails() {
        System.out.println("Student: " + name);
        System.out.println("Enrolled in Courses: ");
        for (Course course : courses) {
            System.out.println(course.getCourseName());
        }
    }
}

// Professor class representing a professor in the university
class Professor {
    private String name;
    private List<Course> courses;

    //assign professor
    public Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }
    //get professor name
    public String getName() {
        return name;
    }

    //course taught by teacher
    public void teachCourse(Course course) {
        courses.add(course);
        course.assignProfessor(this); 
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void showProfessorDetails() {
        System.out.println("Professor: " + name);
        System.out.println("Teaching Courses: ");
        for (Course course : courses) {
            System.out.println(course.getCourseName());
        }
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create professors
        Professor professor1 = new Professor("Dr. Suraj");
        Professor professor2 = new Professor("Dr. Pratham");

        // Create courses
        Course course1 = new Course("Computer Science 101");
        Course course2 = new Course("Artificial Intelligence 101");

        // Assign professors to courses
        professor1.teachCourse(course1);
        professor2.teachCourse(course2);

        // Create students
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Students enroll in courses
        student1.enrollCourse(course1);
        student2.enrollCourse(course2);
        student2.enrollCourse(course1); // Bob also enrolls in CS101

        // Display details
        System.out.println("----- Professor Details -----");
        professor1.showProfessorDetails();
        professor2.showProfessorDetails();

        System.out.println("\n----- Student Details -----");
        student1.showStudentDetails();
        student2.showStudentDetails();

        System.out.println("\n----- Course Details -----");
        course1.showCourseDetails();
        course2.showCourseDetails();
    }
}

