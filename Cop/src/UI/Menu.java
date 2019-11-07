package UI;

import Models.Cop;
import Models.CopManager;
import static Models.CopManager.cops;
import Sorting.Sorting;
import static Models.CopManager.printAll;
import static Models.CopManager.setCopGender;
import static Models.CopManager.setDate;
import static Models.CopManager.stringInput;
import Statistisc.Statistics;
import Utilities.GenderType;
import java.time.LocalDate;
import static Models.CopManager.userInputMenuRange;

public class Menu {

    public static void menu() {
        boolean menuLoop = true;
        while (menuLoop) {
            UI.uiLine();
            System.out.println("MAIN MENU ");
            UI.uiLine();
            System.out.println(UI.fixLength("[1] Management", UI.getKategoriRange()));
            System.out.println(UI.fixLength("[2] Police Force", UI.getKategoriRange()));
            System.out.println(UI.fixLength("[3] Statistics", UI.getKategoriRange()));
            System.out.println("");
            System.out.println(UI.fixLength("[0] Close program", UI.getKategoriRange()));
            UI.uiLine();
            System.out.print("Choose between [1][2][3][0]");
            int menuNumbers = 3;
            int choice = CopManager.userInputMenuRange(menuNumbers);
            switch (choice) {
                case 1:
                    managamentMenu();
                    break;
                case 2:
                    printCopMenu();
                    break;
                case 3:
                    statisticsMenu();
                    break;
                case 0:
                    System.out.println("Exit program");
                    menuLoop = false;
                    break;

            }
        }
    }

    public static void managamentMenu() {
        boolean menuLoop = true;
        while (menuLoop) {
            UI.uiLine();
            System.out.println("MAIN MENU | Management");
            UI.uiLine();
            System.out.println(UI.fixLength("[1] Add/ Hire a new cop", UI.getKategoriRange()));
            System.out.println(UI.fixLength("[2] Edit information", UI.getKategoriRange()));
            System.out.println(UI.fixLength("[3] Fire a cop", UI.getKategoriRange()));
            System.out.println("");
            System.out.println(UI.fixLength("[0] Back to 'Main Menu'", UI.getKategoriRange()));
            UI.uiLine();
            System.out.print("Choose between [1][2][3][0]");
            int menuNumbers2 = 3;
            int case1choice = CopManager.userInputMenuRange(menuNumbers2);
            switch (case1choice) {
                case 1:
                    addHire();
                    break;
                case 2:
                    editMenuShowAll();
                    break;
                case 3:
                    CopManager.removeCopById();
                    break;
                case 0:
                    menuLoop = false;
                    break;
            }
        }
    }

    public static void addHire() {
        boolean menuLoop = true;
        while (menuLoop) {
            UI.uiLine();
            System.out.println("MAIN MENU | Management | Add/ Hire a new cop");
            UI.uiLine();
            System.out.println(UI.fixLength("[1] Register an existing cop", UI.getKategoriRange()));
            System.out.println(UI.fixLength("[2] Hire a new Cop", UI.getKategoriRange()));
            System.out.println("");
            System.out.println("");
            System.out.println(UI.fixLength("[0] Back to 'Management'", UI.getKategoriRange()));
            UI.uiLine();
            System.out.print("Choose between [1][2][0]");
            int choice = userInputMenuRange(2);
            switch (choice) {
                case 1:
                    addNewCop();
                    break;
                case 2:
                    hireANewCop();
                    break;
                case 0:
                    menuLoop = false;
                    break;
            }
        }
    }

    public static void addNewCop() {

        boolean menuLoop = true;
        while (menuLoop) {
            UI.uiLine();
            System.out.println("MAIN MENU | Management | Add/ Hire a new cop | Register an existing cop");
            UI.uiLine();
            System.out.println(UI.fixLength("[1] Officer", UI.getKategoriRange()) + UI.fixLength("[3] Lieutenant", UI.getKategoriRange()));
            System.out.println(UI.fixLength("[2] Sergeant", UI.getKategoriRange()) + UI.fixLength("[4] Chief of Police", UI.getKategoriRange()));
            System.out.println("");
            System.out.println("");
            System.out.println(UI.fixLength("[0] Back to 'Add/ Hire a new employee'", UI.getKategoriRange()));
            UI.uiLine();
            System.out.print("Choose between [1][2][3][4][0]");
            int choice = userInputMenuRange(4);
            switch (choice) {
                case 1:
                    CopManager.addOfficer();
                    break;
                case 2:
                    CopManager.addSergeant();
                    break;
                case 3:
                    CopManager.addLieutenant();
                    break;
                case 4:
                    CopManager.addChiefOfPolice();
                    break;
                case 0:
                    menuLoop = false;
                    break;
            }
        }
    }

