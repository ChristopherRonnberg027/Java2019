package UI;

import Utilities.GenderType;

public class UI {

    private static String misc = "| ";
    private static int departmentRange = 11;
    private static int idRange = 5;
    private static int nameRange = 20;
    private static int ageRange = 3;
    private static int genderRange = 8;
    private static int salaryRange = 8;

    private static int kategoriRange = 30;

    public static void printHeader() {
        System.out.println("===================================================================");
        //System.out.println(regularKategori());

    }

    public static void blankLines4() {
        int numberOfBlanks = 4;
        for (int i = 0; i < numberOfBlanks; i++) {
            System.out.println("\n");
        }
    }

    public static void blankLines8() {
        int numberOfBlanks = 8;
        for (int i = 0; i < numberOfBlanks; i++) {
            System.out.println("\n");
        }
    }

    public static void blankLines() {
        int numberOfBlanks = 100;
        for (int i = 0; i < numberOfBlanks; i++) {
            System.out.println("\n");
        }
    }

    public static void departmentHeader() {
        System.out.println(fixLength("Department", departmentRange) + misc + fixLength("ID", idRange) + misc + fixLength("Name", nameRange) + misc + fixLength("Age", ageRange) + misc + fixLength("Gender", genderRange) + misc + fixLength("Salary", salaryRange));
    }

    public static void salaryHeader() {
        System.out.println(fixLength("Salary", salaryRange) + misc + fixLength("Department", departmentRange) + misc + fixLength("ID", idRange) + misc + fixLength("Name", nameRange) + misc + fixLength("Age", ageRange) + misc + fixLength("Gender", genderRange));
    }

    public static void genderHeader() {
        System.out.println(fixLength("Gender", genderRange) + misc + fixLength("Department", departmentRange) + misc + fixLength("ID", idRange) + misc + fixLength("Name", nameRange) + misc + fixLength("Age", ageRange) + misc + fixLength("Salary", salaryRange));
    }

    public static void ageHeader() {
        System.out.println(fixLength("Age", ageRange) + misc + fixLength("Department", departmentRange) + misc + fixLength("ID", idRange) + misc + fixLength("Name", nameRange) + misc + fixLength("Gender", genderRange) + misc + fixLength("Salary", salaryRange));
    }

    public static void nameHeader() {
        System.out.println(fixLength("Name", nameRange) + misc + fixLength("Department", departmentRange) + misc + fixLength("ID", idRange) + misc + fixLength("Age", ageRange) + misc + fixLength("Gender", genderRange) + misc + fixLength("Salary", salaryRange));
    }

    public static void printFinish() {
        System.out.println("===================================================================");
    }

    public static void uiLine() {
        System.out.println("___________________________________________________________________\n");
    }

    public static String fixLength(String start, int length) {
        if (start.length() >= length) {
            return start.substring(0, length);
        } else {
            while (start.length() < length) {
                start += " ";
            }
            return start;
        }
    }

    public static String fixLength(int start, int length) {
        String startString = String.valueOf(start);
        return UI.fixLength(startString, length);
    }

    public static String fixLength(double start, int length) {
        String startString = String.valueOf(start);
        return UI.fixLength(startString, length);
    }

    public static String fixLength(GenderType gender, int length) {
        String startString = String.valueOf(gender);
        return UI.fixLength(startString, length);
    }

    public static String getMisc() {
        return misc;
    }

    public static int getDepartmentRange() {
        return departmentRange;
    }

    public static int getIdRange() {
        return idRange;
    }

    public static int getNameRange() {
        return nameRange;
    }

    public static int getAgeRange() {
        return ageRange;
    }

    public static int getGenderRange() {
        return genderRange;
    }

    public static int getSalaryRange() {
        return salaryRange;
    }

    public static int getKategoriRange() {
        return kategoriRange;
    }
}
