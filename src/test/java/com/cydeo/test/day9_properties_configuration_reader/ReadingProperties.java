package com.cydeo.test.day9_properties_configuration_reader;

import com.cydeo.test.base.TestBase;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    @Test
    public void reading_from_file_test() throws IOException {
        // 1 - Create the object of Properties class
        // We need properties class to use methods coming from class like load() getProperty("key")
        Properties properties = new Properties();

        // 2 - Create the object of FileInputStream
        // We need this object to open file as a stream in Java memory
        FileInputStream file = new FileInputStream("configuration..properties");

        // 3 - Load the properties object using FileInputStream object
        // Load "properties" object with "file" we opened using FileInputStream
        properties.load(file);

        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
        System.out.println("properties.getProperty(\"env\") = " + properties.getProperty("env"));
        System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));
        System.out.println("properties.getProperty(\"password\") = " + properties.getProperty("password"));


    }
}
