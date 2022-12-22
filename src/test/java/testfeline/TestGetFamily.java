package testfeline;

import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestGetFamily {

    Feline feline = new Feline();

    @Test
    public void getFamilyTest() {

        String actual = feline.getFamily();
        String expected = "Кошачьи";
        assertEquals("Семейство не совпадает", expected, actual);
    }
}