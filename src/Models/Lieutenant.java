package Models;

import Statistisc.Statistics;
import UI.UI;
import Utilities.GenderType;
import java.time.LocalDate;

public class Lieutenant extends Cop {

    private String duties;
    private int nCrisis;

    // ADDS A NEW FRESH LIEUTENANT
    public Lieutenant(String name, GenderType gender, LocalDate birthday, String adress) {
        super(name, gender, birthday, adress);
        this.duties = "Supervise work, Evaluate work performance, Pass orders from management to officers and Sergeants, Responds to serious crimes, Administrative work";
    }

    // ADDS A EXISTING COP, PROMOTED LIEUTENANT, FIX LOCALDATE
    public Lieutenant(String name, GenderType gender, LocalDate birthday, String adress, LocalDate dateHired, LocalDate startDatePosition) {
        super(name, gender, birthday, adress, dateHired, startDatePosition);
        this.duties = "Supervise work, Evaluate work performance, Pass orders from management to officers and Sergeants, Responds to serious crimes, Administrative work";
    }

    @Override
    public String toString() {
        return UI.fixLength(getTitle(),11)+"|" + super.toString() + " " + getIndividualBaseSalary();
    }
    
    public String displayLieutenantName() {
        return UI.fixLength(getTitle(),11)+"|" + super.toString() + " " + getIndividualBaseSalary();
    }


    @Override
    public double getBonus() {
        return ((int) ((getYearsInPosition() * 0.05 + getEmplymentYears() * 0.005 + Statistics.getDepartmentArrests() * 0.05) * getIndividualBaseSalary()));
    }

    @Override
    public String getDuties() {
        return duties;
    }

    //OKLART
    @Override
    public double getIndividualBaseSalary() {
        return getBaseSalary() + 15000;
    }

    private String getTitle() {
        return "Lieutenant";
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
