package testfeline;


import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGetKittens {
    Feline feline = new Feline();

    @Test
    public void getKittensArgumentNullReturns1() {
        int expectedKittens = feline.getKittens();
        int actualKittens = 1;
        assertEquals("По умолчанию должен быть 1 котенок", actualKittens, expectedKittens);
    }
}