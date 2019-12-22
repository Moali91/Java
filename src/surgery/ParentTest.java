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
        String actual = "Mohammed";
        Assert.assertEquals("Mohammed",actual);
    }

    @Test
    void getLastName() {
        String actual = parent1.getLastName();
        Assert.assertEquals("Ali",actual);
    }

    @Test
    void setLastName() {
        String actual = "Ali";
        Assert.assertEquals("Ali",actual);
    }

    @Test
    void getAddress() {
        String actual = parent1.getAddress();
        Assert.assertEquals("someStreet",actual);
    }

    @Test
    void setAddress() {
        String actual = "SomeStreet";
        Assert.assertEquals("SomeStreet",actual);
    }

    @Test
    void getJob() {
        String actual = parent1.getJob();
        Assert.assertEquals("IT",actual);
    }

    @Test
    void setJob() {
        String actual = "IT";
        Assert.assertEquals("IT",actual);
    }

    @Test
    void toString1() {
        String actual = parent1.toString();
        Assert.assertEquals("Person{firstName='Mohammed', lastName='Ali', address='someStreet', job='IT'}",actual);
    }
}