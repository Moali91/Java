package surgery;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;


class SurgeryTest {
    Surgery surgery = new Surgery("Test Surgery");
    Patient patient = new Patient("Jim","Johnson", LocalDate.of(2000, 12, 12),"Jack","Johnson","Somestreet","IT");



    @Test
    void addPatient() {
        surgery.addPatient("Mohammed","Ali",LocalDate.of(2000,12,12),"Adam","Ali","Somestreet","IT");
        surgery.addPatient("Jack","Smith",LocalDate.of(2000, 12, 12),"Anna","Smith","Somestreet","Engineer");


    }

    @Test
    void addCheckup() {
        surgery.addCheckup("Jim","Johnson",LocalDate.now(),178,78,38,true);
    }

    @Test
    void addVacc() {
        surgery.addVacc("Jack","Smith","Measles",LocalDate.of(2018, 12, 12),LocalDate.of(2019, 12, 12));

    }

    @Test
    void checkVacc() {
        boolean actual = surgery.checkVacc("Jack","Smith");
        Assert.assertEquals(false,actual);
    }

    @Test
    void isPatient() {
        boolean actual = surgery.isPatient("Mohammed","Ali");
        Assert.assertEquals(true,actual);
    }

    @Test
    void init() {
    }
}