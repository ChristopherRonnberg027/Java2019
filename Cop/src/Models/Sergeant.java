package Models;

import Models.Cop;
import UI.UI;
import Utilities.GenderType;
import java.time.LocalDate;

public class Sergeant extends Cop {

    private String duties;

    //  ADDS A NEW FRESH SERGEANT
    public Sergeant(String name, GenderType gender, LocalDate birthday, String adress) {
        super(name, gender, birthday, adress);
        this.duties = "Investigate criminal cases, Supervise and train personnel, Administrative work with reports and inventory, Assist lieutenant";
    }

    // ADDS A EXISTING SEARGENT, PROMOTED, FIX LOCALDATE
    public Sergeant(String name, GenderType gender, LocalDate birthday, String adress, LocalDate dateHired, LocalDate startDatePosition) {
        super(name, gender, birthday, adress, dateHired, startDatePosition);
        this.duties = "Investigate criminal cases, Supervise and train personnel, Administrative work with reports and inventory, Assist lieutenant";
    }

    @Override
    public String toString() {
        return UI.fixLength(getTitle(),11)+"|" + super.toString() + " " + getIndividualBaseSalary();
    }
   
    public String displaySergeantName() {
        return UI.fixLength(getTitle(),11)+"|" + super.toString() + " " + getIndividualBaseSalary();
    }


    @Override
    public double getBonus() {
        return ((int) ((getYearsInPosition() * 0.05 + getEmplymentYears() * 0.005 + getIndividualArrests() * 0.005) * getIndividualBaseSalary()));
    }

    @Override
    public String getDuties() {
        return duties;
    }

    @Override
    public double getIndividualBaseSalary() {
        return getBaseSalary() + 5000;
    }

    private String getTitle() {
        return "Sergeant";
    }
    
    @Override
    public String departmentDisplay() {
        return UI.fixLength(getTitle(), UI.getDepartmentRange()) + UI.getMisc() + UI.fixLength(getBadgeId(), UI.getIdRange()) + UI.getMisc() + UI.fixLength(getName(), UI.getNameRange()) + UI.getMisc() + UI.fixLength(getAge(), UI.getAgeRange()) + UI.getMisc() + UI.fixLength(getGenderType(), UI.getGenderRange()) + UI.getMisc() + UI.fixLength(getIndividualBaseSalary(), UI.getSalaryRange());
    }

    @Override
    public String salaryDisplay() {
        return UI.fixLength(getIndividualBaseSalary(), UI.getSalaryRange()) + UI.getMisc() + UI.fixLength(getTitle(), UI.getDepartmentRange()) + UI.getMisc() + UI.fixLength(getBadgeId(), UI.getIdRange()) + UI.getMisc() + UI.fixLength(getName(), UI.getNameRange()) + UI.getMisc() + UI.fixLength(getAge(), UI.getAgeRange()) + UI.getMisc() + UI.fixLength(getGenderType(), UI.getGenderRange());
    }

    @Override
    public String genderDisplay() {
        return UI.fixLength(getGenderType(), UI.getGenderRange()) + UI.getMisc() + UI.fixLength(getTitle(), UI.getDepartmentRange()) + UI.getMisc() + UI.fixLength(getBadgeId(), UI.getIdRange()) + UI.getMisc() + UI.fixLength(getName(), UI.getNameRange()) + UI.getMisc() + UI.fixLength(getAge(), UI.getAgeRange()) + UI.getMisc() + UI.fixLength(getIndividualBaseSalary(), UI.getSalaryRange());
    }

    @Override
    public String ageDisplay() {
        return UI.fixLength(getAge(), UI.getAgeRange()) + UI.getMisc() + UI.fixLength(getTitle(), UI.getDepartmentRange()) + UI.getMisc() + UI.fixLength(getBadgeId(), UI.getIdRange()) + UI.getMisc() + UI.fixLength(getName(), UI.getNameRange()) + UI.getMisc() + UI.fixLength(getGenderType(), UI.getGenderRange()) + UI.getMisc() + UI.fixLength(getIndividualBaseSalary(), UI.getSalaryRange());
    }

    @Override
    public String nameDisplay() {
        return UI.fixLength(getName(), UI.getNameRange()) + UI.getMisc() + UI.fixLength(getTitle(), UI.getDepartmentRange()) + UI.getMisc() + UI.fixLength(getBadgeId(), UI.getIdRange()) + UI.getMisc() + UI.fixLength(getAge(), UI.getAgeRange()) + UI.getMisc() + UI.fixLength(getGenderType(), UI.getGenderRange()) + UI.getMisc() + UI.fixLength(getIndividualBaseSalary(), UI.getSalaryRange());
    }
}
