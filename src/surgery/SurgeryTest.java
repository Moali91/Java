package surgery;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;


class SurgeryTest {
    Surgery surgery = new Surgery("Test Surgery");


    @BeforeEach
    public void init() {
        surgery.addPatient("Jim","Johnson",LocalDate.of(2000, 12, 12),"Jack","Johnson","Somestreet","IT");
        surgery.addVacc("Jim","Johnson","Tetanus",LocalDate.of(2018, 12, 12),LocalDate.of(2020, 12, 12));
        surgery.addPatient("Jack","Smith",LocalDate.of(2000, 12, 12),"Anna","Smith","Somestreet","Engineer");
        surgery.addVacc("Jack","Smith","Measles",LocalDate.of(2018, 12, 12),LocalDate.of(2019, 12, 12));
        surgery.addPatient("Mohammed","Ali",LocalDate.of(2000,12,12),"Adam","Ali","Somestreet","IT");

    }



    @Test
    void addPatient() {
        surgery.addPatient("Mohammed","Ali",LocalDate.of(2000,12,12),"Adam","Ali","Somestreet","IT");
        boolean actual = surgery.isPatient("Mohammed","Ali");
        Assert.assertEquals(true,actual);
    }

    @Test
    void addCheckup() {
        surgery.addCheckup("Jim","Johnson",LocalDate.now(),178,78,38,true);
    }

    @Test
    void addVacc() {
        surgery.addVacc("Mohammed","Ali","Measles",LocalDate.of(2018, 12, 12),LocalDate.of(3000, 12, 12));
        boolean actual = surgery.checkVacc("Mohammed","Ali");
        Assert.assertEquals(true,actual);


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
        boolean actual2 = surgery.isPatient("Moha","Ali");
        Assert.assertEquals(false,actual2);

    }

}