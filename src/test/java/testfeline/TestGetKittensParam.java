package testfeline;

import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestGetKittensParam {

    public int kittens;

    public int expectedKittens;

    Feline feline = new Feline();

    public TestGetKittensParam(int kittens, int expectedKittens) {
        this.kittens = kittens;
        this.expectedKittens = expectedKittens;
    }

    @Parameterized.Parameters(name = "количество котят передали: {0}, ожидаем : {1}")
    public static Object[][] parameters() {
        return new Object[][]{
                {1, 1},
                {2, 2},
                {0, 0},
                {5, 5},
        };
    }


    @Test
    public void getKittensArgumentReturnsTheSame() {
        int actualKittens = feline.getKittens(kittens);
        assertEquals("Количество котят не равны", expectedKittens, actualKittens);
    }
}