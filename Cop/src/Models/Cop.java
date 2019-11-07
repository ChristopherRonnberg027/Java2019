package Models;

import UI.UI;
import Utilities.GenderType;
import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.YEARS;

public abstract class Cop {

    private String name;//
    private LocalDate birthday;//
    private String adress;//
    private LocalDate dateHired;//
    private LocalDate startDatePosition;//
    private int individualArrests;//
    private final int badgeId;//
    private GenderType gender;

    private static int badgeIdCounter = 1;//
    private static int numberOfCops;//
    protected final double baseSalary = 25000;//

    public abstract double getBonus();

    public abstract String getDuties();

    public abstract double getIndividualBaseSalary();

    // FOR SORTPRINT
    public abstract String departmentDisplay();
    public abstract String salaryDisplay();
    public abstract String genderDisplay();
    public abstract String ageDisplay();
    public abstract String nameDisplay();

    // FOR ADDING NEW FRESH COP
    public Cop(String name, GenderType gender, LocalDate birthday, String adress) {
        this.name = name;
        this.gender = gender;
        this.adress = adress;
        this.dateHired = LocalDate.now();
        this.badgeId = badgeIdCounter;
        numberOfCops++;
        badgeIdCounter++;
        this.birthday = birthday;
    }

    public Cop(String name, GenderType gender, LocalDate birthday, String adress, LocalDate dateHired, LocalDate startDatePosition) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.adress = adress;
        this.dateHired = dateHired;
        this.startDatePosition = startDatePosition;
        //this.individualArrests = individualArrests;
        this.badgeId = badgeIdCounter;
        numberOfCops++;
        badgeIdCounter++;
    }

    @Override
    public String toString() {
        return " " + UI.fixLength(badgeId, 4) + " | " + UI.fixLength(name, 20) + "| " + getAge() + " | " + UI.fixLength(gender, 8) + "|";
    }

    public String displayName() {
        return " " + UI.fixLength(badgeId, 4) + " | " + UI.fixLength(name, 20) + "| " + getAge() + " | " + UI.fixLength(gender, 8) + "|";
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public GenderType getGenderType() {
        return gender;
    }

    public long getAge() {
        return YEARS.between(birthday, LocalDate.now());
    }

    public String getAdress() {
        return adress;
    }

    public LocalDate getDateHired() {
        return dateHired;
    }

    public LocalDate getStartDatePosition() {
        return startDatePosition;
    }

    public int getIndividualArrests() {
        return individualArrests;
    }

    public int getBadgeId() {
        return badgeId;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setStartDatePosition(LocalDate startDatePosition) {
        this.startDatePosition = startDatePosition;
    }

    public void setIndividualArrests(int individualArrests) {
        this.individualArrests = individualArrests;
    }

    public static int getNumberOfCops() {
        return numberOfCops;
    }

    // PROBLEM!
    public long getEmplymentYears() {
        return YEARS.between(dateHired, LocalDate.now());
    }

    // PROBLEM!
    public double getCompensation() {
        return getIndividualBaseSalary() + getBonus();
    }

    // PROBLEM!
    public long getYearsInPosition() {
        return YEARS.between(startDatePosition, LocalDate.now());
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public void addArrest() {
        System.out.print("Add arrest: ");
        int arrest = CopManager.intInput();
        this.individualArrests = individualArrests + arrest;
    }

    public void setGender(GenderType gender) {
        this.gender = gender;
    }

}
