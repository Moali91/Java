package surgery;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PatientTest {
    String parentName;
    Patient patient = new Patient("Mohammed","Ali", LocalDate.of(1996,5,22),"Adam","Ali","street77","Teacher");
    Checkup checkup = new Checkup(LocalDate.now(),178,78,39,true);

    @Test
    void getFirstName() {
        String actual = patient.getFirstName();
        Assert.assertEquals("Mohammed",actual);
    }

    @Test
    void setFirstName() {
        String actual = "Mo";
        patient.setFirstName(actual);
        Assert.assertEquals("Mo",actual);
    }

    @Test
    void getLastName() {
        String actual = patient.getLastName();
        Assert.assertEquals("Ali",actual);
    }

    @Test
    void setLastName() {
        String actual = "Adam";
        patient.setLastName(actual);
        Assert.assertEquals("Adam",actual);
    }

    @Test
    void getDateOfBirth() {
        LocalDate actual = patient.getDateOfBirth();
        Assert.assertEquals(LocalDate.of(1996,5,22),actual);
    }

    @Test
    void setDateOfBirth() {
        LocalDate actual = LocalDate.of(2000,5,22);
        patient.setDateOfBirth(actual);
        Assert.assertEquals(LocalDate.of(2000,5,22),actual);
    }

    @Test
    void getParentFirstName() {
        String actual = patient.getParentFirstName();
        Assert.assertEquals("Adam",actual);
    }

    @Test
    void setParentFirstName() {
        String actual = "Jenn";
        patient.setFirstName(actual);
        Assert.assertEquals("Jenn",actual);
    }

    @Test
    void getParentLastName() {
        String actual = patient.getParentLastName();
        Assert.assertEquals("Ali",actual);
    }

    @Test
    void setParentLastName() {
        String actual = "Joan";
        patient.setLastName(actual);
        Assert.assertEquals("Joan",actual);
    }

    @Test
    void getParentJob() {
        String actual = patient.getParentJob();
        Assert.assertEquals("Teacher",actual);
    }

    @Test
    void setParentJob() {
        String actual = "IT";
        patient.setLastName(actual);
        Assert.assertEquals("IT",actual);
    }

    @Test
    void addCheckup() {

    }

    @Test
    void addVaccination() {
    }

    @Test
    void expiredVaccinations() {
    }

    @Test
    void toString1() {
    }
}