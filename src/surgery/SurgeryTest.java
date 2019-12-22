package surgery;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class SurgeryTest {


    @Test
    void addPatient() {
        Surgery surgery = new Surgery("Test Surgery");
        surgery.addPatient("Jim","Johnson", LocalDate.of(2000, 12, 12),"Jack","Johnson","Somestreet","IT");


    }

    @Test
    void addCheckup() {
    }

    @Test
    void addVacc() {
    }

    @Test
    void checkVacc() {
    }

    @Test
    void isPatient() {
    }

    @Test
    void init() {
    }
}