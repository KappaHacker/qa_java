package testfeline;

import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TestClassFeline {

    Feline feline = new Feline();

    @Test
    public void getFamilyTest() {

        String actual = feline.getFamily();
        String expected = "Кошачьи";
        assertEquals("Семейство не совпадает", expected, actual);
    }

    @Test
    public void eatMeatReturnFelineFood() throws Exception {
        List<String> expectedList = List.of("Животные", "Птицы", "Рыба");
        List<String> actualList = null;
        actualList = feline.eatMeat();
        assertEquals("List isn't equal", expectedList, actualList);
    }

    @Test
    public void getKittensArgumentNullReturns1() {
        int actualKittens = feline.getKittens();
        int expectedKittens = 1;
        assertEquals("По умолчанию должен быть 1 котенок", expectedKittens, actualKittens);
    }
}