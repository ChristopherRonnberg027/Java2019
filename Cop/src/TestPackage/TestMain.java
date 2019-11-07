package TestPackage;

import Models.Cop;
import Models.CopManager;
import static Models.CopManager.cops;
import Models.Officer;
import Utilities.GenderType;
import java.time.LocalDate;
import java.util.Scanner;

public class TestMain {
static String myName;
    public static void main(String[] args) {

        String myName = "Christopher Rönnberg";
        System.out.println(myName);
        int spacePosition = myName.indexOf(" ");
        String myFirstName = myName.substring(0, spacePosition);
        String surName = myName.substring(spacePosition+1, myName.length());
        System.out.println(myFirstName);
        System.out.println(surName);
        String space = " ";
        String fullName = (myFirstName+space)+surName;
        System.out.println(fullName);

	
        
        
//        String str = "Hej, vad händer?";
//        String x = String.format("%0$-15s", str);
//        System.out.println(x);
//
//        CopManager.addOfficer(new Officer("John Jonsson", GenderType.MALE, LocalDate.parse("1985-05-12"), "Helgumsvägen 4", LocalDate.parse("2000-05-12"), LocalDate.parse("2010-05-12")));
//        for (Cop currentCop : cops) {
//            if (currentCop.getBadgeId() == 1) {
//                System.out.println(currentCop);
//            }
//        }
    }
    
}