    public static void hireANewCop() {
        boolean menuLoop = true;
        while (menuLoop) {
            UI.uiLine();
            System.out.println("MAIN MENU | Management | Add/ Hire a new employee | Hire a new ");
            UI.uiLine();
            System.out.println(UI.fixLength("[1] Officer", UI.getKategoriRange()) + UI.fixLength("[3] Lieutenant", UI.getKategoriRange()));
            System.out.println(UI.fixLength("[2] Sergeant", UI.getKategoriRange()) + UI.fixLength("[4] Chief of Police", UI.getKategoriRange()));
            System.out.println("");
            System.out.println("");
            System.out.println(UI.fixLength("[0] Back to 'Add/ Hire a new employee'", UI.getKategoriRange()));
            UI.uiLine();
            System.out.print("Choose between [1][2][3][4][0]");
            int choice = userInputMenuRange(4);
            switch (choice) {
                case 1:
                    CopManager.hireOfficer();
                    break;
                case 2:
                    CopManager.hireSergeant();
                    break;
                case 3:
                    CopManager.hireLieutenant();
                    break;
                case 4:
                    CopManager.hireChiefOfPolice();
                    break;
                case 0:
                    menuLoop = false;
                    break;
            }
        }
    }

    public static void searchCopMenu() {
        boolean menuLoop = true;
        while (menuLoop) {
            UI.uiLine();
            System.out.println("MAIN MENU | Police Force | Search after Cop by:");
            UI.uiLine();
            System.out.println(UI.fixLength("[1] Name", UI.getKategoriRange()) + UI.fixLength("[3] Searchword", UI.getKategoriRange()));
            System.out.println(UI.fixLength("[2] Cop ID badge", UI.getKategoriRange()));
            System.out.println("");
            System.out.println("");
            System.out.println(UI.fixLength("[0] Back to 'Police Force'", UI.getKategoriRange()));
            UI.uiLine();
            System.out.print("Choose between [1][2][3][0]");
            int menuNumbers = 3;
            int menuChoice = CopManager.userInputMenuRange(menuNumbers);
            switch (menuChoice) {
                case 1:
                    CopManager.printOneByName();
                    break;
                case 2:
                    CopManager.printOneById();
                    break;
                case 3:
                    Sorting.searchCopWord();
                    break;
                case 0:
                    menuLoop = false;
                    break;

            }
        }
    }

    // NO ID TO UPDATE_SHOW ALL -KLAR?
    public static void upDateAndSetCopMenu() {
        boolean menuLoop = true;
        while (menuLoop) {
            UI.uiLine();
            System.out.println("MAIN MENU | Police Force | Show all");
            UI.uiLine();
            System.out.println(UI.fixLength("[1] Edit", UI.getKategoriRange()) + UI.fixLength("[0] Back to 'Police Force'", UI.getKategoriRange()));
            UI.uiLine();
            System.out.print("Choose between [1][0]");
            int menuNumbers = 1;
            int menuChoice = CopManager.userInputMenuRange(menuNumbers);
            switch (menuChoice) {
                case 1:
                    //editMenuShowAll();
                    editMenuByID();
                    break;
                case 0:
                    menuLoop = false;
                    break;

            }
        }

    }

    // SEARCH AFTER ONE COP_UPDATE WITH ID/NAME-KLAR?
    public static void upDateAndSetCopByIDMenu(int id) {
        boolean menuLoop = true;
        while (menuLoop) {
            UI.uiLine();
            System.out.println("MAIN MENU | Police Force | Search after Cop by");
            UI.uiLine();
            System.out.println(UI.fixLength("[1] Edit", UI.getKategoriRange()) + UI.fixLength("[0] Back to 'Police Force'", UI.getKategoriRange()));
            UI.uiLine();
            System.out.print("Choose between [1][0]");
            int menuNumbers = 1;
            int menuChoice = CopManager.userInputMenuRange(menuNumbers);
            switch (menuChoice) {
                case 1:
                    Menu.editMenu(id);
                    break;
                case 0:
                    menuLoop = false;
                    break;

            }
        }

    }

