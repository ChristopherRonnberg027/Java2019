package Models;

import UI.Menu;
import UI.UI;
import Utilities.GenderType;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class CopManager {

    public static ArrayList<Cop> cops = new ArrayList<>();
    public static Scanner keyboard = new Scanner(System.in);

    public static void addOfficer(Officer of) {
        of.setIndividualArrests(5);
        cops.add(of);
    }

    public static void addOfficer() {
        System.out.print("\nOfficer name");
        String name = stringInput();
        GenderType gender = setCopGender();
        System.out.println("Date of birth");
        LocalDate birthday = setDate();
        System.out.print("Adress");
        String adress = stringInput();
        Officer of = new Officer(name, gender, birthday, adress);
        cops.add(of);
    }

    public static void hireOfficer() {
        System.out.print("\nOfficer name");
        String name = stringInput();
        GenderType gender = setCopGender();
        System.out.println("Date of birth");
        LocalDate birthday = setDate();
        System.out.print("Adress");
        String adress = stringInput();
        System.out.println("Date hired");
        LocalDate dateHired = setDate();
        System.out.println("Start date");
        LocalDate startDatePosition = setDate();
        System.out.print("Number of arrest");
        int individualArrests = intInput();
        Officer of = new Officer(name, gender, birthday, adress, dateHired, startDatePosition);
        of.setIndividualArrests(individualArrests);
        cops.add(of);
    }

    public static void addSergeant(Sergeant se) {
        se.setIndividualArrests(5);
        cops.add(se);
    }

    public static void addSergeant() {
        System.out.print("\nSergeant name");
        String name = stringInput();
        GenderType gender = setCopGender();
        System.out.println("Date of birth");
        LocalDate birthday = setDate();
        System.out.print("Adress");
        String adress = stringInput();
        Sergeant se = new Sergeant(name, gender, birthday, adress);
        cops.add(se);
    }

    public static void hireSergeant() {
        System.out.print("\nSergeant name");
        String name = stringInput();
        GenderType gender = setCopGender();
        System.out.println("Date of birth");
        LocalDate birthday = setDate();
        System.out.print("Adress");
        String adress = stringInput();
        System.out.println("Date hired");
        LocalDate dateHired = setDate();
        System.out.println("Start date");
        LocalDate startDatePosition = setDate();
        System.out.print("Number of arrest");
        int individualArrests = intInput();
        Sergeant se = new Sergeant(name, gender, birthday, adress, dateHired, startDatePosition);
        se.setIndividualArrests(individualArrests);
        cops.add(se);
    }

    public static void addLieutenant(Lieutenant li) {
        cops.add(li);
    }

    public static void addLieutenant() {
        System.out.print("\nLieutenant");
        String name = stringInput();
        GenderType gender = setCopGender();
        System.out.println("Date of birth");
        LocalDate birthday = setDate();
        System.out.print("Adress");
        String adress = stringInput();
        Lieutenant li = new Lieutenant(name, gender, birthday, adress);
        cops.add(li);
    }

    public static void hireLieutenant() {
        System.out.print("\nLieutenant name");
        String name = stringInput();
        GenderType gender = setCopGender();
        System.out.println("Date of birth");
        LocalDate birthday = setDate();
        System.out.print("Adress");
        String adress = stringInput();
        System.out.println("Date hired");
        LocalDate dateHired = setDate();
        System.out.println("Start date");
        LocalDate startDatePosition = setDate();

        Lieutenant li = new Lieutenant(name, gender, birthday, adress, dateHired, startDatePosition);
        cops.add(li);
    }

    public static void addChiefOfPolice(ChiefOfPolice cp) {
        cops.add(cp);
    }

    public static void addChiefOfPolice() {
        System.out.print("\nChief of Police name");
        String name = stringInput();
        GenderType gender = setCopGender();
        System.out.println("Date of birth");
        LocalDate birthday = setDate();
        System.out.print("Adress");
        String adress = stringInput();
        ChiefOfPolice cp = new ChiefOfPolice(name, gender, birthday, adress);
        cops.add(cp);
    }

    public static void hireChiefOfPolice() {
        System.out.println("\nChief of Police name");
        String name = stringInput();
        GenderType gender = setCopGender();
        System.out.println("Date of birth");
        LocalDate birthday = setDate();
        System.out.print("Adress");
        String adress = stringInput();
        System.out.println("Date hired");
        LocalDate dateHired = setDate();
        System.out.println("Start date");
        LocalDate startDatePosition = setDate();
        System.out.println("How many crisis have the does the ChiefOfPolice have?");
        int handledCrisis = intInput();
        ChiefOfPolice cp = new ChiefOfPolice(name, gender, birthday, adress, dateHired, startDatePosition, handledCrisis);
        cops.add(cp);
    }

    public static void removeCopById() {
        printShortList();
        System.out.println("\nWho do you want to fire?");
        System.out.print("Enter Cop ID Badge");
        int id = intInput();
        for (int i = cops.size() - 1; i >= 0; i--) {
            if (cops.get(i).getBadgeId() == id) {
                System.out.println(cops.get(i).getName() + " has been fired\n");
                cops.remove(i);
            }
        }
    }

    public static void printAll() {
        UI.printFinish();
        UI.departmentHeader();
        for (Cop cop : cops) {
            System.out.println(cop.departmentDisplay());
        }
        UI.printFinish();
        Menu.upDateAndSetCopMenu();
    }

    public static void printOneById() {
        printShortList();
        int id = enterCopID();
        Menu.upDateAndSetCopByIDMenu(id);
    }

    public static int enterCopID() {
        System.out.print("Cop ID badge");
        int id = userInputMenuRange(cops.size());
        for (Cop cop : cops) {
            if (cop.getBadgeId() == id) {
                UI.printFinish();
                UI.departmentHeader();
                System.out.println(cop.departmentDisplay());
                UI.printFinish();
            }
        }
        return id;
    }

    public static void printOneByName() {
        printShortList();
        System.out.print("Enter cop name");
        String name = stringInput();
        boolean found = true;
        for (Cop cop : cops) {
            String[] searchName = cop.getName().split(" ");
            if (searchName[0].endsWith(name) || searchName[1].endsWith(name)) {
                UI.printFinish();
                UI.departmentHeader();
                System.out.println(cop.departmentDisplay());
                UI.printFinish();
                Menu.editMenu(cop.getBadgeId());
                found = false;
            }
        }
        if (found) {
            System.out.println("No cop with that name here...");
        }
    }

    public static void printShortList() {
        UI.printFinish();
        UI.departmentHeader();
        for (Cop cop : cops) {
            if (cop instanceof Officer) {
                System.out.println(((Officer) cop).departmentDisplay());

            } else if (cop instanceof Sergeant) {
                System.out.println(((Sergeant) cop).departmentDisplay());

            } else if (cop instanceof Lieutenant) {
                System.out.println(((Lieutenant) cop).departmentDisplay());

            } else if (cop instanceof ChiefOfPolice) {
                System.out.println(((ChiefOfPolice) cop).departmentDisplay());
            }
        }
        UI.printFinish();
    }

    public static int userInputMenuRange(int max) {
        int choice = -1;
        choice = intInput();
        if (choice < 0 || choice > max) {
            System.out.println("Not in range, try again!");
        }
        return choice;
    }

    public static LocalDate setDate() {
        LocalDate date;
        while (true) {
            try {
                System.out.println("Enter date [YYYY-MM-DD]");
                String dateString = keyboard.nextLine();
                date = LocalDate.parse(dateString);
                break;
            } catch (DateTimeParseException e) {
                System.out.println("Wrong input, try again!");
            }
        }
        return date;
    }

    public static GenderType setCopGender() {

        System.out.print("Your gender \n[1]Female [2]Male [0]Unknown]");
        GenderType gender = GenderType.UNKNOWN;
        int genderInput = userInputMenuRange(2);
        switch (genderInput) {
            case 1:
                gender = GenderType.FEMALE;
                break;
            case 2:
                gender = GenderType.MALE;
                break;
            default:
                gender = GenderType.UNKNOWN;
                break;
        }
        return gender;
    }

    public static int intInput() {
        int intInPut = 0;
        boolean loop = true;
        while (loop) {
            System.out.print(": ");
            try {
                intInPut = Integer.parseInt(keyboard.nextLine());
                loop = false;
            } catch (NumberFormatException e) {
                System.out.print("Use numbers");
            }
        }
        return intInPut;

    }

    public static String stringInput() {
        boolean nameIsValid = true;
        String name = "";
        while (nameIsValid) {
            System.out.print(": ");
            char first;
            name = CopManager.keyboard.nextLine();
            if (name.length() > 0) {
                first = name.charAt(0);
                nameIsValid = false;
            } else {
                System.out.println("invalid input, try again");
            }
        }
        return name;
    }

    public static void removeCopByIdTest() {
        UI.uiLine();
        System.out.print("Enter Cop ID Badge");
        UI.uiLine();
        int id = intInput();
        for (int i = cops.size() - 1; i >= 0; i--) {
            if (cops.get(i).getBadgeId() == id) {
                UI.printFinish();
                System.out.println(cops.get(i).getName() + " has been fired\n");
                cops.remove(i);
                UI.printFinish();
            } else {
                UI.printFinish();
                System.out.println("No Cop with that ID here, try another ID");
                UI.printFinish();
            }
        }
    }

    public static int printListAndInputIdToUpdate() {
        UI.uiLine();
        printShortList();
        System.out.print("Enter Cop ID badge to edit");
        int id = userInputMenuRange(cops.size());
        return id;
    }

}
