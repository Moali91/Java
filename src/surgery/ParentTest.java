package surgery;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParentTest {
    Parent parent1 = new Parent("Mohammed", "Ali", "someStreet", "IT");

    @Test
    void getFirstName() {
        String actual = parent1.getFirstName();
        Assert.assertEquals("Mohammed",actual);
    }

    @Test
    void setFirstName() {
        String actual = "Mo";
        parent1.setFirstName(actual);
        Assert.assertEquals("Mo",actual);
    }

    @Test
    void getLastName() {
        String actual = parent1.getLastName();
        Assert.assertEquals("Ali",actual);
    }

    @Test
    void setLastName() {
        String actual = "Adam";
        parent1.setLastName(actual);
        Assert.assertEquals("Adam",actual);
    }

    @Test
    void getAddress() {
        String actual = parent1.getAddress();
        Assert.assertEquals("someStreet",actual);
    }

    @Test
    void setAddress() {
        String actual = "bernstreet";
        parent1.setAddress(actual);
        Assert.assertEquals("bernstreet",actual);
    }

    @Test
    void getJob() {
        String actual = parent1.getJob();
        Assert.assertEquals("IT",actual);
    }

    @Test
    void setJob() {
        String actual = "Informatiker";
        parent1.setJob(actual);
        Assert.assertEquals("Informatiker",actual);
    }

    @Test
    void toString1() {
        String actual = parent1.toString();
        Assert.assertEquals("Person{firstName='Mohammed', lastName='Ali', address='someStreet', job='IT'}",actual);
    }
}