    public static void printCopMenu() {
        boolean menuLoop = true;
        while (menuLoop) {
            UI.uiLine();
            System.out.println("MAIN MENU | Police Force");
            UI.uiLine();
            System.out.println(UI.fixLength("[1] Show all", UI.getKategoriRange()) + UI.fixLength("[3] Search after Cop", UI.getKategoriRange()));
            System.out.println(UI.fixLength("[2] Sort Cop", UI.getKategoriRange()));
            System.out.println("");
            System.out.println("");
            System.out.println(UI.fixLength("[0] Back to 'MAIN MENU'", UI.getKategoriRange()));
            UI.uiLine();
            System.out.print("Choose between [1][2][3][0]");
            int menuNumbers = 3;
            int menuChoice = CopManager.userInputMenuRange(menuNumbers);
            switch (menuChoice) {
                case 1:
                    printAll();
                    break;
                case 2:
                    sortMenu();
                    break;
                case 3:
                    searchCopMenu();
                    break;
                case 0:
                    menuLoop = false;
                    break;
            }
        }
    }

    public static void sortMenu() {
        boolean menuLoop = true;
        while (menuLoop) {
            UI.uiLine();
            System.out.println("MAIN MENU | Police Force | Sort Cop ");
            UI.uiLine();
            System.out.println(UI.fixLength("[1] by Age", UI.getKategoriRange()) + UI.fixLength("[4] by Gender", UI.getKategoriRange()));
            System.out.println(UI.fixLength("[2] by Name", UI.getKategoriRange()) + UI.fixLength("[5] by Employee years", UI.getKategoriRange()));
            System.out.println(UI.fixLength("[3] by Salary", UI.getKategoriRange()) + UI.fixLength("[6] by Department", UI.getKategoriRange()));
            System.out.println("");
            System.out.println(UI.fixLength("[0] Back to 'Police Force'", UI.getKategoriRange()));
            UI.uiLine();
            System.out.print("Choose between [1][2][3][4][5][6][0]");
            int menuNumbers = 6;
            int menuChoice = CopManager.userInputMenuRange(menuNumbers);
            switch (menuChoice) {
                case 1:
                    sortByAgeMenu();
                    break;
                case 2:
                    sortByNameMenu();
                    break;
                case 3:
                    sortBySalaryMenu();
                    break;
//                case 4:
//                    sortByArrestMenu();
//                    break;
                case 4:
                    sortByGenderMenu();
                    break;
                case 5:
                    sortByEmployeeMenu();
                    break;
                case 6:
                    sortByDepartment();
                    break;
                case 0:
                    menuLoop = false;
                    break;
            }

        }
    }

    public static void sortByAgeMenu() {
        boolean menuLoop = true;
        while (menuLoop) {
            UI.uiLine();
            System.out.println("MAIN MENU | Police Force | Sort Cop | Sort by Age ");
            System.out.println("[1] Ascending");
            System.out.println("[2] Descending");
            System.out.println("");
            System.out.println("");
            System.out.println("[0] Back to 'Sort Cop'");
            UI.uiLine();
            System.out.print("Choose between [1][2][0]");
            int menuNumbers = 2;
            int menuChoice = CopManager.userInputMenuRange(menuNumbers);
            switch (menuChoice) {
                case 1:
                    Sorting.ageAscending();
                    menuLoop = false;
                    break;
                case 2:
                    Sorting.ageDescending();
                    menuLoop = false;
                    break;
                case 0:
                    menuLoop = false;
                    break;
            }

        }
    }

    public static void sortBySalaryMenu() {
        boolean menuLoop = true;
        while (menuLoop) {
            UI.uiLine();
            System.out.println("MAIN MENU | Police Force | Sort Cop | Sort by Salary ");
            System.out.println("[1] Ascending");
            System.out.println("[2] Descending");
            System.out.println("");
            System.out.println("");
            System.out.println("[0] Back to 'Sort Cop'");
            UI.uiLine();
            System.out.print("Choose between [1][2][0]");
            int menuNumbers = 2;
            int menuChoice = CopManager.userInputMenuRange(menuNumbers);
            switch (menuChoice) {
                case 1:
                    Sorting.salaryAscending();
                    menuLoop = false;
                    break;
                case 2:
                    Sorting.salaryDescending();
                    menuLoop = false;
                    break;
                case 0:
                    menuLoop = false;
                    break;
            }

        }
    }

