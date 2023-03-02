package testscat;

import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestClassCat {
    @Mock
    Feline feline;

    @Test
    public void getFood() throws Exception {
        List<String> mockFoodList = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(mockFoodList);
        Cat cat = new Cat(feline);
        List<String> actualList = cat.getFood();

        assertEquals("List isn't equal", mockFoodList, actualList);
    }

    @Test
    public void getSoundReturnsCatSound() {
        Cat cat = new Cat(feline);
        String actual = cat.getSound();
        String expected = "Мяу";
        assertEquals("Sound not equal", expected, actual);
    }
}
