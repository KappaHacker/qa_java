package testfeline;


import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestGetFood {
    Feline feline = new Feline();

    @Test
    public void eatMeatReturnFelineFood() {
        List<String> expectedList = List.of("Животные", "Птицы", "Рыба");
        List<String> actualList = null;
        try {
            actualList = feline.eatMeat();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        assertEquals("List isn't equal", expectedList, actualList);
    }
}