    public static void sortByNameMenu() {
        boolean menuLoop = true;
        while (menuLoop) {
            UI.uiLine();
            System.out.println("MAIN MENU | Police Force | Sort Cop | Sort by Name ");
            System.out.println("[1] Ascending");
            System.out.println("[2] Descending");
            System.out.println("");
            System.out.println("");
            System.out.println("[0] Back to 'Sort Cop'");
            UI.uiLine();
            System.out.print("Choose between [1][2][0]");
            int menuNumbers = 2;
            int menuChoice = CopManager.userInputMenuRange(menuNumbers);
            switch (menuChoice) {
                case 1:
                    Sorting.nameAscending();
                    menuLoop = false;
                    break;
                case 2:
                    Sorting.nameDescending();
                    menuLoop = false;
                    break;
                case 0:
                    menuLoop = false;
                    break;
            }

        }
    }

    // EDIT FOR ID
    public static void editMenu(int id) {
        for (Cop cop : cops) {
            if (cop.getBadgeId() == id) {
                UI.printFinish();
                System.out.println("\nEdit " + cop.getName() + " with badge ID number [" + cop.getBadgeId() + "]");
                UI.printFinish();
                boolean menuLoop = true;
                while (menuLoop) {
                    System.out.println(UI.fixLength("[1] Name", UI.getKategoriRange()) + UI.fixLength("[4] Birthdate", UI.getKategoriRange()));
                    System.out.println(UI.fixLength("[2] Gender", UI.getKategoriRange()) + UI.fixLength("[5] Add/Set arrest", UI.getKategoriRange()));
                    System.out.println(UI.fixLength("[3] Adress", UI.getKategoriRange()));
                    System.out.println("");
                    System.out.println(UI.fixLength("[0] Back", UI.getKategoriRange()));
                    UI.uiLine();
                    System.out.print("\nChoose between [1][2][3][4][5][0]");
                    int menuChoice = userInputMenuRange(5);
                    switch (menuChoice) {
                        case 1:
                            upDateCopName(cop);
                            break;
                        case 2:
                            upDateCopGender(cop);
                            break;
                        case 3:
                            upDateCopAdress(cop);
                            break;
                        case 4:
                            upDateBirthDate(cop);
                            break;
                        case 5:
                            arrestHandlingMenu(id);
                            break;
                        case 0:
                            menuLoop = false;
                            break;
                    }
                }
            }
        }
    }

    // EDIT VISAR HELA LISTAN INNAN MAN KAN VÄLJA MED ID
    public static void editMenuShowAll() {
        int id = CopManager.printListAndInputIdToUpdate();
        for (Cop cop : cops) {
            if (cop.getBadgeId() == id) {
                UI.printFinish();
                System.out.println("\nEdit " + cop.getName() + " with badge ID number [" + cop.getBadgeId() + "]");
                UI.printFinish();
                boolean menuLoop = true;
                while (menuLoop) {
                    System.out.println(UI.fixLength("[1] Name", UI.getKategoriRange()) + UI.fixLength("[4] Birthdate", UI.getKategoriRange()));
                    System.out.println(UI.fixLength("[2] Gender", UI.getKategoriRange()) + UI.fixLength("[5] Add/Set arrest", UI.getKategoriRange()));
                    System.out.println(UI.fixLength("[3] Adress", UI.getKategoriRange()));
                    System.out.println("");
                    System.out.println(UI.fixLength("[0] Back", UI.getKategoriRange()));
                    UI.uiLine();
                    System.out.print("\nChoose between [1][2][3][4][5][0]");
                    int menuChoice = userInputMenuRange(5);
                    switch (menuChoice) {
                        case 1:
                            upDateCopName(cop);
                            break;
                        case 2:
                            upDateCopGender(cop);
                            break;
                        case 3:
                            upDateCopAdress(cop);
                            break;
                        case 4:
                            upDateBirthDate(cop);
                            break;
                        case 0:
                            menuLoop = false;
                            break;
                    }
                }
            }
        }
    }

