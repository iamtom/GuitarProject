package com.mycompany.GuitarProject;

/**
 *
 * @author Tom
 */
import java.util.Scanner;

public class Guitar {
    private String name;
    private String make;
    private String model;
    private String type;
    private int numberOfStrings;
    private String tuning;

    public Guitar(String name, String make, String model, String type, int numberOfStrings, String tuning) {
        this.name = name;
        this.make = make;
        this.model = model;
        this.type = type;
        this.numberOfStrings = numberOfStrings;
        this.tuning = tuning;
    }
    
    public String toString() {
        return "Name: " + this.name + "\nMake: " + this.make + "\nModel: " + this.model + "\nType: " + this.type + "\nNo. Of Strings: " + this.numberOfStrings + "\nTuning: " + this.tuning;                
    }
}
