package com.sample;

import com.sample.model.Student;
import com.sample.model.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String fileName = "ROH-18-000237-05.11.2018.13.03.11.pdf";

        String specimen = fileName.trim().substring(0, fileName.lastIndexOf("-"));

        System.out.println(specimen);


        Student studentOne = new Student();

        studentOne.setId(1);
        studentOne.setFirstname("Alan");
        studentOne.setLastname("Reynolds");

        String models[] = new String[]{"Students", "Subjects", "Faculty"};

        for (String model : models) {
            System.out.println(model);
        }

        List<Student> students = new ArrayList<>();

        System.out.println(specimen);
        System.out.println(specimen);
        System.out.println(specimen);
        System.out.println(specimen);
        System.out.println(specimen);
        System.out.println(specimen);

        students.add(studentOne);



        Subject subject = new Subject();

        subject.setDescription("A Sample description");


    }
}