    public static void editMenuByID() {
        System.out.print("Enter Cop ID badge to edit");
        int id = CopManager.intInput();
        for (Cop cop : cops) {
            if (cop.getBadgeId() == id) {
                UI.printFinish();
                System.out.println("\nEdit " + cop.getName() + " with badge ID number [" + cop.getBadgeId() + "]");
                UI.printFinish();
                boolean menuLoop = true;
                while (menuLoop) {
                    System.out.println(UI.fixLength("[1] Name", UI.getKategoriRange()) + UI.fixLength("[4] Birthdate", UI.getKategoriRange()));
                    System.out.println(UI.fixLength("[2] Gender", UI.getKategoriRange()) + UI.fixLength("[5] Add/Set arrest", UI.getKategoriRange()));
                    System.out.println(UI.fixLength("[3] Adress", UI.getKategoriRange()));
                    System.out.println("");
                    System.out.println(UI.fixLength("[0] Back", UI.getKategoriRange()));
                    UI.uiLine();
                    System.out.print("\nChoose between [1][2][3][4][5][0]");
                    int menuChoice = userInputMenuRange(5);
                    switch (menuChoice) {
                        case 1:
                            upDateCopName(cop);
                            break;
                        case 2:
                            upDateCopGender(cop);
                            break;
                        case 3:
                            upDateCopAdress(cop);
                            break;
                        case 4:
                            upDateBirthDate(cop);
                            break;
                        case 0:
                            menuLoop = false;
                            break;
                    }
                }
            }
        }
    }

    // HANDLING ARREST WITH ID
    public static void arrestHandlingMenu(int id) {
        for (Cop cop : cops) {
            if (cop.getBadgeId() == id) {
                UI.printFinish();
                System.out.println("\nHandle " + cop.getName() + " with badge ID number [" + cop.getBadgeId() + "]");
                UI.printFinish();
                System.out.println(UI.fixLength("Number of arrest:", 19) + UI.fixLength(cop.getIndividualArrests(), 4));
                boolean menuLoop = true;
                while (menuLoop) {
                    System.out.println("[1] Add arrest");
                    System.out.println("[2] Set arrest");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("[0] Back");
                    System.out.print("\nChoose between [1][2][0]");
                    int menuChoice = userInputMenuRange(2);
                    switch (menuChoice) {
                        case 1:
                            adArrestMenu(cop);
                            break;
                        case 2:
                            setArrestMenu(cop);
                            break;
                        case 0:
                            menuLoop = false;
                            break;

                    }
                }
            }
        }
    }

    public static void setArrestMenu(Cop cop) {
        UI.uiLine();
        System.out.print("Set arrest");
        int setArrest = CopManager.intInput();
        UI.uiLine();
        cop.setIndividualArrests(setArrest);
        UI.printFinish();
        System.out.println(cop.getName() + " has now a total of arrest: " + cop.getIndividualArrests());
        UI.printFinish();
    }

    public static void adArrestMenu(Cop cop) {
        UI.uiLine();
        cop.addArrest();
        UI.uiLine();
        UI.printFinish();
        System.out.println(cop.getName() + " has now a total of arrest: " + cop.getIndividualArrests());
        UI.printFinish();
    }

    public static void upDateBirthDate(Cop cop) {
        UI.uiLine();
        System.out.println("Update " + cop.getName() + " birth date");
        LocalDate newBirthday = setDate();
        UI.uiLine();
        cop.setBirthday(newBirthday);
        System.out.println(cop.getName() + "s birth date updated\n");
        UI.printFinish();
        UI.departmentHeader();
        System.out.println(cop.departmentDisplay());
        UI.printFinish();
    }

    public static void upDateCopAdress(Cop cop) {
        UI.uiLine();
        System.out.print("Update " + cop.getName() + " adress");
        String newAdress = stringInput();
        UI.uiLine();
        cop.setAdress(newAdress);
        System.out.println(cop.getName() + "s adress updated\n");
        UI.printFinish();
        UI.departmentHeader();
        System.out.println(cop.departmentDisplay());
        UI.printFinish();
    }

    public static void upDateCopGender(Cop cop) {
        UI.uiLine();
        System.out.println("Enter " + cop.getName() + " new gender");
        GenderType gender = setCopGender();
        UI.uiLine();
        cop.setGender(gender);
        UI.printFinish();
        System.out.println(cop.getName() + " has now the gender " + cop.getGenderType());
        UI.printFinish();
    }

