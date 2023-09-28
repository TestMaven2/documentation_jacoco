package student_app;

import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class StudentServiceTest {

    private StudentService service;

    @Before
    public void init() {
        service = new StudentService();
        service.add(new Student(1, ""));
    }

    @Test
    public void addTest() {
        service.add(new Student(2, ""));
        assertTrue(true);
    }

    @Test
    public void getTest() {
        service.getById(1);
        assertTrue(true);
    }

    @Test(expected = NoSuchElementException.class)
    public void getExc() {
        service.getById(3);
    }
}