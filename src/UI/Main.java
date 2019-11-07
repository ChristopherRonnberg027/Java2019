package UI;

import Models.Sergeant;
import Models.Officer;
import Models.Lieutenant;
import Statistisc.Statistics;
import Models.CopManager;
import Models.ChiefOfPolice;
import Models.Cop;
import Sorting.Sorting;
import Utilities.GenderType;
import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        loadDb();
        Menu.menu();
    }

    public static void loadDb() {

        CopManager.addOfficer(new Officer("Albert Gås", GenderType.MALE, LocalDate.parse("1960-03-12"), "Framtidsgatan 34", LocalDate.parse("2000-05-12"), LocalDate.parse("2000-05-12")));
        CopManager.addOfficer(new Officer("Petra Varg", GenderType.FEMALE, LocalDate.parse("1970-02-13"), "Gunga vägen 5", LocalDate.parse("2001-08-12"), LocalDate.parse("2001-08-12")));

        CopManager.addOfficer(new Officer("Kling Klang", GenderType.MALE, LocalDate.parse("1967-07-12"), "Visbygatan 87", LocalDate.parse("1996-07-27"), LocalDate.parse("1997-06-12")));
        CopManager.addOfficer(new Officer("Saga Hjelm", GenderType.FEMALE, LocalDate.parse("1978-04-14"), "Njurdelsvägen 34", LocalDate.parse("2001-02-05"), LocalDate.parse("2012-06-12")));
        CopManager.addSergeant(new Sergeant("Martin Beck", GenderType.MALE, LocalDate.parse("1956-08-12"), "Portgatan 78", LocalDate.parse("1985-02-05"), LocalDate.parse("2014-03-16")));
        CopManager.addSergeant(new Sergeant("Lena Gam", GenderType.UNKNOWN, LocalDate.parse("1956-08-12"), "Portgatan 78", LocalDate.parse("1985-02-05"), LocalDate.parse("2010-03-16")));
        CopManager.addSergeant(new Sergeant("Alf Johnsson", GenderType.MALE, LocalDate.parse("1968-11-28"), "Portgatan 78", LocalDate.parse("2001-09-11"), LocalDate.parse("2005-12-13")));
        CopManager.addLieutenant(new Lieutenant("Linda Gullbrandsson", GenderType.FEMALE, LocalDate.parse("1986-07-09"), "Helgumsvägen 4", LocalDate.parse("2002-09-12"), LocalDate.parse("2010-03-12")));
        CopManager.addLieutenant(new Lieutenant("John McClane", GenderType.MALE, LocalDate.parse("1955-04-17"), "Nacatomiplaza Av. 4", LocalDate.parse("1987-02-05"), LocalDate.parse("2000-06-12")));
        CopManager.addChiefOfPolice(new ChiefOfPolice("Knas Apock", GenderType.MALE, LocalDate.parse("1949-03-03"), "Västberga Alle 5", LocalDate.parse("2001-02-05"), LocalDate.parse("2009-02-12"), 10));
    }

}