    public static void upDateCopName(Cop cop) {
        UI.uiLine();
        System.out.print("Update cops name");
        String newName = stringInput();
        UI.uiLine();
        cop.setName(newName);
        System.out.println(newName + "s name updated\n");
        UI.printFinish();
        UI.departmentHeader();
        System.out.println(cop.departmentDisplay());
        UI.printFinish();
    }

    public static void statisticsMenu() {

        boolean menuLoop = true;
        while (menuLoop) {
            UI.uiLine();
            System.out.println("MAIN MENU | Statistics");
            UI.uiLine();
            System.out.println("[1] Statistics per Department");
            System.out.println("[2] Statistics per Rang");
            System.out.println("[3] Pay-check statistics");
            System.out.println("");
            System.out.println("[0] Back to 'MAIN MENU'");
            UI.uiLine();
            System.out.print("Choose between [1][2][3][0]");
            int menuNumberMaxValue = 3;
            int choice = userInputMenuRange(menuNumberMaxValue);
            switch (choice) {
                case 1:
                    Statistics.printStatsPerDepartment();
                    break;
                case 2:
                    Statistics.printStatsPerRang();
                    break;
                case 3:
                    Statistics.printPayCheckStatistics();
                    break;
                case 0:
                    menuLoop = false;
                    break;
            }
        }
    }

    public static void sortByGenderMenu() {
        boolean menuLoop = true;
        while (menuLoop) {
            UI.uiLine();
            System.out.println("MAIN MENU | Police Force | Sort Cop | Sort by Gender");
            UI.uiLine();
            System.out.println(UI.fixLength("[1] Female", UI.getKategoriRange()) + UI.fixLength("[3] Unknown", UI.getKategoriRange()));
            System.out.println(UI.fixLength("[2] Male", UI.getKategoriRange()));
            System.out.println();
            System.out.println("");
            System.out.println("[0] Back to 'Sort Cop'");
            UI.uiLine();
            System.out.print("Choose between [1][2][3][0]");
            int menuNumberMaxValue = 3;
            int choice = userInputMenuRange(menuNumberMaxValue);
            switch (choice) {
                case 1:
                    Sorting.genderFemaleSort();
                    break;
                case 2:
                    Sorting.genderMaleSort();
                    break;
                case 3:
                    Sorting.genderUnknownSort();
                    break;
                case 0:
                    menuLoop = false;
                    break;
            }
        }
    }

    public static void sortByEmployeeMenu() {
        boolean menuLoop = true;
        while (menuLoop) {
            UI.uiLine();
            System.out.println("MAIN MENU | Police Force | Sort Cop | Sort by Employee years");
            UI.uiLine();
            System.out.println("[1] Newest");
            System.out.println("[2] Oldest");
            System.out.println("");
            System.out.println("");
            System.out.println("[0] Back to 'Sort Cop'");
            UI.uiLine();
            System.out.print("Choose between [1][2][0]");
            int menuNumberMaxValue = 2;
            int choice = userInputMenuRange(menuNumberMaxValue);
            switch (choice) {
                case 1:
                    Sorting.newestCopSort();
                    break;
                case 2:
                    Sorting.oldestCopSort();
                    break;
                case 0:
                    menuLoop = false;
                    break;
            }
        }
    }

    public static void sortByDepartment() {
        boolean menuLoop = true;
        while (menuLoop) {
            UI.uiLine();
            System.out.println("MAIN MENU | Police Force | Sort Cop | Sort by Deparment");
            UI.uiLine();
            System.out.println(UI.fixLength("[1] Officer", UI.getKategoriRange()) + UI.fixLength("[3] Lieutenant", UI.getKategoriRange()));
            System.out.println(UI.fixLength("[2] Sergeant", UI.getKategoriRange()) + UI.fixLength("[4] Chief of Police", UI.getKategoriRange()));
            System.out.println();
            System.out.println();
            System.out.println("[0] Back to 'Sort Cop'");
            UI.uiLine();
            System.out.print("Choose between [1][2][3][4][0]");
            int menuNumberMaxValue = 4;
            int choice = userInputMenuRange(menuNumberMaxValue);
            switch (choice) {
                case 1:
                    Sorting.officerSort();
                    break;
                case 2:
                    Sorting.sergeantSort();
                    break;
                case 3:
                    Sorting.lieutenantSort();
                    break;
                case 4:
                    Sorting.chiefOfPoliceSort();
                    break;
                case 0:
                    menuLoop = false;
                    break;
            }
        }
    }

}
