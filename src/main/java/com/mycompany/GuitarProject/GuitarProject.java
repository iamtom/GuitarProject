package com.mycompany.GuitarProject;

/**
 *
 * @author Tom
 */
import java.util.Scanner;

public class GuitarProject {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                    
        System.out.println("Welcome to the guitar builder.");
        
        while (true) {
            System.out.println("Would you like to build a new guitar? Y/N");
        
            if (scanner.nextLine().equals("Y")) {      
                buildNewGuitar();            
            } else {
                System.out.println("Ok bye!");
                break;
            }
        }                 
    }
    
    public static void buildNewGuitar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("What would you like to name your guitar?");
        String guitarName = scanner.nextLine();
        //check name not taken

        System.out.println("What make is it?");
        String guitarMake = scanner.nextLine();

        System.out.println("What model is it?");
        String guitarModel = scanner.nextLine();

        System.out.println("What type is it? For example electric, acoustic, or classical.");
        String guitarType = scanner.nextLine();

        System.out.println("How many strings does it have?");
        int guitarStrings = Integer.valueOf(scanner.nextLine());

        System.out.println("What tuning is it? Please format like EADGBE");
        String guitarTuning = scanner.nextLine();

        Guitar newGuitar = new Guitar(guitarName, guitarMake, guitarModel, guitarType, guitarStrings, guitarTuning);
        
        System.out.println("");
        System.out.println(newGuitar);
        System.out.println("");       
    }
}
