package com.sample;

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


    }
}
