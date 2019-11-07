package Sorting;

import Models.ChiefOfPolice;
import Models.Cop;
import Models.CopManager;
import static Models.CopManager.cops;
import static Models.CopManager.keyboard;
import Models.Lieutenant;
import Models.Officer;
import Models.Sergeant;
import UI.Menu;
import UI.UI;
import Utilities.GenderType;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Sorting {

    public static void nameAscending() {
        UI.printFinish();
        UI.nameHeader();
        cops.stream()
                .sorted((name1, name2) -> name1.getName().compareTo(name2.getName()))
                .map(cop->cop.nameDisplay())
                .forEach(System.out::println);
        UI.printFinish();
    }

    public static void nameDescending() {
        UI.printFinish();
        UI.nameHeader();
        cops.stream()
                .sorted((name1, name2) -> name2.getName().compareTo(name1.getName()))
                .map(cop->cop.nameDisplay())
                .forEach(System.out::println);
        UI.printFinish();
    }

    public static void ageAscending() {
        UI.printFinish();
        UI.ageHeader();
        cops.stream()
                .sorted((Cop cop1, Cop cop2) -> (int) (cop1.getAge() - cop2.getAge()))
                .map(cop->cop.ageDisplay())
                .forEach(System.out::println);
        UI.printFinish();
    }

    public static void ageDescending() {
        UI.printFinish();
        UI.ageHeader();
        cops.stream()
                .sorted((Cop cop1, Cop cop2) -> (int) (cop2.getAge() - cop1.getAge()))
                .map(cop->cop.ageDisplay())
                .forEach(System.out::println);
        UI.printFinish();
    }

    public static void salaryAscending() {
        UI.printFinish();
        UI.salaryHeader();
        cops.stream()
                .sorted((Cop cop1, Cop cop2) -> (int) (cop1.getIndividualBaseSalary() - cop2.getIndividualBaseSalary()))
                .map(cop->cop.salaryDisplay())
                .forEach(System.out::println);
        UI.printFinish();
    }

    public static void salaryDescending() {
        UI.printFinish();
        UI.salaryHeader();
        cops.stream()
                .sorted((Cop cop1, Cop cop2) -> (int) (cop2.getIndividualBaseSalary() - cop1.getIndividualBaseSalary()))
                .map(cop->cop.salaryDisplay())
                .forEach(System.out::println);
        UI.printFinish();
    }

//    public static void arrestAscending() {
//        UI.printHeader();
//        cops.stream()
//                .sorted((Cop cop1, Cop cop2) -> (int) (cop1.getIndividualArrests() - cop2.getIndividualArrests()))
//                .forEach(System.out::println);
//        UI.printFinish();
//    }
//
//    public static void arrestDescending() {
//        UI.printHeader();
//        cops.stream()
//                .sorted((Cop cop1, Cop cop2) -> (int) (cop2.getIndividualArrests() - cop1.getIndividualArrests()))
//                .forEach(System.out::println);
//        UI.printFinish();
//    }
    public static void genderFemaleSort() {
        UI.printFinish();
        UI.genderHeader();
        cops.stream()
                .filter(cop -> cop.getGenderType() == GenderType.FEMALE)
                .map(cop->cop.genderDisplay())
                .forEach(System.out::println);
        UI.printFinish();
    }

    public static void genderMaleSort() {
        UI.printFinish();
        UI.genderHeader();
        cops.stream()
                .filter(cop -> cop.getGenderType() == GenderType.MALE)
                .map(cop->cop.genderDisplay())
                .forEach(System.out::println);
        UI.printFinish();
    }

    public static void genderUnknownSort() {
        UI.printFinish();
        UI.genderHeader();
        cops.stream()
                .filter(cop -> cop.getGenderType() == GenderType.UNKNOWN)
                .map(cop->cop.genderDisplay())
                .forEach(System.out::println);
        UI.printFinish();
    }

    public static void newestCopSort() {
        UI.printFinish();
        UI.departmentHeader();
        cops.stream()
                .sorted((cop1, cop2) -> (int) (cop1.getEmplymentYears() - cop2.getEmplymentYears()))
                .forEach(System.out::println);
        UI.printFinish();
    }

    public static void oldestCopSort() {
        UI.printFinish();
        UI.departmentHeader();
        cops.stream()
                .sorted((cop1, cop2) -> (int) (cop2.getEmplymentYears() - cop1.getEmplymentYears()))
                .map(cop->cop.departmentDisplay())
                .forEach(System.out::println);
        UI.printFinish();
    }

    public static void officerSort() {
        UI.printFinish();
        UI.departmentHeader();
        cops.stream()
                .filter(cop -> cop instanceof Officer)
                .map(cop->cop.departmentDisplay())
                .forEach(System.out::println);
        UI.printFinish();
    }

    public static void sergeantSort() {
        UI.printFinish();
        UI.departmentHeader();
        cops.stream()
                .filter(cop -> cop instanceof Sergeant)
                .map(cop->cop.departmentDisplay())
                .forEach(System.out::println);
        UI.printFinish();
    }

    public static void lieutenantSort() {
        UI.printFinish();
        UI.departmentHeader();
        cops.stream()
                .filter(cop -> cop instanceof Lieutenant)
                .map(cop->cop.departmentDisplay())
                .forEach(System.out::println);
        UI.printFinish();
    }

    public static void chiefOfPoliceSort() {
        UI.printFinish();
        UI.departmentHeader();
        cops.stream()
                .filter(cop -> cop instanceof ChiefOfPolice)
                .map(cop->cop.departmentDisplay())
                .forEach(System.out::println);
        UI.printFinish();
    }

    public static void searchCopWord() {
        System.out.print("Input your searchword or letter");
        String searchWord = CopManager.stringInput();
        UI.printFinish();
        UI.departmentHeader();
        cops.stream()
                .filter(cop -> cop.toString().contains(searchWord))
                .forEach(System.out::println);
        UI.printFinish();
        Menu.upDateAndSetCopMenu();

    }

//    public static List searchCop() {
//        System.out.print("Input search word: ");
//        String searchWord = CopManager.keyboard.nextLine();
//        s = Sorting.findCop(cop -> cop.getName().toLowerCase().contains(searchWord)).forEach(System.out::println);
//        return s;
//    }
}
